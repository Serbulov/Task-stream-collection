package task.book;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Management {
    private View view;
    private Scanner scanner;
    private IO io;
    private List<Book> books;

    public Management() {
        this.view = new View();
        this.scanner = new Scanner(System.in);
        this.io = new IO();
        this.books = new ArrayList<>();
    }
    //---------------------------------------------------CRUD-----------------------------------------------------------
    public void addNewBook() {
        view.printAddingANewBook();
        view.printId();
        int id = scanner.nextInt();
        scanner.nextLine();
        view.printTitle();
        String title = scanner.nextLine();
        view.printAuthor();
        String author = scanner.nextLine();
        view.printPublisher();
        String publisher = scanner.nextLine();
        view.printPublicationDate();
        int publicationDate = scanner.nextInt();
        scanner.nextLine();
        view.printNumberOfPages();
        int numberOfPages = scanner.nextInt();
        scanner.nextLine();
        view.printPrice();
        double price = scanner.nextDouble();
        Book book = new Book(id, title, author, publisher, publicationDate, numberOfPages, price);
        books.add(book);
    }

    public void showAllBook() {
        if (books.isEmpty()) {
            view.printListIsEmpty();
        } else {
            view.printListOfAllBooks();
            books.forEach(System.out::println);
        }
    }

    public void deleteBook() {
        if (books.isEmpty()) {
            view.printListIsEmpty();
        } else {
            view.printDeleteBook();
            view.printId();
            int id = scanner.nextInt();
            if (books.removeIf(b -> b.getId() == id)) {
                view.printBookHasBeenDeleted(id);
            } else {
                view.printBookNotFound(id);
            }
        }
    }
    //-----------------------------------------------Работа с файлами---------------------------------------------------
    public void saveListToFile() {
    }

    public void readFile() {
        view.printPath();
        String fileName = scanner.nextLine();
        List<Book> parseBook = io.readFromFile(fileName);
        books.addAll(parseBook);
    }

    //----------------------------------------------Сортировка----------------------------------------------------------
    public void sortedA() {     // a) список книг заданого автора в порядку зростання року видання;
        view.printAuthor();
        String author = scanner.nextLine();
        books.stream()
                .filter(b -> author.equals(b.getAuthor()))                  // Фильтруем
                .sorted(Comparator.comparing(Book::getPublicationDate))     // Сортируем
                .forEach(System.out::println);                              // Выводим
    }

    public void sortedB() {     // b) список книг, що видані заданим видавництвом;
        view.printPublisher();
        String publisher = scanner.nextLine();
        books.stream()
                .filter(b -> publisher.equals(b.getPublisher()))            // Фильтруем
                .forEach(System.out::println);                              // Выводим
    }

    public void sortedC() {     // c) список книг, що випущені після заданого року;
        view.printPublicationDate();
        int date = scanner.nextInt();
        scanner.nextLine();
        books.stream()
                .filter(b -> b.getPublicationDate() > date)                 // Фильтруем
                .sorted(Comparator.comparing(Book::getPublicationDate))     // Сортируем
                .forEach(System.out::println);                              // Выводим
    }

    public void sortedD() {     // d) список авторів в алфавітному порядку;
        view.listOfAuthors();
        books.stream()
                .sorted(Comparator.comparing(Book::getAuthor))              // Сортируем
                //.distinct()                                                 // Удаляем повторы ?????
                .forEach(b -> System.out.println(b.getAuthor()));           // Выводим
    }

    public void sortedE() {     // e) список видавництв, книги яких зареєстровані в системі без повторів;
        // ???????????????????????????
    }

    public void sortedF() {     // f) для кожного видавництва визначити список книг, виданих ним.
        view.printListOfBooksIssuedByThePublisher();
        view.printPublisher();
        String publisher = scanner.nextLine();
        books.stream()
                .filter(b -> publisher.equals(b.getPublisher()))            // Фильтруем
                .forEach(System.out::println);                              // Выводим
    }
}

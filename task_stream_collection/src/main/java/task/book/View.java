package task.book;

import java.util.Scanner;

public class View {
    Scanner scanner = new Scanner(System.in);

    //----------------------------------------------Главное меню--------------------------------------------------------
    public int menu() {
        String menu = "\n=================CRUD=================\n" +
                "1. Add new book\n" +
                "2. Show all book\n" +
                "3. Update book(Not implemented)\n" +
                "4. Delete book\n" +

                "\n==========Working with files==========\n" +
                "5. Save the list of books to a file\n" +
                "6. Read a list of books from a file\n" +

                "\n==========Sorting and output==========\n" +
                "7. List of books by a given author in ascending order of release year\n" +
                "8. List of books issued by the specified publisher\n" +
                "9. List of books published after the specified year\n" +
                "10. List of authors in alphabetical order\n" +
                "11. List of publishers whose books are registered in the system without repetitions\n" +
                "12. List of books issued by a specific publisher\n" +
                "\n0. Exit\n";
        System.out.println(menu);
        return scanner.nextInt();
    }

    //-------------------------------------------Меню добавления новой книги--------------------------------------------
    public void printAddingANewBook() {
        System.out.println("-----Adding a new book-----");
    }

    public void printId() {
        System.out.print("Id: ");
    }

    public void printTitle() {
        System.out.print("Title: ");
    }


    public void printAuthor() {
        System.out.print("Author: ");
    }

    public void printPublisher() {
        System.out.print("Publisher: ");
    }

    public void printPublicationDate() {
        System.out.print("Publication date: ");
    }

    public void printNumberOfPages() {
        System.out.print("Number of pages: ");
    }

    public void printPrice() {
        System.out.print("Price: ");
    }
    //------------------------------------------------------------------------------------------------------------------
    public void printListOfAllBooks() {
        System.out.println("-----List of all books-----");
    }

    public void printListIsEmpty() {
        System.out.println("!-----The list of books is empty.-----!");
    }

    public void printMethodNotImplemented() {
        System.out.println("Sorry, this feature is not available yet.\n" +
                "Please choose a different menu item.");
    }

    //--------------------------------------------Удаление книги--------------------------------------------------------
    public void printDeleteBook() {
        System.out.println("-----Delete book by id-----");
    }

    public void printBookHasBeenDeleted(int id) {
        System.out.println("Book with id " + id + " has been deleted");
    }

    public void printBookNotFound(int id) {
        System.out.println("Book with id " + id + " not found");
    }
    //----------------------------------------------Сортировки----------------------------------------------------------
    public void listOfAuthors() {
        System.out.println("-----List of authors in alphabetical order-----");
    }

    public void printListOfBooksIssuedByThePublisher() {
        System.out.println("-----List of books issued by the publisher-----");
    }
    //--------------------------------------------------IO--------------------------------------------------------------
    public void printPath() {
        System.out.println("File name: ");
    }
}

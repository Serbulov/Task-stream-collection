package task.book;

public class Book {
    private int id;
    private String title;
    private String author;
    private String publisher;
    private int publicationDate;
    private int numberOfPages;
    private double price;

    public Book(int id, String title, String author, String publisher, int publicationDate, int numberOfPages, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publicationDate = publicationDate;
        this.numberOfPages = numberOfPages;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(int publicationDate) {
        this.publicationDate = publicationDate;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  "id: " + id + " | " +
                "title: " + title + " | " +
                "author: " + author + " | " +
                "publisher: " + publisher + " | " +
                "publication date: " + publicationDate + " | " +
                "number of pages: " + numberOfPages + " | " +
                "price: " + price + " у.е.";
    }

    public static Book parseBook(String line) {
        String[] s = line.split(";");
        int id = Integer.parseInt(s[0]);
        String title = s[1];
        String author = s[2];
        String publisher = s[3];
        int publicationDate = Integer.parseInt(s[4]);
        int numberOfPages = Integer.parseInt(s[5]);
        double price = Double.parseDouble(s[6]);
        return new Book(id, title, author, publisher, publicationDate, numberOfPages, price);
    }
}

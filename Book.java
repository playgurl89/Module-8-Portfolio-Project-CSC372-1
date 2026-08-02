public class Book {

    // Member variables
    private int id;
    private String title;
    private String author;
    private String isbn;
    private int numberOfPages;

    // Default constructor
    public Book() {
        this.id = 0;
        this.title = "";
        this.author = "";
        this.isbn = "";
        this.numberOfPages = 0;
    }

    // Parameterized constructor
    public Book(int id, String title, String author, String isbn, int numberOfPages) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.numberOfPages = numberOfPages;
    }

    // Getter for ID
    public int getId() {
        return id;
    }

    // Setter for ID
    public void setId(int id) {
        this.id = id;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter for ISBN
    public String getIsbn() {
        return isbn;
    }

    // Setter for ISBN
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // Getter for number of pages
    public int getNumberOfPages() {
        return numberOfPages;
    }

    // Setter for number of pages
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    // Prints information about a book
    public void printBookInfo() {
        System.out.println("----------------------------------------");
        System.out.println("Book ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Number of Pages: " + numberOfPages);
        System.out.println("----------------------------------------");
    }
}
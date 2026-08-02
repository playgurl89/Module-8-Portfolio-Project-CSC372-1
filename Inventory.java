import java.util.ArrayList;

public class Inventory {

    // List of books currently available
    private ArrayList<Book> mainInventory;

    // List of books currently borrowed
    private ArrayList<Book> lendingInventory;

    // Constructor
    public Inventory() {
        mainInventory = new ArrayList<>();
        lendingInventory = new ArrayList<>();
    }

    // Adds a book to the main inventory
    public void addBook(Book book) {
        mainInventory.add(book);
        System.out.println("Book added to the library.");
    }

    // Borrows a book using its unique ID
    public boolean borrowBook(int id) {

        for (int i = 0; i < mainInventory.size(); i++) {

            Book book = mainInventory.get(i);

            if (book.getId() == id) {
                mainInventory.remove(i);
                lendingInventory.add(book);

                System.out.println("Book successfully borrowed.");
                return true;
            }
        }

        System.out.println("Book not found or is already borrowed.");
        return false;
    }

    // Returns a borrowed book using its unique ID
    public boolean returnBook(int id) {

        for (int i = 0; i < lendingInventory.size(); i++) {

            Book book = lendingInventory.get(i);

            if (book.getId() == id) {
                lendingInventory.remove(i);
                mainInventory.add(book);

                System.out.println("Book successfully returned.");
                return true;
            }
        }

        System.out.println("Book was not found in the lending inventory.");
        return false;
    }

    // Prints all books currently available
    public void printAll() {

        if (mainInventory.isEmpty()) {
            System.out.println("There are currently no books available.");
            return;
        }

        System.out.println("\n===== AVAILABLE BOOKS =====");

        for (Book book : mainInventory) {
            book.printBookInfo();
        }
    }

    // Searches for books by full or partial title
    public void searchByTitle(String title) {

        boolean found = false;

        for (Book book : mainInventory) {

            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                book.printBookInfo();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching book found.");
        }
    }

    // Returns the number of books currently available
    public int getMainInventoryCount() {
        return mainInventory.size();
    }

    // Returns the number of currently borrowed books
    public int getLendingInventoryCount() {
        return lendingInventory.size();
    }

    // Checks whether a book ID already exists
    public boolean bookIdExists(int id) {

        for (Book book : mainInventory) {
            if (book.getId() == id) {
                return true;
            }
        }

        for (Book book : lendingInventory) {
            if (book.getId() == id) {
                return true;
            }
        }

        return false;
    }
}
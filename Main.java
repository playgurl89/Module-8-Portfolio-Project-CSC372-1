import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Inventory library = new Inventory();

        // Add personalized books to the library
        library.addBook(new Book(
                1001,
                "Loving Motherhood",
                "Virginia Loving",
                "978-0-000-10001-1",
                286
        ));

        library.addBook(new Book(
                1002,
                "The Joys of Cooking with your Family",
                "Sam the Chef",
                "978-0-000-10002-8",
                342
        ));

        library.addBook(new Book(
                1003,
                "Outdoor Enthusiast",
                "JP Adventure",
                "978-0-000-10003-5",
                198
        ));

        library.addBook(new Book(
                1004,
                "Computer Nerd's Guide to the Universe",
                "Ryker Widell PhD",
                "978-0-000-10004-2",
                421
        ));

        library.addBook(new Book(
                1005,
                "Coding for Dummies",
                "James Gosling",
                "978-0-000-10005-9",
                512
        ));

        boolean running = true;

        System.out.println("\n========================================");
        System.out.println("       WELCOME TO THE JAVA LIBRARY");
        System.out.println("========================================");

        while (running) {

            // Display current inventory counts
            System.out.println("\nAvailable Books: "
                    + library.getMainInventoryCount());

            System.out.println("Borrowed Books: "
                    + library.getLendingInventoryCount());

            displayMenu();

            try {

                System.out.print("Enter your choice: ");
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {

                    case 1:
                        addBook(scanner, library);
                        break;

                    case 2:
                        borrowBook(scanner, library);
                        break;

                    case 3:
                        returnBook(scanner, library);
                        break;

                    case 4:
                        searchByTitle(scanner, library);
                        break;

                    case 5:
                        library.printAll();
                        break;

                    case 6:
                        running = false;
                        System.out.println("\nExiting the program. Goodbye!");
                        break;

                    default:
                        System.out.println(
                                "Invalid option. Please enter a number from 1 to 6."
                        );
                }

            } catch (NumberFormatException e) {

                System.out.println(
                        "Invalid input. Please enter a valid number."
                );
            }

            System.out.println();
        }

        scanner.close();
    }

    // Displays the main menu
    public static void displayMenu() {

        System.out.println("\n========== LIBRARY MENU ==========");
        System.out.println("1. Add Book");
        System.out.println("2. Borrow Book");
        System.out.println("3. Return Book");
        System.out.println("4. Search by Title");
        System.out.println("5. Print All Books");
        System.out.println("6. Exit");
        System.out.println("==================================");
    }

    // Adds a new book to the library
    public static void addBook(Scanner scanner, Inventory library) {

        try {

            System.out.print("Enter book ID: ");
            int id = Integer.parseInt(scanner.nextLine());

            if (library.bookIdExists(id)) {
                System.out.println(
                        "A book with that ID already exists."
                );
                return;
            }

            System.out.print("Enter book title: ");
            String title = scanner.nextLine();

            System.out.print("Enter author: ");
            String author = scanner.nextLine();

            System.out.print("Enter ISBN number: ");
            String isbn = scanner.nextLine();

            System.out.print("Enter number of pages: ");
            int numberOfPages = Integer.parseInt(scanner.nextLine());

            Book newBook = new Book(
                    id,
                    title,
                    author,
                    isbn,
                    numberOfPages
            );

            library.addBook(newBook);

        } catch (NumberFormatException e) {

            System.out.println(
                    "Invalid input. Book was not added."
            );
        }
    }

    // Borrows a book
    public static void borrowBook(
            Scanner scanner,
            Inventory library) {

        try {

            System.out.print("Enter the ID of the book to borrow: ");
            int id = Integer.parseInt(scanner.nextLine());

            library.borrowBook(id);

        } catch (NumberFormatException e) {

            System.out.println(
                    "Invalid book ID. Please enter a number."
            );
        }
    }

    // Returns a book
    public static void returnBook(
            Scanner scanner,
            Inventory library) {

        try {

            System.out.print("Enter the ID of the book to return: ");
            int id = Integer.parseInt(scanner.nextLine());

            library.returnBook(id);

        } catch (NumberFormatException e) {

            System.out.println(
                    "Invalid book ID. Please enter a number."
            );
        }
    }

    // Searches for a book by title
    public static void searchByTitle(
            Scanner scanner,
            Inventory library) {

        System.out.print("Enter a full or partial book title: ");
        String title = scanner.nextLine();

        library.searchByTitle(title);
    }
}
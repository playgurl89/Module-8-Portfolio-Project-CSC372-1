# Library Management System

A console-based library management system built in Java using object-oriented programming principles and `ArrayList` collections.

## Overview

This project was developed as the final portfolio project for CSC372-1 Programming II. It brings together concepts from throughout the course to create a complete, interactive Java application.

The system allows users to manage a small library collection by adding books, borrowing and returning books, searching for books, and viewing available inventory.

## Features

- Add books to the library inventory
- Borrow books and track lending status
- Return borrowed books
- Search for books by title
- Display available books
- Track available and borrowed inventory
- Validate user input
- Handle invalid requests and unavailable books
- Provide interactive menu-based navigation

## Project Structure

| File | Purpose |
|---|---|
| `Book.java` | Defines the `Book` object and stores book information |
| `Inventory.java` | Manages the library collection and lending operations |
| `Main.java` | Provides the interactive menu and runs the application |

## Technologies & Concepts

- Java
- Object-Oriented Programming
- Classes and Objects
- Encapsulation
- Constructors
- Getters and Setters
- `ArrayList`
- Loops
- Conditional Logic
- Exception Handling
- User Input
- Git & GitHub

## How the Application Works

The application presents the user with a menu of library management options.

Users can:

1. Add a new book to the inventory
2. View the library inventory
3. Search for a book by title
4. Borrow an available book
5. Return a borrowed book
6. Exit the application

The application tracks whether books are currently available or checked out and provides feedback when a requested action cannot be completed.

## How to Run

Clone the repository and navigate to the project directory.

Compile the Java files:

```bash
javac Book.java Inventory.java Main.java
```

Run the application:

```bash
java Main
```

Follow the menu prompts to interact with the library management system.

## Development & Version Control

Git and GitHub were used throughout development to track changes and manage the project's source code.

The application was developed incrementally, allowing functionality to be added, tested, and refined throughout the development process.

## What I Learned

This project provided an opportunity to bring multiple Java programming concepts together into a single application.

Key areas of development included:

- Designing multiple classes that work together
- Managing collections of objects with `ArrayList`
- Separating responsibilities between application components
- Implementing object-oriented programming principles
- Validating user input
- Handling application errors and invalid requests
- Testing and debugging application behavior
- Using Git and GitHub for version control

## Future Improvements

Potential future enhancements include:

- Persistent data storage
- User accounts and authentication
- Due dates and overdue tracking
- A graphical user interface
- Database integration
- Expanded search and filtering capabilities
- Book categories and filtering
- Improved reporting and inventory management

## Academic Context

Developed as a portfolio project for CSC372-1 Programming II through Colorado State University Online.

## Author

**Samantha Widell**

**Bachelor of Science in Computer Science**  
Colorado State University Online

Expected Graduation: 2028

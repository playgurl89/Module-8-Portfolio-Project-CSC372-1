# Module-8-Portfolio-Project-CSC372-1
Basic Library System in Java
# Module 8 Portfolio Project: Basic Library System in Java

## About This Project

For my final portfolio project in CSC372-1 Programming II, I created a basic library management system using Java. The goal of this project was to bring together many of the concepts I learned throughout the course and apply them to a practical program.

The library system allows users to add books, borrow and return books, search for books by title, and view all books that are currently available. I also added inventory tracking so the program displays how many books are currently available and how many have been borrowed.

## How It Works

The project is divided into three Java classes:

* **Book.java** - Creates the individual book objects and stores information including the book ID, title, author, ISBN, and number of pages.
* **Inventory.java** - Manages the available and borrowed books using `ArrayList` collections. It handles adding, borrowing, returning, and searching for books.
* **Main.java** - Runs the program and provides the interactive menu that allows the user to choose different library functions.

I added several book titles and authors that were personally meaningful or fun to include in the project, including books about motherhood, cooking, outdoor activities, and computer science.

## What I Learned

This project gave me the opportunity to apply several concepts from the course in one program. I used object-oriented programming, classes, objects, constructors, encapsulation, getters and setters, `ArrayList` collections, loops, conditional statements, user input, and exception handling.

I also practiced handling situations where a user might enter invalid information. For example, the program uses `try-catch` blocks to prevent invalid numerical input from causing the program to crash. The program also provides messages when a book cannot be found, when a user tries to borrow a book that is already borrowed, or when a book is returned that is not currently in the lending inventory.

## Version Control

I used Git and GitHub throughout the development of this project to practice version control. I first committed an initial working version of the library system and then made improvements to the inventory management and book borrowing and returning processes. I also tested the program multiple times to make sure the different operations worked as expected.

Using Git allowed me to see the progression of the project and keep track of changes as I improved the program.

## How to Run the Program

To compile the program, run:

```bash
javac Book.java Inventory.java Main.java
```

Then run the program with:

```bash
java Main
```

Once the program starts, the user can select an option from the menu to add, borrow, return, or search for books, print the available books, or exit the program.

## Project Purpose

This project was a way for me to bring together the programming concepts I learned throughout CSC372-1 and apply them to a complete Java application. It also gave me more experience with testing, debugging, improving code, and using GitHub to manage different versions of a project.

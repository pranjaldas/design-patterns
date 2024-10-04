package org.example.creational.prototype;
/**
 * The Prototype Design Pattern is a Creational pattern that allows you to clone existing objects instead of creating new ones from scratch.
 * This pattern is useful when the cost of creating a new object is high, and you want to create a new instance by copying the existing instance.
 * Key Points of Prototype Pattern:
 *  1. Prototype pattern is used when the cost of creating an object is expensive or complex.
 *  2. It involves creating new objects by copying (cloning) an already created instance.
 *  3. The primary interface Cloneable is used to indicate that an object can be cloned.
 */
// Step 1: Create a Book class that implements Cloneable.
class Book implements Cloneable {
    private String title;
    private String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Setters and Getters
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

    // Override the clone() method to create a copy of the Book object
    @Override
    protected Book clone() throws CloneNotSupportedException {
        return (Book) super.clone();
    }

    @Override
    public String toString() {
        return "Book [Title: " + title + ", Author: " + author + "]";
    }
}

// Step 2: Test the Prototype pattern
public class Prototype {
    public static void main(String[] args) {
        try {
            // Create an initial book instance
            Book originalBook = new Book("Design Patterns", "Erich Gamma et al.");

            // Clone the original book to create a new instance
            Book clonedBook = originalBook.clone();

            // Modify the cloned book's details
            clonedBook.setTitle("Effective Java");
            clonedBook.setAuthor("Joshua Bloch");

            // Print the details of the original and cloned book
            System.out.println("Original Book: " + originalBook);
            System.out.println("Cloned Book: " + clonedBook);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

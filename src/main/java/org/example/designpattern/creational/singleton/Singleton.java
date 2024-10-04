package org.example.creational.singleton;

public class Singleton {

    // Step 1: Create a private static instance of the class.
    private static Singleton instance;

    // Step 2: Make the constructor private to prevent instantiation.
    private Singleton() { }

    // Step 3: Provide a public static method to get the instance.
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(); // Lazy initialization
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello, this is a Singleton pattern example!");
    }
}

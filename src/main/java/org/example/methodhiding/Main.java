package org.example.methodhiding;

public class Main {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        Parent c1 = new Child();
        Child c2 = new Child();
        Parent.display();
        Child.display();

        // Here it is called method hiding because c1.display() will call the parent class display
        // method as, although we create object of child here, but we take reference of Parent
        p1.display();
        c1.display();

        c2.display();
    }
}

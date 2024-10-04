package org.example.designpattern.creational.builder;

/**
 * The Builder Pattern is a creational design pattern used to construct complex objects step-by-step. It separates the construction of an object from its representation,
 * allowing the same construction process to create different representation
 * This pattern is particularly useful when a class has many optional parameters or
 * when the process of creating an object is complex.
 */
// Product Class: House
class House {
    // Optional and mandatory attributes of the House
    private String foundation;
    private String structure;
    private String roof;
    private boolean hasGarden;
    private boolean hasGarage;
    private boolean hasSwimmingPool;

    // Private constructor to prevent direct object creation
    private House(HouseBuilder builder) {
        this.foundation = builder.foundation;
        this.structure = builder.structure;
        this.roof = builder.roof;
        this.hasGarden = builder.hasGarden;
        this.hasGarage = builder.hasGarage;
        this.hasSwimmingPool = builder.hasSwimmingPool;
    }

    // Getters for the attributes (no setters to maintain immutability)
    public String getFoundation() { return foundation; }
    public String getStructure() { return structure; }
    public String getRoof() { return roof; }
    public boolean hasGarden() { return hasGarden; }
    public boolean hasGarage() { return hasGarage; }
    public boolean hasSwimmingPool() { return hasSwimmingPool; }

    // Displaying the house configuration
    @Override
    public String toString() {
        return "House with foundation: " + foundation + ", structure: " + structure + ", roof: " + roof +
                ", garden: " + hasGarden + ", garage: " + hasGarage + ", swimming pool: " + hasSwimmingPool;
    }

    // Static Inner Builder Class
    public static class HouseBuilder {
        // Required attributes
        private String foundation;
        private String structure;
        private String roof;

        // Optional attributes
        private boolean hasGarden;
        private boolean hasGarage;
        private boolean hasSwimmingPool;

        // Builder constructor for required attributes
        public HouseBuilder(String foundation, String structure, String roof) {
            this.foundation = foundation;
            this.structure = structure;
            this.roof = roof;
        }

        // Methods for optional attributes
        public HouseBuilder setGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public HouseBuilder setGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public HouseBuilder setSwimmingPool(boolean hasSwimmingPool) {
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        // Build method to construct the final House object
        public House build() {
            return new House(this);
        }
    }
}

// Client Code to Use the Builder Pattern
public class Builder {
    public static void main(String[] args) {
        // Using the builder to construct a house with a garden and garage but no swimming pool
        House house1 = new House.HouseBuilder("Concrete Foundation", "Wooden Structure", "Metal Roof")
                .setGarden(true)
                .setGarage(true)
                .build();

        // Using the builder to construct a house with all features
        House house2 = new House.HouseBuilder("Stone Foundation", "Brick Structure", "Concrete Roof")
                .setGarden(true)
                .setGarage(true)
                .setSwimmingPool(true)
                .build();

        // Display the built houses
        System.out.println("House 1: " + house1);
        System.out.println("House 2: " + house2);

        org.example.creational.builder.Computer c1 = new org.example.creational.builder.Computer.ComputerBuilder()
                .setCpu("Intel")
                .setRom(1)
                .setGraphics(3)
                .setRam(4)
                .build();

        org.example.creational.builder.Computer c2 = new org.example.creational.builder.Computer.ComputerBuilder()
                .setCpu("Intel")
                .setRom(1)
                .build();

        // Display the built houses
        System.out.println("Computer 1: " + c1);
        System.out.println("Computer 2: " + c2);

    }
}

package automobile;
// Module 6 CTA
// Option #1: Automobile Inventory
// CSC320 - Programming I, Dr. Terrell Brandes
public class Automobile {
    // Vehicle attributes
    private String make;
    private String model;
    private String color;
    private int year;
    private int mileage;

    // Default constructor
    public Automobile() {}

    // Constructor with parameters
    public Automobile(String make, String model, String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
        } catch (Exception e) {
            System.out.println("Error initializing automobile: " + e.getMessage());
        }
    }

    // Method to add a new vehicle
    public String addVehicle(String make, String model, String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
            return "Vehicle added to inventory.";
        } catch (Exception e) {
            return "Failed to add vehicle: " + e.getMessage();
        }
    }

    // Method to list vehicle details
    public String[] listVehicleInfo() {
        try {
            return new String[] {
                    "Make: " + make,
                    "Model: " + model,
                    "Color: " + color,
                    "Year: " + year,
                    "Mileage: " + mileage
            };
        } catch (Exception e) {
            return new String[] { "Failed to list vehicle info: " + e.getMessage() };
        }
    }

    // Method to clear all vehicle data
    public String removeVehicle() {
        try {
            make = model = color = null;
            year = mileage = 0;
            return "Vehicle removed from inventory.";
        } catch (Exception e) {
            return "Failed to remove vehicle: " + e.getMessage();
        }
    }

    // Method to update vehicle attributes
    public String updateVehicle(String make, String model, String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
            return "Vehicle information updated.";
        } catch (Exception e) {
            return "Failed to update vehicle: " + e.getMessage();
        }
    }
}
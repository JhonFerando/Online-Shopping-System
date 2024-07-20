public class Electronics extends Product {
    private String brand;
    private int warrantyPeriod; // warranty period in months

    // Constructor for initializing an Electronics object
    public Electronics(String productId, String productName, int numberOfItems, double price, String brand, int warrantyPeriod) {
        // Call the constructor of the superclass (Product) to initialize common attributes
        super(productId, productName, numberOfItems, price);
        // Initialize specific attributes for Electronics
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }

    // Getter method for retrieving the brand of the electronics
    public String getBrand() {
        return brand;
    }

    // Getter method for retrieving the warranty period of the electronics
    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    // Override toString method to provide a string representation of the Electronics object
    @Override
    public String toString() {
        // Utilize the superclass's toString method to get basic product details
        // Append brand and warranty period information specific to electronics
        return super.toString() + ", Brand: " + brand + ", Warranty Period: " + warrantyPeriod + " months";
    }
}
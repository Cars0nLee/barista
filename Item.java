public class Item {
    // Member variables
    private String name;
    private double price;

    // Constructor
    public Item(){}

    // Overloaded constructor
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getter
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}

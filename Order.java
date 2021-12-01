import java.util.ArrayList;

public class Order {
    // Member variables
    private String name;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList<Item>();

    // Constructor
    public Order(){}

    public Order(String name) {
        this.name = name;
    }

    // Methods
    public void addItem(Item item) {
        items.add(item);
    }
    public void getStatusMessage(boolean ready) {
        if(ready == true) {
            System.out.println("Your order is ready.");
        }
        else {
            System.out.println("Thank you for waiting.");
        }
    }
    public double orderTotal() {
        double total = 0.0;
        for(Item i: items) {
            total += i.getPrice();
        }
        return total;
    }
    public void display() {
        System.out.println("Customer Name: " + name);
        for(Item i: items) {
            System.out.println(i.getName()  + " $" + i.getPrice() + "0");
        }
        System.out.println("Total: $" + orderTotal());
    }

    // Getter
    public String getName() {
        return name;
    }
    public boolean getReady() {
        return ready;
    }
    public ArrayList<Item> getItems() {
        return items;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }
    public void setReady(boolean ready) {
        this.ready = ready;
    }
    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
}

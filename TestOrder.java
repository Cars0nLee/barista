public class TestOrder {
    public static void main(String[] args){
        // Menu Items
        Item item1 = new Item("Mocha", 4.50);
        Item item2 = new Item("Drip coffee", 2.50);
        Item item3 = new Item("Latte", 5.50);
        Item item4 = new Item("Cappucino", 5.50);

        // Orders, unspecified guests
        Order order1 = new Order();
        Order order2 = new Order();

        // Orders, overloaded
        Order order3 = new Order("Cam");
        Order order4 = new Order("Bob");
        Order order5 = new Order("Tom");

        // Add
        order1.addItem(item1);
        order1.addItem(item2);
        order1.addItem(item4);
        order2.addItem(item3);
        order2.addItem(item4);
        order3.addItem(item1);
        order3.addItem(item3);
        order4.addItem(item4);
        order4.addItem(item2);
        order5.addItem(item2);
        order5.addItem(item3);

        // Order status
        order1.getStatusMessage(true);
        order2.getStatusMessage(false);

        // Total
        System.out.println("Total: $" + order1.orderTotal());
        System.out.println("Total: $" + order2.orderTotal());
        System.out.println("Total: $" + order3.orderTotal());
        System.out.println("Total: $" + order4.orderTotal());
        System.out.println("Total: $" + order5.orderTotal());

        // Display
        order1.display();
        order5.display();
    }
}

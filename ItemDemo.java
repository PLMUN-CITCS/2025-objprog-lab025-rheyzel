// Item class definition
class Item {
    // Static variable to count the number of objects created
    static int objectCount = 0;

    // Instance variable for the item name
    String itemName;

    // Constructor to initialize the itemName and increment the objectCount
    public Item(String itemName) {
        this.itemName = itemName;
        objectCount++; // Increment the static objectCount whenever a new object is created
    }

    // Static method to display the total number of objects created
    public static void displayObjectCount() {
        System.out.println("Total objects created: " + objectCount);
    }

    // Instance method to display the name of the item
    public void displayItem() {
        System.out.println("Item: " + itemName);
    }
}

public class ItemDemo {
    public static void main(String[] args) {
        // Creating Item objects
        Item item1 = new Item("Laptop");
        Item item2 = new Item("Smartphone");
        Item item3 = new Item("Tablet");

        // Calling instance methods to display item names
        item1.displayItem();
        item2.displayItem();
        item3.displayItem();

        // Calling the static method to display the total count of created objects
        Item.displayObjectCount();
    }
}


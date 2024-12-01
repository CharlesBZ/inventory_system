import java.util.ArrayList;

public class Inventory {
    //ArrayList can store objects, regular arrays can't
    private ArrayList<Item> items; //private attributes

    // Constructor
    public Inventory() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    //method overloading addItem
    public void addItem(String name, int quantity, String type) {
        items.add(new Fruit(name, quantity, type));
    }

    public void addItem(String name, int quantity, int damage, String type) {
        items.add(new Weapon(name, quantity, damage, type));
    }

    //for-each loop that iterates through a collection of Item
    public void displayInventory() {
        for (Item item : items) {
            item.displayInfo();
        }
    }

    // overloading method displayInventory()
    public void displayInventory(String type) {
        for (Item item : items) {
            if (item instanceof Fruit && ((Fruit) item).getType().equalsIgnoreCase(type)) {
                System.out.println(item.toString());
            } else if (item instanceof Weapon && ((Weapon) item).getType().equalsIgnoreCase(type)) {
                System.out.println(item.toString());
            }
        }
    }
}

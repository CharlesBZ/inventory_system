public class Main {
    public static void main(String[] args) throws Exception {
        Inventory inventory = new Inventory();

        // Item item = new Item("Generic Item", 10);// instace of item
        // Fruit fruit = new Fruit("Apple", 20, "Jonagold"); // instace of fruit
        // Weapon weapon = new Weapon("Wood Sword", 1, 5, "Melee"); // instace of weapon
        // inventory.addItem(item);
        inventory.addItem("Apple", 20, "Jonagold");
        inventory.addItem("Wood Sword", 1, 5, "Melee");

        inventory.displayInventory();
        // inventory.displayInventory("Jonagold");
    }
}

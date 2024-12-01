public abstract class Item {
    private String name;
    private int quantity;

    public Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    //Need getters to access private objects
    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    //abstract method
    public abstract void displayInfo();
}

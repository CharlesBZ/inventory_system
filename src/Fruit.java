public class Fruit extends Item implements ItemStuff {
    //Item is superclass, Fruit is the subclass to Item
    //Fruit inherits attributes and methods from Item
    //implements can implement a lot of stuff, extends can only extend one class
    //Another way Fruit extends Item implements ItemStuff

    //attributes
    private String name;
    private int quantity;
    private String type; // Apple, orange, banana, blueberry etc..

    public Fruit(String name, int quantity, String type) {
        super(name, quantity);
        this.name = name;
        this.quantity = quantity;
        this.type = type;
    }

    @Override
    public String getName() { 
        return name; 
    }

    @Override
    public int getQuantity() { 
        return quantity; 
    }

    public String getType() { 
        return type; 
    }

    @Override
    public void displayInfo() {
        System.out.println("Fruit: " + getName() + ", Quantity: " + getQuantity() + ", Type: " + getType());
    }

}

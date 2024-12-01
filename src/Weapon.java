public class Weapon extends Item implements ItemStuff {
    //Item is superclass, Weapon is the subclass to Item
    //Weapon inherits attributes and methods from Item
    //implements can implement a lot of stuff, extends can only extend one class

    //attributes
    private String name;
    private int quantity;
    private int damage;
    private String type; // Melee, Ranged, Magic etc..

    public Weapon(String name, int quantity, int damage, String type) {
        super(name, quantity);
        this.name = name;
        this.quantity = quantity;
        this.damage = damage;
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

    public int getDamage() {
        return damage;
    }

    public String getType() {
        return type;
    }

    @Override
    public void displayInfo() {
        System.out.println("Weapon: " + getName() + ", Quantity: " + getQuantity() + ", Damage: " + getDamage() + ", Type: " + getType());
    }
}

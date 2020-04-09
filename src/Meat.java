public class Meat {

    private String name;
    private double price;

    public Meat(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class MeatBeef extends Meat {
    public MeatBeef() {
        super("Beef", 2.35);
    }
}

class MeatChicken extends Meat {
    public MeatChicken() {
        super("Chicken", 1.78);
    }
}
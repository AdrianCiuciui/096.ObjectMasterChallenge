public class Bread {

    private String name;
    private double price;

    public Bread(String name) {
        this.name = name;
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

class BreadWhite extends Bread {
    public BreadWhite() {
        super("White Bread");
        super.setPrice(0.11);
    }
}

class BreadBrown extends Bread {
    public BreadBrown() {
        super("Brown Bread");
        super.setPrice(0.65);

    }
}

class BreadCrispy extends Bread {
    public BreadCrispy() {
        super("Crispy Bread");
        super.setPrice(0.48);
    }
}
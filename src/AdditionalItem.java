public class AdditionalItem {

    private String name;
    private double price;

    public AdditionalItem(String name, double price) {
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

class DrinkJuice  extends AdditionalItem {

    public DrinkJuice() {
        super("Juice", 0.5);
    }
}

class DrinkWater extends AdditionalItem {
    public DrinkWater() {
        super("Water", 0.2);
    }
}

class FoodSalad extends AdditionalItem {
    public FoodSalad() {
        super("Salad", 0.1);
    }
}

class FoodFries extends AdditionalItem {
    public FoodFries() {
        super("Fries", 0.4);
    }
}

class FoodOnion extends AdditionalItem {
    public FoodOnion() {
        super("Onion", 0.08);
    }
}

class FoodEgg extends AdditionalItem {
    public FoodEgg() {
        super("Egg", 0.35);
    }
}

class FoodTomatoes extends AdditionalItem {
    public FoodTomatoes() {
        super("Tomatoes", 0.21);
    }
}

class FoodCarrot extends AdditionalItem {
    public FoodCarrot() {
        super("Carrots", 0.22);
    }
}
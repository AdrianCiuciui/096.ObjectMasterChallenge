public class BurgerDeluxe extends  Burger{

    public BurgerDeluxe() {
        super(new BreadWhite(), new MeatBeef(), new DrinkJuice(), new FoodFries(),null, null);
        setName("Deluxe Burger");
        setBreadType(chooseBread(1));
        setMeatType(chooseMeat(1));
        setAddItem1(chooseItem("juice"));
        setAddItem2(chooseItem("fries"));
        setPrice(3.33);
    }

    @Override
    public void WhatYouOrdered() {
        System.out.println("You have ordered the following: A " + this.getName() + " that has "
                + this.getMeatType().getName() + " meat, " + this.getBreadType().getName() + ","
                + " and the following additions: " + this.getAddItem1().getName() + ", " + this.getAddItem2().getName() + ".");
    }

    public AdditionalItem chooseItem(String item) {
        switch (item) {
            case "juice" : return new DrinkJuice();//drink
            case "fries":  return new FoodFries();// fries
            default: return null;
        }
    }

    @Override
    public double getPriceTotal() {
        return (getMeatType().getPrice() + getBreadType().getPrice() + getAddItem1().getPrice() + getAddItem2().getPrice());
    }
}
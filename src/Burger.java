import java.util.Scanner;

public class Burger {

    private String name;
    private Bread breadType;
    private Meat meatType;
    private AdditionalItem addItem1;
    private AdditionalItem addItem2;
    private AdditionalItem addItem3;
    private AdditionalItem addItem4;
    private double price;

    public Burger() {
        this.name = "Custom Burger";
    }

    public Burger(Bread breadType, Meat meatType, AdditionalItem addItem1, AdditionalItem addItem2,
                  AdditionalItem addItem3, AdditionalItem addItem4) {
        this.name = "Custom Burger";
        this.breadType = breadType;
        this.meatType = meatType;
        this.addItem1 = addItem1;
        this.addItem2 = addItem2;
        this.addItem3 = addItem3;
        this.addItem4 = addItem4;
        this.price = 0;
    }

    public void chooseBread () {
        System.out.println("Choose bread type: 1." + new BreadWhite().getName() + ", 2." + new BreadBrown().getName() +
                ", 3." + new BreadCrispy().getName() + ".");
    }

    public Bread chooseBread (int x){
        switch (x) {
            case 1: return new BreadWhite ();
            case 2: return new BreadBrown ();
            case 3: return new BreadCrispy();
            default: return null;
        }
    }

    public void chooseMeat () {
        System.out.println("Choose meat type: 1." + new MeatBeef().getName() + " 2." + new MeatChicken().getName());
    }

    public Meat chooseMeat (int x) {
        switch (x) {
            case 1: return new MeatBeef();
            case 2: return new MeatChicken();
            default: return null;
        }
    }

    public void chooseItem (int count) {
        System.out.println("Choose " + count + " items from the following list: " +
                "1." + new DrinkJuice().getName() + ", " + "2." + new DrinkWater() + ", 3." + new FoodCarrot().getName() + ", " +
                "4." + new FoodEgg().getName() + ", " + "5." + new FoodFries().getName() + ", 6." + new FoodOnion().getName() + ", " +
                "7." + new FoodSalad().getName() + ", 8." + new FoodTomatoes().getName());
    }
    public AdditionalItem chooseItem () {
        Scanner scannerItems = new Scanner(System.in);
        int x = scannerItems.nextInt();         System.out.println();
        switch (x) {
            case 1: return new DrinkJuice();//drink
            case 2: return new DrinkWater();// water
            case 3: return new FoodCarrot();// carrot
            case 4: return new FoodEgg();// egg
            case 5: return new FoodFries();// fries
            case 6: return new FoodOnion();// onion
            case 7: return new FoodSalad();// salad
            case 8: return new FoodTomatoes();// tomatoes
            default: {
                System.out.println("item not in list. will add null");
                return null;
            }
        }
    }

    public void WhatYouOrdered () {
        System.out.println("You have ordered the following: A " + this.getName()
                + " that has " + this.getMeatType().getName() + " meat, "
                + this.getBreadType().getName() + " and the following additions: "
                + this.addItem1.getName() + ", " + this.addItem2.getName() + ", "
                + this.addItem3.getName() + ", " + this.addItem4.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPriceMeatBread() {
        return (meatType.getPrice() + breadType.getPrice());
    }

    public double getPriceTotal() {
        return (  meatType.getPrice() + breadType.getPrice() + addItem1.getPrice() + addItem2.getPrice() + addItem3.getPrice() + addItem4.getPrice());
    }

    public void getTotal () {
        System.out.println("The price of the meat and bread is " + this.getPriceMeatBread() + " and the additions are " + Math.floor ((this.getPriceTotal() - this.getPriceMeatBread()) * 100) / 100 +
                ".\n" + "TOTAL price of the " + this.getName() + " is " + Math.floor(this.getPriceTotal() * 100) / 100 + "\n");

    }

    public void setPrice (double price) {
        this.price = price;
    }

    public Bread getBreadType() {
        return breadType;
    }

    public void setBreadType(Bread breadType) {
        this.breadType = breadType;
    }

    public Meat getMeatType() {
        return meatType;
    }

    public void setMeatType(Meat meatType) {
        this.meatType = meatType;
    }

    public AdditionalItem getAddItem1() {
        return addItem1;
    }

    public void setAddItem1(AdditionalItem addItem1) {
        this.addItem1 = addItem1;
    }

    public AdditionalItem getAddItem2() {
        return addItem2;
    }

    public void setAddItem2(AdditionalItem addItem2) {
        this.addItem2 = addItem2;
    }

    public AdditionalItem getAddItem3() {
        return addItem3;
    }

    public void setAddItem3(AdditionalItem addItem3) {
        this.addItem3 = addItem3;
    }

    public AdditionalItem getAddItem4() {
        return addItem4;
    }

    public void setAddItem4(AdditionalItem addItem4) {
        this.addItem4 = addItem4;
    }
}
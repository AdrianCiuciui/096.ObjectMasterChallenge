public class BurgerHealthy extends Burger {

    private AdditionalItem additionalItem5;
    private AdditionalItem additionalItem6;

    public BurgerHealthy() {
        setName("Healthy Burger");
        setPrice(1.11);
    }

    public BurgerHealthy(Meat meatType, AdditionalItem addItem1, AdditionalItem addItem2, AdditionalItem addItem3, AdditionalItem addItem4, AdditionalItem additionalItem5, AdditionalItem additionalItem6) {
        super( new BreadBrown(), meatType, addItem1, addItem2, addItem3, addItem4);
        this.additionalItem5 = additionalItem5;
        this.additionalItem6 = additionalItem6;
    }

    @Override
    public void WhatYouOrdered() {
        System.out.println("You have ordered the following: A " + this.getName() + " that has " + this.getMeatType().getName() + " meat, "
                + this.getBreadType().getName() + ", " + "and the following additions: "
                + getAddItem1().getName() + ", " + this.getAddItem2().getName() + ", " + this.getAddItem3().getName() + ", " +
                this.getAddItem4().getName() + "." + this.getAdditionalItem5().getName() + ", " + this.getAdditionalItem6().getName() + ".");
    }

    public AdditionalItem getAdditionalItem5() {
        return additionalItem5;
    }

    public void setAdditionalItem5(AdditionalItem additionalItem5) {
        this.additionalItem5 = additionalItem5;
    }

    public AdditionalItem getAdditionalItem6() {
        return additionalItem6;
    }

    public void setAdditionalItem6(AdditionalItem additionalItem6) {
        this.additionalItem6 = additionalItem6;
    }
}

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Do you wish to make a new burger order?\nType 1 for a new order, 2 to exit");
            int x = scanner.nextInt();             System.out.println();
            if (x == 2) {
                System.out.println("Application will close. Goodbye and bon apetit");
                break;
            }

            System.out.println("Please choose the type of burger you want from the ones available: 1. " + new Burger().getName() + ", 2. " +
            new BurgerDeluxe().getName() + ", 3. " + new BurgerHealthy().getName() + ". Input 0 to exit.");
            x = scanner.nextInt();             System.out.println();
            if (x == 0) break;
            else
                switch (x) {
                case 1: {// pick burger
                    System.out.println("CUSTOM BURGER");
                    Burger burger = new Burger();
                    burger.chooseMeat();
                    x = scanner.nextInt();             System.out.println();
                    burger.setMeatType(burger.chooseMeat(x));

                    burger.chooseBread();
                    x = scanner.nextInt();             System.out.println();
                    burger.setBreadType( burger.chooseBread(x));

                    burger.chooseItem(4);
                    for (int i = 1; i < 5; i++) {
                        if (i == 1) burger.setAddItem1(burger.chooseItem());
                        if (i == 2) burger.setAddItem2(burger.chooseItem());
                        if (i == 3) burger.setAddItem3(burger.chooseItem());
                        if (i == 4) burger.setAddItem4(burger.chooseItem());
                    }
                    burger.WhatYouOrdered();
                    burger.getTotal();
                    break;
                }
                case 2: {// deluxe burger
                    BurgerDeluxe burgerD = new BurgerDeluxe();
                    System.out.println("DELUXE");

                    burgerD.WhatYouOrdered();
                    burgerD.getTotal();
                    break;
                }
                case 3: {// healthy burger
                    System.out.println("HEALTHY BURGER");
                    BurgerHealthy burgerH = new BurgerHealthy();

                    burgerH.chooseMeat();
                    x = scanner.nextInt();             System.out.println();
                    burgerH.setMeatType(burgerH.chooseMeat(x));

                    burgerH.setBreadType( burgerH.chooseBread(2));

                    burgerH.chooseItem(6);
                    for (int i = 1; i < 7; i++) {
                        if (i == 1) burgerH.setAddItem1(burgerH.chooseItem());
                        if (i == 2) burgerH.setAddItem2(burgerH.chooseItem());
                        if (i == 3) burgerH.setAddItem3(burgerH.chooseItem());
                        if (i == 4) burgerH.setAddItem4(burgerH.chooseItem());
                        if (i == 5) burgerH.setAdditionalItem5(burgerH.chooseItem());
                        if (i == 6) burgerH.setAdditionalItem6(burgerH.chooseItem());
                    }
                    burgerH.WhatYouOrdered();
                    burgerH.getTotal();
                break;
                }
                default: break;
            }
        }
        scanner.close();
    }
}
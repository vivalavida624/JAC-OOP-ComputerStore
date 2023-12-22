package Assignment01;

import java.util.Objects;
import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {

//        final String PASSWORD = "PASSWORD";
        int selection = 0;
        String brand, model;
        double price = 0;
//
        Scanner scanner = new Scanner(System.in);
//        System.out.println("=======Welcome to Computer Store=======");
//        System.out.println("Enter the maximum number of computer to store");
//        int maxComputer = scanner.nextInt();
//        Computer[] inventory = new Computer[maxComputer];

        int maxComputer = 3;
        System.out.println("OK, your store can maximum contain " + 10 + " computers");


        Computer[] inventory = new Computer[maxComputer];


//        Menu.display();

//        int selection = scanner.nextInt();

        do {
            Menu.mainMenu();
            selection = scanner.nextInt();
            if (selection < 1 || selection > 5)
                System.out.println("Please enter 1 to 5, other input is invalid");

            switch (selection) {
                case 1:
                    System.out.println("case 1");
                    Store.inputData(inventory);
                    break;
                case 2:
                    System.out.println("case 2");
                    updateData(inventory);
                    break;
                case 3:
                    System.out.println("case 3");
                    Store.searchByBrand(inventory);
                    break;
                case 4:
                    System.out.println("case 4");
                    Store.searchByPrice(inventory);
                    break;
                case 5:
                    System.out.println("Exit the program, Bye.");
                    System.exit(0);

            }

        } while (selection > 1 || selection < 5);

        System.out.println("selection is: " + selection);
    }

    public static void updateData(Computer[] inventory) {

        if (Store.verifyPassword()) {
            Menu.updateMenu();

            int index = 2;

            if (inventory[index] == null) {
                System.out.println("This position is empty, will go back to main menu");
                System.out.println();
            } else {
                System.out.println(inventory[2]);
            }



        } else {
            System.out.println("Sorry, you entered invalid password");
            System.out.println();
            return;
        }


    }





}


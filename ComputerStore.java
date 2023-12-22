package Assignment01;

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
                    inputData(inventory);
                    break;
                case 2:
                    System.out.println("case 2");
                    updateData(inventory);
                    break;
                case 3:
                    System.out.println("case 3");
                    searchByBrand(inventory);
                    break;
                case 4:
                    System.out.println("case 4");
                    searchByPrice(inventory);
                    break;
                case 5:
                    System.out.println("Exit the program, Bye.");
                    System.exit(0);

            }

        } while (selection > 1 || selection < 5);

        System.out.println("selection is: " + selection);
    }

    public static void inputData(Computer[] inventory) {
        Scanner scanner = new Scanner(System.in);

        // fack date
        Computer computer0 = new Computer("Apple", "Mac", 1999);
        Computer computer1 = new Computer("Apple", "Station", 2999);
        Computer computer2 = new Computer("Apple", "Frame", 2999);
        inventory[0] = computer0;
        inventory[1] = computer1;
        inventory[2] = computer2;
        System.out.println("3 computers date inputted");

//      for (int i = 0; i < inventory.length; i++) {
//          System.out.println("===Input the computer Data===");
//          System.out.println("Enter the brand");
//          String brand = scanner.next();
//          System.out.println("Enter the model");
//          String model = scanner.next();
//          System.out.println("Enter the price");
//          double price = scanner.nextDouble();
//
//          Computer computer = new Computer(brand, model, price);
//          inventory[i] = computer;
//      }
    }

    public static void updateData(Computer[] inventory) {

        if (verifyPassword()) {
            int index = 2;

            if (inventory[index] == null) {
                System.out.println("This position is empty, will go back to main menu");
                System.out.println();
            } else {
                System.out.println(inventory[2]);
            }

            Menu.updateComputer(inventory, index);

        } else {
            System.out.println("Sorry, you entered invalid password");
            System.out.println();
            return;
        }


    }

    public static void searchByBrand(Computer[] inventory) {
//      Scanner scanner = new Scanner(System.in);
//      System.out.println("Which brand do you want to search");
//      String brand = scanner.next();
        String brand = "Apple";
        System.out.println("=====searchByBrand=====");
        for (int i = 0; i < inventory.length; i++) {
            if (brand == inventory[i].getBrand())
                System.out.println(inventory[i]);
        }
        System.out.println("=====searchByBrand=====");
        System.out.println();

    }

    public static void searchByPrice(Computer[] inventory) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the price you want to search");
        double price = scanner.nextDouble();

        System.out.println("=====searchByPrice=====");
        for (int i = 0; i < inventory.length; i++) {
            if (price == inventory[i].getPrice())
                System.out.println(inventory[i]);
        }
        System.out.println("=====searchByPrice=====");
        System.out.println();

        scanner.close();
    }

    public static boolean verifyPassword() {

        final String PASSWORD = "password";
        int wrongAttempt = 0;

        Scanner scanner = new Scanner(System.in);

        while (wrongAttempt < 3) {
            System.out.println("Enter your password");
            String password = scanner.next();
            if (PASSWORD == password) {
                System.out.println("valid password, successful login");
                break;
            } else {
                System.out.println("invalid password, try again");
                wrongAttempt++;
            }
        }

        scanner.close();

        if (wrongAttempt >= 3) {
            System.out.println("over wrong limit counter");
        }

        return false;
    }
}


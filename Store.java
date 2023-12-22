package Assignment01;

import java.util.Objects;
import java.util.Scanner;

public class Store {
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
    public static boolean verifyPassword() {

        final String PASSWORD = "password";
        int wrongAttempt = 0;

        Scanner scanner = new Scanner(System.in);

        while (wrongAttempt < 3) {
            System.out.println("Enter your password");
            String password = scanner.next();
            if (PASSWORD.equals(password) ) {
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
            return false;
        }

        return true;
    }
    public static void searchByBrand(Computer[] inventory) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which brand do you want to search");
        String brand = scanner.next();
//        String brand = "Apple";
        System.out.println("=====searchByBrand=====");
        for (int i = 0; i < inventory.length; i++) {
            if (Objects.equals(brand, inventory[i].getBrand()))
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
}

package Assignment01;

import java.util.Scanner;

public class Menu {



    public static void mainMenu(){
        System.out.println("======Main Menu======");
        System.out.println("Select your option");
        System.out.println("1. Enter new computers (password required)");
        System.out.println("2. Change information of a computer (password required)");
        System.out.println("3. Display all computers by a specific brand");
        System.out.println("4. Display all computers under a certain a price");
        System.out.println("5. Quit");
        System.out.println("Please enter your choice");
    }

    public static void updateMenu(){
        System.out.println("======Update Menu======");
        System.out.println("What information would like to change?");
        System.out.println("1. brand");
        System.out.println("2. model");
        System.out.println("3. SN");
        System.out.println("4. price");
        System.out.println("5. Quit");
    }


    public static void updateComputer(Computer[] inventory, int index){
        Scanner scanner = new Scanner(System.in);
        int selection = 0;

        do {
            Menu.updateMenu();
            selection = scanner.nextInt();
            if (selection < 1 || selection > 5)
                System.out.println("Please enter 1 to 5, other input is invalid");

            switch (selection) {
                case 1:
                    System.out.println("case 1");
                    String brand = scanner.next();
                    inventory[index].setBrand(brand);
                    System.out.println(inventory[index]);
                    break;
                case 2:
                    System.out.println("case 2");
                    String model = scanner.next();
                    inventory[index].setModel(model);
                    System.out.println(inventory[index]);
                    break;
                case 3:
                    System.out.println("case 3");
                    long SN = scanner.nextLong();
                    inventory[index].setSerialNumber(SN);
                    System.out.println(inventory[index]);
                    break;
                case 4:
                    System.out.println("case 4");
                    double price = scanner.nextDouble();
                    inventory[index].setPrice(price);
                    System.out.println(inventory[index]);
                    break;
                case 5:
                    System.out.println("Exit the update program, Bye.");
                    System.exit(0);

            }

        }while (selection > 1 || selection < 5) ;

        System.out.println("selection is: " + selection);
    }
}

package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter how many item you wish your Sharing Catalogue should hold:");
        Catalogue catalogue = new Catalogue(scanner.nextInt());

        boolean run = true;
        while (run) {
            System.out.println("\nWhat would you like?");
            System.out.println("1. Se the whole catalogue");
            System.out.println("2. Se what is available");
            System.out.println("3. Create items to borrow");
            System.out.println("4. Borrow item");
            System.out.println("5. Return item");
            System.out.println("9. Quit");
            // Read user choice
            int choice = scanner.nextInt();
            scanner.nextLine(); //Scannerbug fix
            if (choice == 1) { // get all items in cataloque
                Item[] allItems = catalogue.getFullList();
                for (int i = 0; i < allItems.length; i++) {
                    System.out.println(allItems[i]);
                }
            } else if (choice == 2) { // get available items in cataloque
                Item[] availableItems = catalogue.getAvailableItems();
                for (int i = 0; i < availableItems.length; i++) {
                    System.out.println(availableItems[i]);
                }
            } else if (choice == 3) { // Add new Item to catalogue
                System.out.println("Please enter the item you wish to add:");
                String object = scanner.nextLine();
                System.out.println("Please enter the category the item should be added as:");
                String category = scanner.nextLine();
                catalogue.addItem(new Item(category, object));
            } else if (choice == 4) { // make item unavailable
                System.out.println("Please type the item you wish to borrow:");
                String item = scanner.nextLine();
                Item found = catalogue.findItem(item);
                catalogue.borrowItem(found);
            } else if (choice == 5) { // make item available again
                System.out.println("Please type the item you wish to return:");
                String item = scanner.nextLine();
                Item found = catalogue.findItem(item);
                catalogue.returnItem(found);
            } else if (choice == 9) { //Quit Program
                run = false;
            } else { // invalid choice
                System.out.println("Invalid input");
            }
        }
    }
}

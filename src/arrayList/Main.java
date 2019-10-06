package arrayList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GroceryList gl = new GroceryList();
        boolean quit = false;
        while (!quit) {
            gl.printingInstructions();
            int choice = input.nextInt();
            switch (choice) {
                case 0:
                    gl.showGroceryToUser();
                    break;
                case 1:
                    input.nextLine();
                    System.out.println("Enter item to be added:");
                    gl.addItem(input.nextLine());
                    break;
                case 2:
                    input.nextLine();
                    System.out.println("Enter item to be removed");
                    gl.removeItem(input.nextLine());
                    break;
                case 3:
                    System.out.println("Enter item to be replaced and the item that to be added");
                    String item = input.nextLine();
                    String newItem = input.nextLine();
                    gl.modifyItem(item, newItem);
                    System.out.println("Your Grocery list has been updated . To check press 0. ");
                    break;
                case 4:
                    System.out.println("Thankyou.");
                    quit = true;
                    break;
            }
        }
    }
}

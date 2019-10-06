package arrayList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GroceryList gl = new GroceryList();
        boolean quit = false;
        gl.printingInstructions();
        while (!quit) {
            int choice = input.nextInt();
            switch (choice) {
                case 0:
                    gl.showGroceryToUser();
                    break;
                case 1:

            }
        }
    }
}

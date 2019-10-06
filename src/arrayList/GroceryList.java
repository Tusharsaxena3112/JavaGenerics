package arrayList;

// ArrayLists are basically  the resizeable arrays.

import java.util.ArrayList;

public class GroceryList {
    ArrayList<String> groceryList = new ArrayList<String>();

    public void showGroceryList() {
        System.out.println(groceryList);
    }

    public void addItem(String item) {
        groceryList.add(item);
        System.out.println(item + " has been added in your list");
    }

    public int findIndex(String item) {
        return groceryList.indexOf(item);
    }

    public void removeItem(String item) {
        groceryList.remove(findIndex(item));
        System.out.println(groceryList);
    }

    public void modifyItem(String item, String newItem) {
        groceryList.set(findIndex(item), newItem);
        System.out.println("Your item has been modified");
    }

}

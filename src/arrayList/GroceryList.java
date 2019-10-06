package arrayList;

// ArrayLists are basically  the resizeable arrays.

import java.util.ArrayList;

public class GroceryList {
    ArrayList<String> groceryList = new ArrayList<String>();

    public void addItem(String item) {
        groceryList.add(item);
        System.out.println(item + " has been added int your list");
    }



}

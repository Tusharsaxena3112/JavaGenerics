package arrayList;

public class Main {
    public static void main(String[] args) {
        GroceryList gl = new GroceryList();
        gl.addItem("Cheese");
        gl.addItem("Samosa");
        gl.showGroceryList();
        gl.removeItem("Cheese");
    }
}

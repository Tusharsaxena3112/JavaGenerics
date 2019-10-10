package genericClass;

public class Main {
    public static void main(String[] args) {
        ClassGeneric<String> obj1 = new ClassGeneric<String>("Tushar");
        System.out.println(obj1.getValue());
        ClassGeneric<Integer> obj2 = new ClassGeneric<Integer>(18);
        System.out.println(obj2.getValue());

    }
}

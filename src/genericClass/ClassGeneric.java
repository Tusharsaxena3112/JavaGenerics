package genericClass;

public class ClassGeneric<T> {
    private T value;

    public ClassGeneric(T value) {  //Constructor for Generic class
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) { //  Setter for generic class
        this.value = value;
    }
}

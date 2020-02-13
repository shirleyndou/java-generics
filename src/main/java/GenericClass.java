public class GenericClass<E> {
    private E value; //private variable of type E

    /*Generating Getter and Setter for value*/
    public void setValue(E value)
    {
        this.value=value;
    }

    public E getValue()
    {
        return value;
    }

    public static void main(String[] args) {
        GenericClass<String> stringInstance = new GenericClass<>();
        stringInstance.setValue("Test");
        System.out.println(stringInstance.getValue());

        GenericClass<Integer> integerInstance = new GenericClass<>();
        integerInstance.setValue(1000);
        System.out.println(integerInstance.getValue());
    }
}

public class GenericMethod {

    public static void main(String[] args) {

        Integer[] numbers = {12,324,6,7900}; //array that takes integers
        String[] cities = {"Johannesburg", "Cape Town", "Durban", "Rustenburg"}; //array that takes strings

        printArrayContent(numbers);
        printArrayContent(cities);
    }

    /*Generic method*/
    public static <E> void printArrayContent(E[] array)
    {
        for(E element: array)
        {
            System.out.println(element + " ");
        }
        System.out.println("-------------");
    }

}

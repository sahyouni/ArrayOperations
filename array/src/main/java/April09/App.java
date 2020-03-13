package April09;

public class App {
    public static void main(String[] args) {

        int[] a1 = { 5, 8, 6, 3, 1, 60, 33 };

        CherryNumericArray specialArrayOperations = new CherryNumericArray(a1);

        String array = specialArrayOperations.Display();
        System.out.println(array);

        String arrayBackwards = specialArrayOperations.DisplayBackwards();
        System.out.println(arrayBackwards);


        float average = specialArrayOperations.GetAverage();
        System.out.println(average);

        int smallest = specialArrayOperations.FindSmallest();
        System.out.println(smallest);

        int sum = specialArrayOperations.GetSum();
        System.out.println(sum);

        Boolean result1 = specialArrayOperations.Contains(5);
        System.out.println(result1);

        Boolean result2 = specialArrayOperations.Contains(-5);
        System.out.println(result2);

        String sortedArray = specialArrayOperations.DisplaySortedAscending();
        System.out.println(sortedArray);


    }

}

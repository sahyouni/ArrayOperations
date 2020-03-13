package April09;

public class App {
    public static void main(String[] args) {

        int[] a1 = { 5, 8, 6, 3, 1, 60, 33 };

        CherryNumericArray specialArrayOperations = new CherryNumericArray(a1);

        String array = specialArrayOperations.Display();
        System.out.println("Display(): " + array);

        String arrayBackwards = specialArrayOperations.DisplayBackwards();
        System.out.println("DisplayBackwards(): " + arrayBackwards);

        float average = specialArrayOperations.GetAverage();
        System.out.println("Average: " + average);

        int smallest = specialArrayOperations.FindSmallest();
        System.out.println("FindSmallest(): " + smallest);

        int sum = specialArrayOperations.GetSum();
        System.out.println("GetSum(): " + sum);

        Boolean result1 = specialArrayOperations.Contains(5);
        System.out.println("Contains(5): " + result1);

        Boolean result2 = specialArrayOperations.Contains(-5);
        System.out.println("Contains(-5): " + result2);

        String sortedArray = specialArrayOperations.DisplaySortedAscending();
        System.out.println("DisplaySortedAscending(): " + sortedArray);

    }

}

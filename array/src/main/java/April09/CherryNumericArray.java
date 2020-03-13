package April09;

public class CherryNumericArray {

    private int[] _arrayOfIntegers;

    public CherryNumericArray(int[] arrayOfIntegers) {
        _arrayOfIntegers = arrayOfIntegers;
    }

    public float GetAverage() {
        // return the average of the elements of the array


        return 0;
    }

    public int FindSmallest() {
        // return the smallest element in the array

        return 0;
    }

    public int GetSum() {
        // return the sum of the elements of the array

        int index = 0;
        int sum =0;
        while(index<_arrayOfIntegers.length){
            sum = sum + _arrayOfIntegers[index];
            index++;
        }

        return sum;
    }

    public boolean Contains(int value) {
        // return true if the supplied value is an element of the array and false
        // otherwise

        return false;
    }

    public String Display() {
        // return all the elements of the array in one string seperated by dashes
        // so if the array is {5, 8, 6, 3, 1, 60, 33}, the output should be
        // 5-8-6-3-1-60-33

        return "";
    }

    public String DisplayBackwards() {
        // return all the elements of the array in one string seperated by dashes but
        // backwards
        // so if the array is {5, 8, 6, 3, 1, 60, 33}, the output should be
        // 33-60-1-3-6-8-5

        return "";
    }

    public String DisplaySortedAscending() {
        // return all the elements of the array in one string seperated by dashes and
        // sorted
        // so if the array is {5, 8, 6, 3, 1, 60, 33}, the output should be
        // 1-3-5-633-60

        return "";
    }

}
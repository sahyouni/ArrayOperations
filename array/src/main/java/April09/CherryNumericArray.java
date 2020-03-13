package April09;

public class CherryNumericArray {

    private Integer[] _arrayOfIntegers;

    public CherryNumericArray(int[] arrayOfIntegers) {

        if (arrayOfIntegers == null || arrayOfIntegers.length == 0)
            throw new IllegalArgumentException("array cannot be null or empty");

        initializeInternal(arrayOfIntegers);

    }

    private void initializeInternal(int[] arrayOfIntegers) {

        // i want to work with Integer[] and not int
        _arrayOfIntegers = new Integer[arrayOfIntegers.length];

        // create new internal array
        int index = 0;
        while (index < arrayOfIntegers.length) {
            _arrayOfIntegers[index] = arrayOfIntegers[index];
            index++;
        }
    }

    public float GetAverage() {
        int sum = GetSum();
        if (sum != 0 && _arrayOfIntegers.length > 0)
            return sum / _arrayOfIntegers.length;
        return 0;
    }

    public int FindSmallest() {
        // return the smallest element in the array

        // i'll assume the first element is the minimum!!
        int min = _arrayOfIntegers[0];

        int index = 1;

        while (index < _arrayOfIntegers.length) {
            if (_arrayOfIntegers[index] < min)
                min = _arrayOfIntegers[index];
            index++;
        }

        return min;
    }

    public int GetSum() {
        // return the sum of the elements of the array

        int index = 0;
        int sum = 0;
        while (index < _arrayOfIntegers.length) {
            sum = sum + _arrayOfIntegers[index];
            index++;
        }
        return sum;
    }

    public boolean Contains(int value) {
        // return true if the supplied value is an element of the array and false
        // otherwise

        int index = 0;
        while (index < _arrayOfIntegers.length) {
            if (value == _arrayOfIntegers[index])
                return true;
            index++;
        }

        return false;
    }

    public String Display() {
        // return all the elements of the array in one string seperated by dashes
        // so if the array is {5, 8, 6, 3, 1, 60, 33}, the output should be
        // 5-8-6-3-1-60-33

        String result = "";
        int index = 0;
        while (index < _arrayOfIntegers.length) {

            result += _arrayOfIntegers[index].toString();
            if (index != _arrayOfIntegers.length - 1)
                result += "-";

            index++;
        }

        return result;
    }

    public String DisplayBackwards() {
        // return all the elements of the array in one string seperated by dashes but
        // backwards
        // so if the array is {5, 8, 6, 3, 1, 60, 33}, the output should be
        // 33-60-1-3-6-8-5

        String result = "";
        int index = 0;
        while (index < _arrayOfIntegers.length) {

            result += _arrayOfIntegers[_arrayOfIntegers.length - index - 1].toString();
            if (index != _arrayOfIntegers.length - 1)
                result += "-";

            index++;
        }

        return result;
    }

    public String DisplaySortedAscending() {
        // return all the elements of the array in one string seperated by dashes and
        // sorted
        // so if the array is {5, 8, 6, 3, 1, 60, 33}, the output should be
        // 1-3-5-633-60

        int outerIndex = 0, innerIndex = 0;
        
        while (outerIndex < _arrayOfIntegers.length - 1) {

            innerIndex = 0;
            while (innerIndex < _arrayOfIntegers.length - outerIndex - 1) {

                if (_arrayOfIntegers[innerIndex] > _arrayOfIntegers[innerIndex + 1]) {
                    int temp = _arrayOfIntegers[innerIndex];
                    _arrayOfIntegers[innerIndex] = _arrayOfIntegers[innerIndex + 1];
                    _arrayOfIntegers[innerIndex + 1] = temp;
                }
                innerIndex++;
            }

            outerIndex++;

        }

        return Display();
    }

}
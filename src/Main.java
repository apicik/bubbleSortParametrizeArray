import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Integer[] arrayIntegers = {3, 2, 1, 5, 4, 6};
        Float[] arrayFloats = {3.0f, 0.0f, 2.0f, 1.0f};
        String[] arrayStrings = {"Mike", "Alex", "Evan", "Elena"};

        Integer[] sortedArrayIntegers = parameterizedSort(arrayIntegers);
        Float[] sortedArrayFloats = parameterizedSort(arrayFloats);
        String[] sortedArrayString = parameterizedSort(arrayStrings);

        printTypeAndArray(sortedArrayIntegers);
        printTypeAndArray(sortedArrayFloats);
        printTypeAndArray(sortedArrayString);
    }

    private static <T extends Comparable<T>> T[] parameterizedSort(T[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[i]) < 1) {
                    T swap = array[j];
                    array[j] = array[i];
                    array[i] = swap;
                }
            }
        }
        return array;
    }

    private static <T extends Comparable<T>> void printTypeAndArray(T[] array) {
        System.out.println("Type: " + array.getClass().getSimpleName() + ", sorted array: " + Arrays.toString(array));
    }

}

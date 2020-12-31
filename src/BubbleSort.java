import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("This is bubble sort algorithm.");
        int[] array = {8, 5, 6, 34, 2, 1, 2, 3, 1};
        System.out.println("Input array: " + Arrays.toString(array));
        System.out.println("Sorted array: " + Arrays.toString(bubbleSort(array)));
    }

    public static int[] bubbleSort(int[] unsortedArray) {
        for (int i = 0; i < unsortedArray.length - 1; i++) {
            for (int j = 0; j < unsortedArray.length - 1; j++) {
                if (unsortedArray[j] > unsortedArray[j + 1]) {
                    int temp = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[j + 1];
                    unsortedArray[j + 1] = temp;
                }
            }
        }

        return unsortedArray;
    }
}

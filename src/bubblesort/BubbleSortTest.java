package bubblesort;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class BubbleSortTest {

    @Test
    public void testBubbleSort_WorstCase() {
        //Given
        int[] unSortedArray = {4, 3, 2, 1};
        int[] expectedArray = {1, 2, 3, 4};

        //When
        int[] output = BubbleSort.bubbleSort(unSortedArray);

        //Then
        Assert.assertTrue(Arrays.equals(expectedArray, output));
    }

    @Test
    public void testBubbleSort_AverageCase() {
        //Given
        int[] unSortedArray = {4, 3, 2, 5, 6, 7};
        int[] expectedArray = {2, 3, 4, 5, 6, 7};

        //When
        int[] output = BubbleSort.bubbleSort(unSortedArray);

        //Then
        Assert.assertTrue(Arrays.equals(expectedArray, output));
    }

    @Test
    public void testBubbleSort_BestCase() {
        //Given
        int[] unSortedArray = {1, 2, 3, 4};
        int[] expectedArray = {1, 2, 3, 4};

        //When
        int[] output = BubbleSort.bubbleSort(unSortedArray);

        //Then
        Assert.assertTrue(Arrays.equals(expectedArray, output));
    }

    @Test
    public void testBubbleSort_WithSingleElementInArray() {
        //Given
        int[] unSortedArray = {1};
        int[] expectedArray = {1};

        //When
        int[] output = BubbleSort.bubbleSort(unSortedArray);

        //Then
        Assert.assertTrue(Arrays.equals(expectedArray, output));
    }

    @Test
    public void testBubbleSort_WithEmptyArray() {
        //Given
        int[] unSortedArray = {};
        int[] expectedArray = {};

        //When
        int[] output = BubbleSort.bubbleSort(unSortedArray);

        //Then
        Assert.assertTrue(Arrays.equals(expectedArray, output));
    }
}
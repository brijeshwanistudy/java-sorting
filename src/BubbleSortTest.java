import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class BubbleSortTest {

    @Test
    public void testBubbleSort1() {
        //Given
        int[] unSortedArray = {4, 3, 2, 1};
        int[] expectedArray = {1, 2, 3, 4};

        //When
        int[] output = BubbleSort.bubbleSort(unSortedArray);

        //Then
        Assert.assertTrue(Arrays.equals(expectedArray, output));
    }

    @Test
    public void testBubbleSort2() {
        //Given
        int[] unSortedArray = {1};
        int[] expectedArray = {1};

        //When
        int[] output = BubbleSort.bubbleSort(unSortedArray);

        //Then
        Assert.assertTrue(Arrays.equals(expectedArray, output));
    }

    @Test
    public void testBubbleSort3() {
        //Given
        int[] unSortedArray = {1, 2, 3, 4};
        int[] expectedArray = {1, 2, 3, 4};

        //When
        int[] output = BubbleSort.bubbleSort(unSortedArray);

        //Then
        Assert.assertTrue(Arrays.equals(expectedArray, output));
    }
}
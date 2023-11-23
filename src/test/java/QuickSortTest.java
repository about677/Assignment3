import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class QuickSortTest {

    @Test
    public void testEmptyArray() {
        Integer[] input = {};
        Integer[] expectedValue = {};
        Sorter<Integer> sorter = new QuickSort<>();
        sorter.sort(input);
        assertArrayEquals(expectedValue, input);
    }

    // Other test methods for different scenarios

    @Test
    public void testArrayWithNullValues1() {
        Integer[] input = {4, 2, 5, null, 1, 3, null};
        Integer[] expectedValue = {null, null, 1, 2, 3, 4, 5};

        Sorter<Integer> sorter = new QuickSort<>();
        sorter.sort(input);

        assertArrayEquals(expectedValue, input);
    }

    @Test
    public void testArrayWithNullValues2() {
        Integer[] input = {4, null, 2, 5, null, 1, 3};
        Integer[] expected = {null, null, 1, 2, 3, 4, 5};

        Sorter<Integer> sorter = new QuickSort<>();
        sorter.sort(input);

        assertArrayEquals(expected, input);
    }

    @Test
    public void testArrayWithNullValues3() {
        Integer[] input = {null, 3, 2, 5, null, 1, 4};
        Integer[] expected = {null, null, 1, 2, 3, 4, 5};

        Sorter<Integer> sorter = new QuickSort<>();
        sorter.sort(input);

        assertArrayEquals(expected, input);
    }

}
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Example usage of QuickSort
        Integer[] arr = {4, 2, 6, 1, 5, 3};
        Sorter<Integer> sorter = new QuickSort<>();
        sorter.sort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
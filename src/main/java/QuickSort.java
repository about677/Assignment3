public class QuickSort<T extends Comparable<T>> implements Sorter<T> {

    @Override
    public void sort(T[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(T[] array, int left, int right) {
        if (left < right) {
            int partitionIndex = partition(array, left, right);
            quickSort(array, left, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, right);
        }
    }

    private int partition(T[] array, int left, int right) {
        T pivot = array[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (array[j] == null || (pivot != null && array[j] != null && array[j].compareTo(pivot) <= 0)) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, right);
        return i + 1;
    }

    private void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
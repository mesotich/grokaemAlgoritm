public class Solution {

    public static void main(String[] args) {
        int[] array = {1, 3, 6, 8, 10, 11, 14, 15};
        System.out.println(binarySearch(6, array, 0, array.length - 1));
    }

    public static int binarySearch(int item, int[] array, int low, int high) {
        if (high == low)
            return item == array[low] ? low : -1;
        int middle = low + (high - low) / 2;
        if (item == array[middle])
            return middle;
        if (item < array[middle])
            high = middle - 1;
        if (item > array[middle])
            low = middle + 1;
        return binarySearch(item, array, low, high);
    }
}

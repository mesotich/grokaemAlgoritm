import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        Integer[] array = {1, 3,5};
        System.out.println(sum(new ArrayList<>(Arrays.asList(array))));
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

    public static int sum(List<Integer> list) {
        int result = 0;
        if (list.size() == 0)
            return result;
        result = list.remove(0) + sum(list);
        return result;
    }
}

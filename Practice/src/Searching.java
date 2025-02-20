public class Searching {
    public static void main(String[] args) {
        // Linear Searching
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }
        System.out.println(index);

        // Binary Search
        int[] arr2 = {1, 2, 3, 4, 5};
        int target2 = 3;
        int left = 0;
        int right = arr2.length - 1;
        int index2 = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr2[mid] == target2) {
                index2 = mid;
                break;
            } else if (arr2[mid] < target2) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    }
}

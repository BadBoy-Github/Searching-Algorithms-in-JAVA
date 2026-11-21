public class Search {
    int left = 0, count = 0, right;
    int[] arr;

    public Search(int[] arr) {
        this.right = arr.length - 1;
        this.arr = arr;
    }

    public int BinarySearcher(int target, int left, int right) {
        count++;

        if (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                System.out.println("Number of iterations in Binary Search: " + count);
                return mid;
            } else if (arr[mid] < target) {
                return BinarySearcher(target, mid + 1, right);
            } else {
                return BinarySearcher(target, left, mid - 1);
            }
        }
        System.out.println("Number of iterations in Binary Search: " + count);
        return -1;
    }

    public int linearSearcher(int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count++;
            if (arr[i] == target) {
                System.out.println("Number of iterations in Linear Search: " + count);
                return i;
            }
        }

        System.out.println("Number of iterations in Linear Search: " + count);
        return -1;
    }

}

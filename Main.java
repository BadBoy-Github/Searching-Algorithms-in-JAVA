
public class Main {
    public static void main(String[] args) {

        int[] arr = { 5, 7, 11, 19, 20, 24, 28 };
        int target = 28;

        Search bs = new Search(arr);

        int indexl = bs.linearSearcher(target);
        int indexb = bs.BinarySearcher(target, 0, arr.length - 1);

        if (indexl == -1) {
            System.out.println("Element not found in Linear Search");
        } else {
            System.out.println("Element " + target + " found at index: " + indexl + " using Linear Search");
        }

        if (indexb == -1) {
            System.out.println("Element not found in Binary Search");
        } else {
            System.out.println("Element " + target + " found at index: " + indexb + " using Binary Search");
        }

    }
}
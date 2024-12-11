import java.util.*;

class Solution {
    public int getSecondLargest(int[] arr) {
        int n = arr.length;
        if (n < 2) return -1;

        int largest = arr[0];

        // Find the largest element in the array
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        int secondLargest = -1;

        // Find the second largest element by excluding the largest
        for (int i = 0; i < n; i++) {
            if (arr[i] != largest) {
                if (secondLargest == -1 || arr[i] > secondLargest) {
                    secondLargest = arr[i];
                }
            }
        }

        return secondLargest;
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] arr = {3, 5, 2, 9, 6, 7};
        int secondLargest = sol.getSecondLargest(arr);

        if (secondLargest != -1) {
            System.out.println("The second largest element is: " + secondLargest);
        } else {
            System.out.println("There is no second largest element.");
        }
    }
}

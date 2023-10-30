import java.util.Scanner;

public class rotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of k ");
        int k = sc.nextInt();

        RotateArray(arr, k);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void RotateArray(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Handle cases where k is greater than the array length

        if (k < 0) {
            k = n + k; // Handle negative values of k
        }

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[(i + k) % n] = nums[i];
        }

        System.arraycopy(result, 0, nums, 0, n);
    }
}
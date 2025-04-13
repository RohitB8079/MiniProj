import java.util.*;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements in array: ");
        int a = sc.nextInt();

        int[] arr = new int[10];
        System.out.print("Enter the elements of array: ");

        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Array is: ");
        for (int i = 0; i < a; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
        Arrays.sort(arr);
        System.out.println("Second Largest number is: " + arr[arr.length - 2]);

    }

}

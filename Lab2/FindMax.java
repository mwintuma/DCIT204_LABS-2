import java.util.Scanner;


public class FindMax{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

     
        while (n <= 0) {
            System.out.print("Array size must be greater than 0. Please enter again: ");
            n = scanner.nextInt();
        }

       
        int[] arr = new int[n];

      
        System.out.println("Enter " + n + " integer values:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element [" + i + "]: ");
            arr[i] = scanner.nextInt();
        }

       
        int maxValue = arr[0];
        int maxIndex = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxIndex = i;
            }
        }

        
       
        System.out.println("          RESULTS         ");
        System.out.print("Array Entered      : [");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) System.out.print(", ");
        }
        System.out.println("]");
        System.out.println("Maximum Value       : " + maxValue);
        System.out.println("Index of Maximum    : " + maxIndex);
      

        scanner.close();
    }
}
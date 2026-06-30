import java.util.Scanner;


public class PairSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        while (n <= 1) {
            System.out.print("Array size must be greater than 1 to form a pair. Please enter again: ");
            n = scanner.nextInt();
        }

        
        int[] arr = new int[n];

      
        System.out.println("Enter " + n + " integer values:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element [" + i + "]: ");
            arr[i] = scanner.nextInt();
        }

        // Step 4: Get the target sum
        System.out.print("Enter the Target Sum: ");
        int target = scanner.nextInt();

     
        boolean found = false;
        int firstIndex = -1, secondIndex = -1;

        outerLoop:
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    firstIndex = i;
                    secondIndex = j;
                    found = true;
                    break outerLoop; 
                }
            }
        }

        

        System.out.println("   RESULTS    ");
        System.out.print("Array Entered       : [");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) System.out.print(", ");
        }
        System.out.println("]");
        System.out.println("Target Sum          : " + target);

        if (found) {
            System.out.println("Pair Found          : YES");
            System.out.println("Index 1             : " + firstIndex + " (Value: " + arr[firstIndex] + ")");
            System.out.println("Index 2             : " + secondIndex + " (Value: " + arr[secondIndex] + ")");
            System.out.println("Equation            : " + arr[firstIndex] + " + " + arr[secondIndex] + " = " + target);
        } else {
            System.out.println("Pair Found          : NO");
            System.out.println("No two numbers in the array sum up to the target value.");
        }
       
        scanner.close();
    }
}
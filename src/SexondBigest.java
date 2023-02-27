import java.util.Scanner;

public class SexondBigest {
    public static void main(String[] args) {
        int secondlargest = 0;
        int largest = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array values: ");
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
            if (largest < arr[i]) {
                secondlargest = largest;
                largest = arr[i];
            }
            if (secondlargest < arr[i] && largest != arr[i])
                secondlargest = arr[i];
        }

        System.out.println ( secondlargest + largest );
    }
}


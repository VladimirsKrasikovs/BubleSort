import java.util.Random;

public class Bublesort {
    public static void main(String[] args) {

        Random rand = new Random();
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(5000);
        }
        System.out.println("Before");
        printArray(numbers);

        boolean swap = true;
        while (swap) {
            swap = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    swap = true;
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }
        System.out.println("");
        System.out.println("After");
        System.out.println("");
        printArray(numbers);

    }
        public static void printArray(int [] numberArr){
            for (int j : numberArr) {
                System.out.println(j);
            }
        }
    }


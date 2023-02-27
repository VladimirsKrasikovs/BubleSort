import java.util.Arrays;

public class Bublesort2 {

    public static int[] bubbleSort(int input[]) {
        boolean swapping = true;
        while (swapping) {
            swapping = false;
            for (int i = 0; i < input.length - 1; i++) {
                if(input[i]> input [i+1]){
                    System.out.println(String.format("Swapping pair %d, %d", input[i], input[i+1]));
                    Swap.swap(input, i, i+1);
                    System.out.println(Arrays.toString(input));
                    swapping = true;
                }
            }
        }
        return input;
    }

    public static void main(String[] args) {
        int[] example = {13, 22, 50, 15, 20, 33, 33};
        Bublesort2 b = new Bublesort2();
        b.bubbleSort(example);
    }
}


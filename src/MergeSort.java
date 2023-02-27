import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {


        Random rand = new Random();
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(5000);
        }
        System.out.println("Before");

    }
private static void mergeSort (int [] inputArray){
        int inputLength = inputArray.length;

        if (inputLength <2){
            return;
        }
        int midIndex = inputLength / 2;
        int[]leftHalf = new int [midIndex];
        int []rightHalf = new int[inputLength-midIndex];
        for(int i=0; i<midIndex; i++){
            leftHalf[i]= inputArray[i];
        }
    for(int i=midIndex; i<inputLength; i++){
        rightHalf[i-midIndex]= inputArray[i];
    }
    mergeSort(leftHalf);
    mergeSort(rightHalf);


}


}
import java.util.Scanner;

public class Sumof3numbers {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int a =scan.nextInt();
        int b =scan.nextInt();
        int c =scan.nextInt();


        int [] numbers = {a, b, c,};

        int result = sumBigest(numbers);
        System.out.println("Sum of x+y = " + result);
    }

    public static int sumBigest (int [] num){
        int retVal = 0;
        int lowest =  Integer.MAX_VALUE;
        for (int i : num) {
            if (i < lowest)
                lowest = i;
            retVal += i;
        }
        retVal -= lowest;
        return retVal;

    }
}


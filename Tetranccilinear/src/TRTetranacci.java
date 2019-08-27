import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.math.BigInteger;

/**
 * Created by jangh on 2019-05-12.
 */ //Declare class Tetrancci
public class TRTetranacci {
    public static BigInteger linearTetranacci(int number) {

        int first = 0, second = 0, third = 0, fourth = 1,  next = 0;
        BigInteger product = BigInteger.ZERO;
        BigInteger one = BigInteger.ZERO;
        BigInteger two = BigInteger.ZERO;
        BigInteger three = BigInteger.ZERO;
        BigInteger four = BigInteger.ONE;
        for (int i = 0; i <= number; i++) {

            if (i <= 2) {
                product = BigInteger.ZERO;
            }

            else if (i == 3) {
                //set next to 1
                product = BigInteger.ONE;
            }

            else {
                product = one.add(two).add(three).add(four);
                one = two;
                two = three;
                three = four;
                four = product;
            }

        }

        //return value

        return product;

    }

    public static void main(String[] args) throws FileNotFoundException {

        //To redirect the output use PrintStream class

        PrintStream fileOut = new PrintStream("./out.txt");
        BigInteger f = new BigInteger("1");
        System.setOut(fileOut);
        BigInteger sum = BigInteger.valueOf(0);
        for (int i = 5; i <= 100; i += 5) {
            System.out.println("For  " + i + " ");
            long startTime = System.nanoTime();

            System.out.println("The amount is " + linearTetranacci(i));
            //end time
            long endTime = System.nanoTime();
            //total time
            long totalTime = endTime - startTime;
            //display the time
            System.out.println(totalTime/1000 + "seconds");
            System.out.println();
        }

    }
}


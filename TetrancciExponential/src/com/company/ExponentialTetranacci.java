package com.company;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.math.BigInteger;

/**
 * Created by jangh on 2019-05-12.
 */
public class ExponentialTetranacci {
    // Recursive Approach

    public static BigInteger tetranacci(int number) {
        if ((number == 0) || (number == 1) || (number == 2)) {
            return BigInteger.ZERO;
        }
        else if(number == 3) {
            return BigInteger.ONE;
        }
        return tetranacci(number - 1).add(tetranacci(number - 2)).add(tetranacci(number-3)).add(tetranacci(number-4));
    }
    public static void main(String[] args) throws FileNotFoundException {
        //To redirect the output use PrintStream class
        PrintStream fileOut = new PrintStream("./out.txt");
        System.setOut(fileOut);
        //start the time
        for(int i = 5; i<=50; i+=5) {
            System.out.println("For  " + i+ " ");
            long startTime = System.nanoTime();

            System.out.println("The amount is "+tetranacci(i));
            //end time
            long endTime = System.nanoTime();
            //total time
            long totalTime = endTime - startTime;
            //display the time
            System.out.println(totalTime/1000  + "seconds");
            System.out.println();
        }
    }


}

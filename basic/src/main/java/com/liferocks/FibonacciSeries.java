package com.liferocks;

/**
 * Created by Prasad on 18-01-2020.
 */
public class FibonacciSeries {

    public static void main(String[] args) {
        /** Program to create the fibonacci series
         *  0,1,1,2,3,5,8....
         * */
        printFibonacciWithoutRecursion();

        int number = 10;
        int firstNumber = 0;
        int secondNumber = 1;
        System.out.println("Fibonacci with recursion");
        System.out.print(firstNumber + "," + secondNumber + ",");
        printFibonacciWithRecursion(firstNumber,secondNumber,number-2);

    }

    public static void printFibonacciWithoutRecursion(){
        System.out.println("Fibonacci without recursion");
        int number = 10;
        int firstNumber = 0;
        int nextNumber= 1;
        for(int i=1 ; i<=number; i++){
            if(i == 1 ){
                System.out.print(firstNumber + ",");
                continue;
            }else if(i == 2){
                System.out.print(nextNumber + ",");
                continue;
            }else{
                int addition = firstNumber + nextNumber;
                System.out.print(addition + ",");
                firstNumber= nextNumber;
                nextNumber = addition;
            }
        }
    }

    public static void printFibonacciWithRecursion(int firstNumber, int lastNumber ,int count){
        if(count > 0){
            int addition = firstNumber + lastNumber;
            System.out.print(addition + ",");
            printFibonacciWithRecursion(lastNumber,addition,count-1);
        }

    }
}

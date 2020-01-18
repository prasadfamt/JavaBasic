package com.liferocks;



/**
 * Created by Prasad on 18-01-2020.
 */
public class ForLoop {

    public static void main(String[] args) {
        for(int i=1; i<=4; i++){
            for(int j=1 ;j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("========================================");

        for(int i= 5; i>=1; i--){
            for(int j=1 ; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}


package com.mycompany.wo3;

import java.util.Random;
public class W03L05 {
    public static void main(String[] args) {
        Random rnd = new Random();
        
        int num1 = rnd.nextInt(10001);
        System.out.println("Number chosen " + num1);
        
        int sum = num1 % 10
        + (num1/ 10) % 10
        + (num1 / 100) % 10
        + (num1 / 1000) % 10
        + num1 / 10000;
        
        System.out.println("Sum of all the digits is " + sum);
    }
}

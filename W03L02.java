
package com.mycompany.lab2;

import java.util.Scanner;
public class W03L02 {
    public static void main(String[] args) {
        double P,D,R,Y,M;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of the price of the car: ");
        P = in.nextDouble();
        
        System.out.println("Enter the value of the down payment of the car: ");
        D = in.nextDouble();
        
        System.out.println("Enter the value of the interest rate of the car: ");
        R = in.nextDouble();
        
        System.out.println("Enter the value of the loan duration of the car: ");
        Y = in.nextDouble();
        
        M = (P-D)*(1 + R*Y/100)/(Y*12);
        
        System.out.printf("Your monthly payment for the car is: %.2f\n", M);
    }
}

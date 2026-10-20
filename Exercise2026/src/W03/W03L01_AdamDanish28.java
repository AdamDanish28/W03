
package com.mycompany.lab2;

import java.util.Scanner;

public class W03L01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your temperature in degree Fahrenheit: ");
        double degree = in.nextDouble();
        
        double celsius = (degree-32)/1.8;
        
        System.out.printf("The temperature in celcius is %.2f", celsius );
        
    }
}

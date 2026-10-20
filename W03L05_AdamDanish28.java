
package W03;


import java.util.Random;
public class W03L05_AdamDanish28 {
    public static void main(String[] args) {
        Random rnd = new Random();
        
        int num1 = rnd.nextInt(10001);
        System.out.println("Number chosen " + num1);
        
        int sum = num1 % 10 //get 1st digit 
        + (num1/ 10) % 10 // get 2nd digit
        + (num1 / 100) % 10 //get 3rd git
        + (num1 / 1000) % 10 //get 4th digit
        + num1 / 10000; //get the 5th digit
        
        System.out.println("Sum of all the digits is " + sum);
    }
}

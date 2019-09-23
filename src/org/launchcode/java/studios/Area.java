package org.launchcode.java.studios;
import java.util.Scanner;
public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
       // System.out.println("Please enter the radius of the circle:");
       // double rad = input.nextDouble();
        double rad = -1;
       while(rad < 0){
           System.out.println("Please enter the radius of the circle:");
           rad = input.nextDouble();
        if(rad < 0){
         System.out.println("radius cannot be a negative number");
        }else {
            System.out.println("The area of the circle is " + rad * Math.pow(Math.PI, 2));
        }
       }
    }
}

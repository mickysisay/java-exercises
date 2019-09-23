package exercises;

import java.util.Scanner;
public class Area {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the length of rectangle:");
        double length = in.nextDouble();
        System.out.println("enter the width of rectangle:");
        double width = in.nextDouble();
        double Area = length * width ;
        System.out.println("The area of the rectangle is "+ Area +".");
    }
}

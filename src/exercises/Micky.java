package exercises;

import java.util.Scanner;

public class Micky {
    public static void main(String[] args){
        String userName;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name");
        userName = input.next();
        System.out.println("hello " + userName +".");
    }
}

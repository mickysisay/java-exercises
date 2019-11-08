package exercises;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Area {
    public static void main(String[] args){
        double radius = valid();


        double Area = Math.PI * Math.pow(radius,2);
        System.out.println("The area of the cirlce is " + Area + ".");
    }

    private static double valid (){
        Scanner in = new Scanner(System.in);
        boolean validation1 = true;

        String error = "value must be above 0";
        double radius = -2 ;

        do {
            try {
                System.out.println("enter the radius : ");
                radius = in.nextDouble();
                if(radius <=0){
                    System.out.println(error);
                }else{
                    validation1 = false;
                }
            }catch (InputMismatchException e){
                System.out.println("invalid output");
            }

            in.nextLine();
        }while(validation1);
        return radius;
    }

}

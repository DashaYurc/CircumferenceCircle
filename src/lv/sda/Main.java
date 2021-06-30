package lv.sda;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in kg: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in m: ");
        double height = scanner.nextDouble();
        scanner.close();

        double bmi = weight/Math.pow(height,2);

        System.out.println("The BMI value is: " + bmi);

        if(bmi < 18.5 || bmi > 24.9){
            System.out.println("BMI not optional");
        }else{
            System.out.println("BMI optional");
        }



        //float pi = (float) Math.PI;
        //float radius = scanner.nextFloat();
        //float circumference = 2 * pi * radius;
        //System.out.println("The circumference of the circle is " + circumference);


    }
}

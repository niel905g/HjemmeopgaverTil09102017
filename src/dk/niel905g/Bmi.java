package dk.niel905g;
//Opgave 3.6

import java.util.Scanner;

    public class Bmi {
    //

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("\nEnter weight in kilos: ");
            int weight = input.nextInt();

            System.out.print("\nEnter height in meters: ");
            double height = input.nextDouble();

            System.out.println("\nBMI is " + (weight / (height * height)));

        }
    }


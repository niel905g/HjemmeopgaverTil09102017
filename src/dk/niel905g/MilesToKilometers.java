package dk.niel905g;
//Opgave 5.4
public class MilesToKilometers {

     /*      (Conversion from miles to kilometers)
      *      Write a program that displays the following
      *      table (note that 1 mile is 1.609 kilometers) */

        public static void main(String[] args) {

            System.out.printf("%-12s%-8s\n", "Miles", "Kilometers");
            // Creating the loop
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%-12d%-8.3f\n", i, i * 1.609);
            }
        }
    }


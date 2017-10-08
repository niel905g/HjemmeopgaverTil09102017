package dk.niel905g;
// Opgave 3.4

  public class RandomMonth {

        public static void main(String[] args) {
            // I will try with a "for loop" instead! // No, I will not!

            int randomMonth = (int)(Math.random()*12) + 1;
            //Husk at spørge Andras hvorfor der kommer en udskrift uden noget? (engang imellem), som vist kan undgåes med + 1...?

            if (randomMonth == 1){
                // The first month is January and here the variable randommonth is equal to 1 and will print January
                System.out.println("the current month is January");
            }
            // Here the variable randommonth is equal to 2 and will print February
            else if (randomMonth ==2){
                // the second month is February
                System.out.println("the current month is February");
            }
            // Here the variable randommonth is equal to 3 and will print March
            else if (randomMonth ==3){
                // the 3rd month is March
                System.out.println("the current month is March");
            }
            // Here the variable randommonth is equal to 4 and will print April
            else if (randomMonth ==4){
                // the 4th month is April
                System.out.println("the current month is April");
            }
            // Here the variable randommonth is equal to 5 and will print May
            else if (randomMonth ==5){
                // the 5th month is May
                System.out.println("the current month is May");
            }
            // Here the variable randommonth is equal to 6 and will print June
            else if (randomMonth ==6){
                // the 6th month is June
                System.out.println("the current month is June");
            }
            // Here the variable randommonth is equal to 7 and will print July
            else if (randomMonth ==7){
                // the 7th month is July
                System.out.println("the current month is July");
            }
            // Here the variable randommonth is equal to 8 and will print August
            else if (randomMonth ==8){
                // the 8th month is August
                System.out.println("the current month is August");
            }
            // Here the variable randommonth is equal to 9 and will print September
            else if (randomMonth ==9){
                // the 9th month is September
                System.out.println("the current month is September");
            }
            // Here the variable randommonth is equal to 10 and will print October
            else if (randomMonth ==10){
                // the 10th month is October
                System.out.println("the current month is oktober");
            }
            // Here the variable randommonth is equal to 11 and will print November
            else if (randomMonth ==11){
                // the 11th month is November
                System.out.println("the current month is November");
            }
            // Here the variable randommonth is equal to 12 and will print December
            else if (randomMonth ==12){
                // the 12th month is December
                System.out.println("the current month is December");
            }
        }
/**
 public static void main(String[] Strings) {
 int randomMonth = (int) (Math.random() * 12) + 1;

 for (int i = 0; i < 1000; i++) {
 int randomMonth2 = (int) (Math.random() * 12 + 1);

 System.out.println(getMonthName(randomMonth2) + " " + randomMonth2);


 }
 System.out.println(getMonthName(randomMonth));
 }
 public static String getMonthName(int month) {
 String monthName = "";
 switch (month) {
 case 1: monthName = "January"; break;
 case 2: monthName = "February"; break;
 case 3: monthName = "March"; break;
 case 4: monthName = "April"; break;
 case 5: monthName = "May"; break;
 case 6: monthName = "June"; break;
 case 7: monthName = "July"; break;
 case 8: monthName = "August"; break;
 case 9: monthName = "September"; break;
 case 10: monthName = "October"; break;
 case 11: monthName = "November"; break;
 case 12: monthName = "December"; break;

 default:
 monthName = "INVALID MONTH RANGE";
 }
 return monthName;
 } */
    }




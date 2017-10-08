package dk.niel905g;
// Opgave 5.10
public class NbrsDivisibleByFiveOrSixButNotBoth {
    //
    public static void main(String[] args) {

        int numCount = 1;
        for (int i = 100; i <= 1000; i++) {

            if (i % 5 == 0 && i % 6 == 0)
                System.out.print((numCount++ % 10 != 0) ? i + " " : i + "\n");
        }
    }
}


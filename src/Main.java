import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Schreibe ein Programm, dass von der Konsole eine Zahl einliest und ausgibt:

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println("Die eingegebene Zahl ist " + number + ".");

        //ob es sich um eine runde Zahl handelt
        if ((number % 10) == 0) {
            System.out.println(number + " ist eine runde Zahl.");
        } else {
            System.out.println(number + " ist keine runde Zahl.");
        }

        //ob die Zahl gerade ist
        if ((number % 2) == 0) {
            System.out.println(number + " ist eine gerade Zahl.");
        } else {
            System.out.println(number + " ist eine ungerade Zahl.");
        }

        //ob die Zahl deiner Glückszahl entspricht (denk dir hierfür einfach eine eigene Glückszahl aus und gib sie zu Beginn des Programms auf der Konsole aus)
        int luckyNumber = 4391;

        System.out.println("Meine Glückszahl ist " + luckyNumber + ".");

        if (number == luckyNumber) {
            System.out.println(number + "ist meine Glückszahl.");
        } else {
            System.out.println(number + " ist nicht meine Glückszahl.");

            //ob die Zahl zweistellig ist
            if (number < 100 & number > 9) {
                System.out.println(number + " ist zweistellig.");
            } else {
                System.out.println(number + " passt nicht in das Schema.");
            }

            //Tipp: Für die ersten beiden Punkte wirst du die Modulo Funktion brauchen.

        }
    }
}

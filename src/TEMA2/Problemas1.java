package TEMA2;
import java.util.Scanner;

    public class Problemas1 {
        public static void main(String[] args) {


            Scanner drum = new Scanner(System.in);
            System.out.println("Introduceti tipul de drum:");
            String tipDrum = drum.nextLine();
            var lt = tipDrum.toLowerCase();
            switch (lt) {
                case "oras":
                    System.out.println("Viteza maxima in " + tipDrum + " este de 50 Km/h");
                    break;
                case "zona rezidentiala":
                    System.out.println("Viteza maxima in " + tipDrum + " este de 30 Km/h");
                    break;
                case "drum express":
                    System.out.println("Viteza maxima in" + tipDrum + " este de 100 Km/h");
                    break;
                case "autostrada":
                    System.out.println("Viteza maxima in " + tipDrum + " este de 130 Km/h");
                    break;
                default:
                    System.out.println("Viteza maxima in " + tipDrum + " este de N/A Km/h");
                    break;
            }
        }
    }

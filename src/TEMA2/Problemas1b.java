package TEMA2;

import java.util.Scanner;

public class Problemas1b {



        public static void main(String[] args) {
            Scanner drum = new Scanner(System.in);
            System.out.println("Introduceti tipul de drum:");
            String tipDrum = drum.nextLine();
            var lt = tipDrum.toLowerCase();
            if (lt.equals("oras")) {
                System.out.println("Viteza maxima in oras este de 50 Km/h");
            }
            else if(lt.equals("zona rezidentiala")){
                System.out.println("Viteza maxima in Zona Rezidentiala este de 30 Km/h");
            }
            else if(lt.equals("drum express")){
                System.out.println("Viteza maxima in Drum Express este de 100 Km/h");
            }
            else if(lt.equals("autostrada")){
                System.out.println("Viteza maxima in Autostrada este de 130 Km/h");
            }
            else {
                System.out.println(" 0 ");
            }
        }


}

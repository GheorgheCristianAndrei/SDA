package TEMA2;
import java.util.*;

public class Problemas2 {
    public static void main(String[] args) {

        double temperatura[] = {36.2,37.6,38.7,35.3,37.2,31.9,39.4,40.0,35.5};
        double temperaturiA[] = new double [9];
        double temperaturiN[] = new double [9];
        int countN[] = new int[9];
        int countA[] = new int[9];
        int maxl = 9;
        double max = 37.0;
        int ctn = 0 ;// ctn = contor Temperaturi normale
        int cta = 0 ;// cta = contor Temperaturi anormale



        for(int i =0 ; i<maxl; i++ ){
            if (temperatura[i] < 37.0){
                temperaturiN[ctn] = temperatura[i];
                countN[ctn] = i;
                ctn =ctn+ 1;

            }else{
                temperaturiA[cta] = temperatura[i];
                countA[cta] = i;
                cta =cta+ 1;
            }
        }
        System.out.println(" Temperaturi normale :");
        System.out.println("Pacient:   Temperatura:");
        for(int i = 0; i < ctn; i++){
            System.out.println( countN[i] + "          " + temperaturiN[i]);

        }

        System.out.println("Temperaturi anormale :");
        System.out.println("Pacient:   Temperatura:");
        for(int i = 0; i < cta; i++){
            System.out.println(countA[i] + "          " + temperaturiA[i]);

        }
    }
}

package TEMA2;
import java.util.*;

public class Problemas2 {
    public static void main(String[] args) {

        double temperatura[] = new double[9];
        double temperaturiA[] = new double [9];
        double temperaturiN[] = new double [9];
        int countN[] = new int[9];
        int countA[] = new int[9];
        int maxl = 9;
        double max = 37.0;
        int ctn = 0 ;// ctn = contor Temperaturi normale
        int cta = 0 ;// cta = contor Temperaturi anormale

        temperatura[0]= 36.2;
        temperatura[1]= 37.6;
        temperatura[2]= 38.7;
        temperatura[3]= 35.3;
        temperatura[4]= 37.2;
        temperatura[5]= 31.9;
        temperatura[6]= 39.4;
        temperatura[7]= 40.0;
        temperatura[8]= 35.5;

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

package TEMA1;

import java.util.Scanner;
public class TEMA1{


    public static void main(String[] args)
    {
        int nr1,nr2,suma,diferenta,produs,distanta;
        float avg;
        Scanner sc = new Scanner(System.in);
        nr1=sc.nextInt();
        nr2=sc.nextInt();

        suma = nr1+nr2;
        diferenta = nr1-nr2;
        produs = nr1*nr2;
        avg=(float)(nr1+nr2)/2;
        System.out.println("Suma este : "+suma);
        System.out.println("Diferenta este : "+diferenta);
        System.out.println("Produsul este : "+produs);
        System.out.println("Media este : "+avg);
        System.out.println("Maximul este : " + Math.max(nr1, nr2));
        System.out.println("Minimul este : " +  Math.min(nr1, nr2));
        if(nr1>nr2)
        {
            distanta = nr1 - nr2;
        }
        else {
            distanta = nr2 - nr1;
        }
        System.out.println("Distanta este : "+ distanta);
    }


}


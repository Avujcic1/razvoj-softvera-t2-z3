package sample;

import java.util.Scanner;

public class PretragaRijeci {
    public static void main(String[] args) {
        System.out.println("Unesite recenicu: ");
        Scanner ulaz = new Scanner(System.in);
        String recenica = ulaz.nextLine();
        String[] rijeci = recenica.split(" ");
        String max=rijeci[0];
        String temp="";
        for(int i=0; i<rijeci.length; i++) {
            if(rijeci[i].length() >= max.length())
                max = rijeci[i];
        }
        String Vmax = max.toUpperCase();
        System.out.println(max + " je najduza rijec u recenici, a nakon transforamcije izgleda kao " + Vmax);
    }
}

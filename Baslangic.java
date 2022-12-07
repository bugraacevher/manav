package Giris;

import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
        int armut,elma,domates,muz,patlican;
        double toplam;
        double armutFiyat = 2.14, elmaFiyat = 3.67, domatesFiyat = 1.11, muzFiyat = 0.95, patlicanFiyat = 5.00 ;


        Scanner i = new Scanner(System.in);

        System.out.print("Armut kac kilo : ");
        armut = i.nextInt();
        System.out.print("Elma kac kilo : ");
        elma = i.nextInt();
        System.out.print("Domates kac kilo : ");
        domates = i.nextInt();
        System.out.print("Muz kac kilo : ");
        muz = i.nextInt();
        System.out.print("Patlican kac kilo : ");
        patlican = i.nextInt();

        toplam = armut * armutFiyat + elmaFiyat * elma + domates * domatesFiyat + muz * muzFiyat + patlican * patlicanFiyat;
        System.out.print("Toplam Tutar : "+toplam);

    }
}

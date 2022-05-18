import java.util.Scanner;
import java.util.ArrayList;

public class Tugas1 {
    public static void main(String[] args) {
//        hitungVocal();
//        faktorial();
//        bilanganPrima();
        palindrome();

    }
    private static void hitungVocal(){
        int nVocal = 0;
        int nCons = 0;
        int nAngka = 0;
        int nSpace = 0;
        int nSpecialchar = 0;

        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan Kalimat : ");
        String kalimat = inp.nextLine();

//      Convert inputan user menjadi Uppercase semua
        kalimat = kalimat.toUpperCase();

//        System.out.println(kalimat.charAt(0));

//      Perulangan Cek Huruf
        for (int i = 0; i < kalimat.length() ; i++) {
            char huruf= kalimat.charAt(i);

            if(huruf=='A' || huruf=='I' || huruf=='U' || huruf=='E' || huruf=='O'){
                nVocal++;
            } else if(huruf >='A' && huruf <='Z') {
                nCons++;
            } else if(huruf >= '0' && huruf<='9') {
                nAngka++;
            } else if(huruf==' '){
                nSpace++;
            } else {
                nSpecialchar++;
            }
        }
        System.out.println(kalimat);
        System.out.println();
        System.out.println("Total Karakter\t: " + kalimat.length());
        System.out.println("Jumlah Huruf Vokal\t: " + nVocal + " huruf");
        System.out.println("Jumlah Huruf Konsonan\t: " + nCons + " huruf");
        System.out.println("Jumlah Char Angka : "+nAngka);
        System.out.println("Jumlah Char Spasi : "+nSpace);
        System.out.println("Jumlah Char Spesial : "+nSpecialchar);
    }
    private static void faktorial(){
        Scanner inp = new Scanner(System.in);

        System.out.print("Masukkan Angka : ");
        int angka = inp.nextInt();

        ArrayList faktorial = new ArrayList();

        for (int j = 1; j <= angka ; j++) {
            if (angka%j == 0) {
                faktorial.add(j);
            }
        }
        System.out.println(faktorial);
    }
    private static void bilanganPrima(){
        Scanner inp = new Scanner(System.in);

        System.out.print("Masukkan Sebuah Bilangan : ");
        int angka = inp.nextInt();
        int faktor = 0;

        for (int i = 2; i <= angka ; i++) {
            if (angka%i == 0) {
                faktor++;
            }
        }
        if (faktor == 1) {
            System.out.println(angka + " Adalah Bilangan Prima");
        } else {
            System.out.println(angka + " Bukan Bilangan Prima");
            System.out.println("Karena memiliki "+faktor+" bilangan faktor");
        }
    }
    private static void palindrome(){
        String balik = "";

        Scanner inp = new Scanner(System.in);

        System.out.print("Masukkan Kata : ");
        String kata = inp.nextLine();

        int panjang = kata.length();

//      contoh = katak => panjang = 5
        for (int i = panjang-1; i >=0 ; i--) {
            balik += kata.charAt(i);
//          balik = balik + kata.charAt(i);
        }

        if (balik.equalsIgnoreCase(kata)) {
            System.out.println(kata + " Adalah Kata/ Kalimat Palindrome");
        } else {
            System.out.println(kata + " Bukan Kata/ Kalimat Palindrome");
        }
    }
}

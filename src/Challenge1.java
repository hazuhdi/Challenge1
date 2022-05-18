import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int menu = 0;
        do {
            System.out.println("-----------------------------------");
            System.out.println("Kalkulator Penghitung Luas & Volume");
            System.out.println("-----------------------------------");
            System.out.println("Menu");
            System.out.println("1. Hitung Luas Bidang");
            System.out.println("2. Hitung Volume");
            System.out.println("0. Tutup Aplikasi");
            System.out.println("-----------------------------------");
            System.out.print("Pilihan Anda [1/2/0] : ");
            menu = inp.nextInt();
            System.out.println("-----------------------------------");

            if (menu == 1) {
                int pilihan = 0;
                do {
                    System.out.println("-------------------------------");
                    System.out.println("Pilih Bidang Yang Akan Dihitung");
                    System.out.println("-------------------------------");
                    System.out.println("1. Persegi");
                    System.out.println("2. Lingkaran");
                    System.out.println("3. Segitiga");
                    System.out.println("4. Persegi Panjang");
                    System.out.println("5. Kembali Ke Menu Sebelumnya");
                    System.out.println("-------------------------------");
                    System.out.print("Pilihan Anda [1/2/3/4/5] : ");
                    pilihan = inp.nextInt();
                    System.out.println("-------------------------------");

                    switch (pilihan) {
                        case 1:
                            luasPersegi();
                            pilihan = 5;
                            break;
                        case 2:
                            luasLingkaran();
                            pilihan=5;
                            break;
                        case 3:
                            luasSegitiga();
                            pilihan=5;
                            break;
                        case 4:
                            luasPersegiPanjang();
                            pilihan=5;
                            break;
                    }
                } while (pilihan != 5);
            }
            if (menu == 2) {
                int pilihan = 0;
                do {
                    System.out.println("-------------------------------");
                    System.out.println("Pilih Bidang Yang Akan Dihitung");
                    System.out.println("-------------------------------");
                    System.out.println("1. Volume Kubus");
                    System.out.println("2. Volume Balok");
                    System.out.println("3. Volume Tabung");
                    System.out.println("4. Kembali Ke Menu Sebelumnya");
                    System.out.println("-------------------------------");
                    System.out.print("Pilihan Anda [1/2/3/4] : ");
                    pilihan = inp.nextInt();
                    System.out.println("-------------------------------");

                    switch (pilihan) {
                        case 1:
                            volKubus();
                            pilihan=4;
                            break;
                        case 2:
                            volBalok();
                            pilihan=4;
                            break;
                        case 3:
                            volTabung();
                            pilihan=4;
                            break;
                    }
                } while (pilihan != 4);
            }
        } while (menu!=-0);
        System.out.println("====Program Diakhiri======");
        System.out.println("      Terimakasih");
    }

//    Method Luas Bangun
    public static void luasPersegi(){
        Scanner inp = new Scanner(System.in);

        System.out.println("----------------------------");
        System.out.println("Anda Memilih Persegi ");
        System.out.println("----------------------------");
        System.out.print("Masukkan Sisi\t: ");
        int sisi = inp.nextInt();
        int lPersegi = sisi * sisi;
        System.out.println();
        System.out.println("Processing...");
        System.out.println();
        System.out.println("Luas dari Persegi adalah "+lPersegi);
        PressAnyKey();
    }
    public static void luasLingkaran(){
        Scanner inp = new Scanner(System.in);
        double phi = 3.14;

        System.out.println("----------------------------");
        System.out.println("Anda Memilih Lingkaran ");
        System.out.println("----------------------------");
        System.out.print("Masukkan jari-jari\t: ");
        int jari = inp.nextInt();

        double lLingkaran = phi * jari * jari;

        System.out.println();
        System.out.println("Processing...");
        System.out.println();
        System.out.println("Luas dari Lingkaran adalah "+lLingkaran);
        PressAnyKey();
    }
    public static void luasSegitiga(){
        Scanner inp = new Scanner(System.in);

        System.out.println("----------------------------");
        System.out.println("Anda Memilih Segitiga ");
        System.out.println("----------------------------");
        System.out.print("Masukkan Nilai Alas\t : ");
        int alas = inp.nextInt();
        System.out.print("Masukkan Nilai Tinggi\t :");
        int tinggi = inp.nextInt();

        double lSegitiga = 0.5*alas*tinggi;
        System.out.println();
        System.out.println("Processing...");
        System.out.println();
        System.out.println("Luas dari Segitiga adalah "+lSegitiga);
        PressAnyKey();
    }
    public static void luasPersegiPanjang(){
        Scanner inp = new Scanner(System.in);

        System.out.println("----------------------------");
        System.out.println("Anda Memilih Persegi Panjang ");
        System.out.println("----------------------------");
        System.out.print("Masukkan Nilai Panjang\t : ");
        int panjang = inp.nextInt();
        System.out.print("Masukkan Nilai Lebar\t :");
        int lebar = inp.nextInt();

        double lPPanjang = panjang*lebar;
        System.out.println();
        System.out.println("Processing...");
        System.out.println();
        System.out.println("Luas dari Segitiga adalah "+lPPanjang);
        PressAnyKey();
    }

//    Method Volume Bangun
    public static void volKubus(){
        Scanner inp = new Scanner(System.in);

        System.out.println("----------------------------");
        System.out.println("Anda Memilih Volume Kubus ");
        System.out.println("----------------------------");
        System.out.print("Masukkan Sisi\t : ");
        int sisi = inp.nextInt();

        int vKubus = sisi*sisi*sisi;
        System.out.println();
        System.out.print("Processing...");
        System.out.println();
        System.out.println("Volume dari Kubus adalah "+vKubus);
        PressAnyKey();
    }
    public static void volBalok(){
        Scanner inp = new Scanner(System.in);

        System.out.println("----------------------------");
        System.out.println("Anda Memilih Volume Balok ");
        System.out.println("----------------------------");
        System.out.print("Masukkan Panjang\t : ");
        int pjg = inp.nextInt();
        System.out.print("Masukkan Lebar\t : ");
        int lbr = inp.nextInt();
        System.out.print("Masukkan Tinggi\t : ");
        int t = inp.nextInt();

        int vBalok = pjg*lbr*t;
        System.out.println();
        System.out.println("Processing...");
        System.out.println();
        System.out.println("Volume dari Balok adalah "+vBalok);
        PressAnyKey();
    }
    public static void volTabung(){
        Scanner inp = new Scanner(System.in);
        double phi = 3.14;

        System.out.println("----------------------------");
        System.out.println("Anda Memilih Volume Tabung ");
        System.out.println("----------------------------");
        System.out.print("Masukkan Jari-jari\t : ");
        int jari2 = inp.nextInt();
        System.out.print("Masukkan Tinggi\t : ");
        int tinggi = inp.nextInt();

       double vTabung = phi*jari2*tinggi;
        System.out.println();
        System.out.println("Processing...");
        System.out.println();
        System.out.println("Volume dari vTabung adalah "+vTabung);
        PressAnyKey();
    }

    public static void PressAnyKey() {
        Scanner inp = new Scanner(System.in);

//        System.out.print("Tekan Anykey untuk kembali ke menu utama");
//        char press = inp.next().charAt(0);
//
//        if (press>='a' && press<='z'){
//            main(null);
//        }
        System.out.print("Tekan Enter untuk kembali ke menu utama");
        try
        {
            System.in.read();
        }
        catch(Exception e)
        {}
    }
}

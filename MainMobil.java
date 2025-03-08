import java.util.Scanner;

public class MainMobil {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); //Jawaban untu nomor 3 

        // Instan objek bernama m1
        System.out.println("MOBIL PERTAMA");
        Mobil m1 = new Mobil();
        System.out.println("Masukkan kecepatan mobil yang pertama dalam km/jam");
        m1.setKecepatan(scan.nextInt());
        scan.nextLine();
        System.out.println("Masukkan nama manufaktur mobil yang pertama");
        m1.setManufaktur(scan.nextLine());
        System.out.println("Masukkan plat nomor mobil yang pertama 'AB 1241 UA' "); 
        m1.setNoPlat(scan.nextLine());
        System.out.println("Masukkan warna mobil yang pertama");
        m1.setWarna(scan.nextLine());
        System.out.println("Masukkan waktu mobil pertama dalam satuan jam"); //User input waktu dalam satuan jam
        m1.setWaktu(scan.nextInt());
        m1.displayMessage();

         // Instan objek bernama m2
        System.out.println("================");
        System.out.println("MOBIL KEDUA");
        Mobil m2 = new Mobil();
        System.out.println("Masukkan kecepatan mobil yang kedua dalam km/jam");
        m2.setKecepatan(scan.nextInt());
        scan.nextLine();
        System.out.println("Masukkan nama manufaktur mobil yang kedua");
        m2.setManufaktur(scan.nextLine());
        System.out.println("Masukkan plat nomor mobil yang kedua 'AB 1241 UA' "); 
        m2.setNoPlat(scan.nextLine());
        System.out.println("Masukkan warna mobil yang kedua");
        m2.setWarna(scan.nextLine());
        System.out.println("Masukkan waktu mobil kedua dalam satuan jam"); //User input waktu dalam satuan jam
        m2.setWaktu(scan.nextInt());
        scan.nextLine();
        m2.displayMessage();
        System.out.println("================");

        System.out.println("Mobil pertama akan berubah warna, pilih warna untuk mobil pertama yang baru:");
        m1.setWarna(scan.nextLine()); // Mengubah warna mobil pertama
        m1.displayMessage(); 

        scan.close();

         //Muhammad Kensya Kussyahputra Hidayatullah

        
    }
}
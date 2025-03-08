public class Mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan;
    private double waktu;

    public void setNoPlat(String s) {
        noPlat = s;
    }

    public void setWarna(String s) {
        warna = s;
    }

    public void setManufaktur(String s) {
        manufaktur = s;
    }

    public void setKecepatan(int i) {
        kecepatan = i;
        System.out.println("Kecepatan dalam meter/sekon adalah: " + rubahKecapatan(kecepatan) + " m/s");//dipanggil pada method setKecepatan
    }

    public void setWaktu(double t) { //Jawaban untuk nomor 4 membuat method setWaktu dalam satuan jam 
        waktu = t;
    }

    public double rubahSekon(double t) { //Jawaban untuk nomor 5 
        return t * 3600; //rumus merubah dari jam ke sekon
    }

    public double rubahKecapatan(int kecapatan){ //Jawaban untuk nomor 6
        return kecapatan/3.6; //rumus merubah dari km/jam ke m/s
    }

    public double hitungJarak(int kecepatan, double waktu){ //Jawaban untuk nomor 7
        return kecepatan*waktu; //rumus menghitung jarak dengan menggunakan kecepatan dan waktu
    }

    public void displayMessage() {
        System.out.println("Mobil anda adalah bermerek " + manufaktur);
        System.out.println("mempunyai nomor plat " + noPlat);
        System.out.println("serta memiliki warna " + warna);
        System.out.println("dan mampu menempuh kecepatan " + kecepatan + " km/jam");
        System.out.println("kalau kecepatan dalam meter/sekon adalah " + rubahKecapatan(kecepatan) + " m/s");
        System.out.println("dengan waktu " + waktu + " jam");
        System.out.println(",kalau waktu dalam sekon adalah " + rubahSekon(waktu) + " sekon");
        System.out.println(",menempuh jarak " + hitungJarak(kecepatan, waktu) + " meter" + " kalau dalam km adalah " + hitungJarak(kecepatan, waktu)/1000 + " km"); //Jawaban untuk nomor 8 serta men-display jarak dalam meter dan merubahnya menjadi km
        

        //Muhammad Kensya Kussyahputra Hidayatullah

    }
}
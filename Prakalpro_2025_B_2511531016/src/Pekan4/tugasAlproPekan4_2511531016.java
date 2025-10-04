package Pekan4;
import java.util.Scanner;
public class tugasAlproPekan4_2511531016 {
	
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        String nama;
        int jumlahTiket, hari, waktu, studio;
        double hargaDasar = 50000, hargaPerTiket, subtotal, diskon = 0, totalBayar;
        double biayaHari = 0, biayaWaktu = 0, biayaStudio = 0;

        System.out.println("===== PEMBELIAN TIKET BIOSKOP =====");
        System.out.print("Nama Pembeli : ");
        nama = input.nextLine();
        System.out.print("Jumlah Tiket : ");
        jumlahTiket = input.nextInt();
        if (jumlahTiket <= 0) {
            System.out.println("Error: Jumlah tiket harus lebih dari 0.");
            return;
        }
        System.out.print("Hari (1=Senin-Kamis, 2=Jumat, 3=Sabtu-Minggu): ");
        hari = input.nextInt();
        if (hari < 1 || hari > 3) {
            System.out.println("Error: Input hari tidak valid.");
            return;
        }
        System.out.print("Waktu Tayang (1=Pagi, 2=Siang, 3=Malam): ");
        waktu = input.nextInt();
        if (waktu < 1 || waktu > 3) {
            System.out.println("Error: Input waktu tayang tidak valid.");
            return;
        }
        System.out.print("Jenis Studio (1=Reguler, 2=Deluxe, 3=Premium): ");
        studio = input.nextInt();
        if (studio < 1 || studio > 3) {
            System.out.println("Error: Input jenis studio tidak valid.");
            return;
        }

        switch (hari) {
            case 1: biayaHari = 0; break;
            case 2: biayaHari = 0.1; break;
            case 3: biayaHari = 0.3; break;
        }
        switch (waktu) {
            case 1: biayaWaktu = 0; break;
            case 2: biayaWaktu = 0.2; break;
            case 3: biayaWaktu = 0.5; break;
        }
        switch (studio) {
            case 1: biayaStudio = 0; break;
            case 2: biayaStudio = 0.25; break;
            case 3: biayaStudio = 0.5; break;
        }
        
        hargaPerTiket = hargaDasar + (hargaDasar * biayaHari)
                        + (hargaDasar * biayaWaktu)
                        + (hargaDasar * biayaStudio);
        subtotal = hargaPerTiket * jumlahTiket;
        if (subtotal >= 200000) {
            diskon = subtotal * 0.2;
        }
        totalBayar = subtotal - diskon;

        System.out.println("\n===== STRUK PEMBELIAN =====");
        System.out.println("Nama Pembeli  : " + nama);
        System.out.println("Jumlah Tiket  : " + jumlahTiket);
        System.out.println("Hari          : " + (hari==1?"Senin-Kamis":hari==2?"Jumat":"Sabtu-Minggu"));
        System.out.println("Waktu Tayang  : " + (waktu==1?"Pagi":waktu==2?"Siang":"Malam"));
        System.out.println("Jenis Studio  : " + (studio==1?"Reguler":studio==2?"Deluxe":"Premium"));
        System.out.println("-------------------------------");
        System.out.println("Harga Dasar   : Rp " + hargaDasar + "/tiket");
        System.out.println("Biaya Hari    : +" + (int)(biayaHari*100) + "%");
        System.out.println("Biaya Waktu   : +" + (int)(biayaWaktu*100) + "%");
        System.out.println("Harga per Tiket: Rp " + hargaPerTiket);
        System.out.println("Subtotal      : Rp " + subtotal);
        System.out.println("Diskon        : Rp " + diskon);
        System.out.println("-------------------------------");
        System.out.println("TOTAL BAYAR   : Rp " + totalBayar);

        input.close();
    }
}

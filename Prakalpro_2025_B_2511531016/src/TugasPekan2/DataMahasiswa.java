package TugasPekan2;

import java.util.Scanner;

public class DataMahasiswa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Masukkan NIM: ");
		String nim = input.nextLine();

		System.out.print("Masukkan Nama Lengkap: ");
		String nama = input.nextLine();

		System.out.print("Masukkan Umur: ");
		int umur = input.nextInt();

		// Konversi umur menjadi String
		String umurString = String.valueOf(umur);

		// Konversi NIM menjadi Long dan tambahkan dengan umur
		long nimLong = Long.parseLong(nim);
		long hasilPenambahan = nimLong + umur;

		System.out.println("=== Data Mahasiswa ===");
		System.out.println("NIM\t\t: " + nim);
		System.out.println("Nama\t\t: " + nama);
		System.out.println("Umur\t\t: " + umur + " tahun");
		System.out.println("Umur (String)\t: " + umurString);
		System.out.println("NIM + Umur\t: " + hasilPenambahan);

		input.close();
	}

}

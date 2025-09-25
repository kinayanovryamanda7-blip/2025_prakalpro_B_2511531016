package Pekan3;
import java.util.Scanner;
public class HitungVolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

        // Input jari-jari dan tinggi
        System.out.print("Masukkan jari-jari tabung: ");
        double r = input.nextDouble();

        System.out.print("Masukkan tinggi tabung: ");
        double t = input.nextDouble();

        // Menghitung volume tabung
        double volume = 3.14 * r * r * t;

        // Menampilkan hasil
        System.out.println("Volume tabung = " + volume);
	}

}

package Pekan6_2511531016;
import java.util.Random;
import java.util.Scanner;
public class tugasAlproPekan6_2511531016 {
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        String jawab;
        int percobaan = 0;
        boolean menang = false;

        do {
            int dadu1 = rand.nextInt(6) + 1; // angka dari 1 sampai 6
            int dadu2 = rand.nextInt(6) + 1;
            int jumlah = dadu1 + dadu2;

            percobaan++;

            System.out.println(dadu1 + " + " + dadu2 + " = " + jumlah);

            if (jumlah == 7) {
                System.out.println("Tebakan Anda Benar");
                System.out.println("Anda menang setelah " + percobaan + " percobaan!");
                menang = true;
                break;
            } else {
                System.out.println("Tebakan Anda Salah");
                System.out.print("Apakah mau lempar dadu (ya / tidak?) ");
                jawab = input.next();

                if (jawab.equalsIgnoreCase("tidak")) {
                    System.out.println("Anda gagal menang");
                    break;
                }
            }
        } while (true);

        input.close();
    }
}

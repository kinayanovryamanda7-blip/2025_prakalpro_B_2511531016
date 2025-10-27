package Pekan5;

public class tugasNestedFor {

	    public static void main(String[] args) {
	        int[] titik = {0, 4, 8, 12, 12, 8, 4, 0};
	        int lebarMaks = 12; // jumlah titik terbanyak di tengah
	        int totalLebarIsi = lebarMaks + 4; // lebar isi maksimum (<> di kiri & kanan)
	        int lebarFrame = totalLebarIsi + 8; // tambah spasi kiri-kanan agar rata tengah

	        System.out.print("#");
	        for (int i = 0; i < lebarFrame; i++) {
	            System.out.print("=");
	        }
	        System.out.println("#");

	        for (int i = 0; i < titik.length; i++) {
	            System.out.print("|");

	            int spasi = (lebarFrame - (titik[i] + 4)) / 2;
	            for (int s = 0; s < spasi; s++) {
	                System.out.print(" ");
	            }

	            if (titik[i] == 0) {
	                System.out.print("<><>");
	            } else {
	                System.out.print("<>");
	                for (int j = 0; j < titik[i]; j++) {
	                    System.out.print(".");
	                }
	                System.out.print("<>");
	            }

	            for (int s = 0; s < spasi; s++) {
	                System.out.print(" ");
	            }

	            System.out.println("|");
	        }

	        System.out.print("#");
	        for (int i = 0; i < lebarFrame; i++) {
	            System.out.print("=");
	        }
	        System.out.println("#");
	    }
	}
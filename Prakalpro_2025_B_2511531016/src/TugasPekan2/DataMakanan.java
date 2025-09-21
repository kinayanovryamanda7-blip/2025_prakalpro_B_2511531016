package TugasPekan2;

public class DataMakanan {

	public static void main(String[] args) {
		// Deklarasi variabel
		String namaMakanan = "Nasi Goreng Spesial";
		int jumlahKalori = 600;
		float hargaMakanan = 25000.0f;
		char tingkatKepedasan = 'S'; 
		boolean mengandungMSG = true;
		
		// Menampilkan data makanan
		System.out.println("=== Data Makanan ===");
		System.out.println("Nama\t\t : " + namaMakanan);
		System.out.println("Kalori\t\t : " + jumlahKalori + " kcal ");
		System.out.println("Harga\t\t : Rp " + hargaMakanan);
		System.out.println("Tingkat Kepedasan : " + tingkatKepedasan);
		System.out.println("Mengandung MSG\t : " + mengandungMSG);
	}

}

package Pekan2;

public class DeklarasiVariabel1 {
	/* program java
	 * latihan
	 * tentang pendeklarasian variabel
	 */
	static int umur=25; /* variabel dapat langsung di inisasi */
	public static void main (String[] args) {
		int kode;
		boolean isDibawahUmur; /* perhatikan penulisan nama variabel */
		kode = 1234; /* pengisian variabel (assignment)*/
		double gaji; /* deklarasi variabel dapat dimana saja */
		gaji = 5500000.23;
		isDibawahUmur = true;
		System.out.println("Status: "+isDibawahUmur);
		System.out.println("Kode:"+kode);
		System.out.println("Umur:"+umur);
		System.out.println("Gaji:"+gaji);
	}

}

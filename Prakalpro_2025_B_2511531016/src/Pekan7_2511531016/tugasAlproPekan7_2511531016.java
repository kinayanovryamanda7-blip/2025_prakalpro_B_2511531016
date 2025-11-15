package Pekan7_2511531016;
import java.util.Scanner;
public class tugasAlproPekan7_2511531016 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		akun akun = new akun();
		
		System.out.println("===== REGISTRASI AKUN BARU =====");
		
		System.out.print("Masukkan Username: ");
		String username = scan.nextLine();
		akun.setUsername(username);
		
		System.out.print("Masukkan Password: ");
		String password = scan.nextLine();
		akun.setPassword(password);
		
		System.out.print("Masukkan Email: ");
		String email = scan.nextLine();
		akun.setEmail(email);
		
		System.out.print("Masukkan PIN Angka (misal 6 digit): ");
		int pinAngka = scan.nextInt();
		akun.setPinAngka(pinAngka);
		
		System.out.println("");
		
		int pinInt = akun.getPinAngka();
		String pinString = String.valueOf(pinInt);
		
		int pinPlus = pinInt + 10;
		String pinStringPlus = pinString + "10";
		
		boolean passwordValid = akun.isPasswordValid();
		boolean emailValid = akun.isEmailValid();
		
		if (!passwordValid || !emailValid) {
			System.out.println("Registrasi Gagal!");
			if (!passwordValid) {
				System.out.println("Error: Password harus memiliki panjang minimal 8 karakter.");
				System.out.println("Silahkan coba lagi.");
			}
			if (!emailValid) {
				System.out.println("Error: Email harus mengandung karakter '@' dan '.'.");
				System.out.println("Silahkan coba lagi.");
			}
		} else {
			System.out.println("---- REGISTRASI BERHASIL ----");
			System.out.println("akun untuk " + username + " telah berhasil dibuat.");
			System.out.println("");
			System.out.println("---- Detail Akun ----");
			System.out.println("Username: "+ akun.getUsername().toLowerCase());
			System.out.println("Password: "+ "*".repeat(akun.getPassword().length()) + " (panjang: " + akun.getPassword().length() + ")");
			System.out.println("Email: "+ akun.getEmail().toUpperCase());
			System.out.println("ID Pengguna: "+ akun.getUsername().toLowerCase() + akun.getPinAngka());
			System.out.println("");
			System.out.println("---- Uji Tipe Data (PIN Anda: " + akun.getPinAngka() + ") ----");
			System.out.println("PIN (int) + 10 = " + pinPlus);
			System.out.println("PIN (String) + \"10\" = " + pinStringPlus);
		}
		scan.close();
	}

}
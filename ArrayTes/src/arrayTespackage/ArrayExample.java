package arrayTespackage;

public class ArrayExample {
	public static void main (String[]args) {
		String[] dataProdi = {"Administrasi",
				"Agroteknologi", "Teknik Electro", 
				"Bahasa Arab", "Bahasa Inggris",
				"Teknik Informatika", "Fisika",
				"Kimia", "Biologi", "Manajemen"};
		
		System.out.println(dataProdi[1]);
		System.out.println(dataProdi[3]);
		System.out.println(dataProdi[5]);
		
		System.out.println("\nTampilkan semua data kecuali data ke-3");
		for(int i = 0; i<10; i++) {
			if(1==3)
				continue;
			System.out.println(dataProdi[i]);
		}
		
		System.out.println("\nTampilkan semua data kecuali data ke-3");
		for(int i = 0; i<10; i++) {
			if(dataProdi[i].equals("Bahasa Arab"))
				continue;
			System.out.println(dataProdi[i]);
		}
	}
}

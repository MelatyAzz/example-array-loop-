import java.util.Scanner;

public class ArrayLoop18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membuat array 10 baris dan 5 kolom
        int[][] array = new int[10][5];
        boolean[] found = new boolean[1]; // Array untuk menandai penemuan angka 8
        
        // Mengambil input dari pengguna untuk mengisi array
        System.out.println("Masukkan 50 angka (10 baris, 5 kolom):");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("Masukkan angka untuk array[%d][%d]: ", i, j);
                array[i][j] = scanner.nextInt();
            }
        }

        // Mengalikan setiap elemen array dengan 3 dan mencari angka 8
        System.out.println("\nTabel Hasil Setelah Dikali 3:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                int result = array[i][j] * 3;
                System.out.printf("%d\t", result);
                
                // Menandai penemuan angka 8
                found[0] = (result == 8) || found[0]; // Menggunakan OR untuk menandai
            }
            System.out.println();
        }

        // Menampilkan hasil pencarian
        System.out.println(found[0] ? "Angka 8 ditemukan dalam hasil." : "Angka 8 tidak ditemukan dalam hasil.");

        // Menutup scanner
        scanner.close();
    }
}
// Program rekursi untuk menghitung jumlah kombinasi dari n buah item yang dipilih sebanyak r kali

import java.util.Scanner;

// Class untuk menjalankan program
public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("---------------------------------------------------------------");
        System.out.println();
        System.out.println("NOTE : masukkan nilai n >= r");
        System.out.println();
        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();
        System.out.print("Masukkan nilai r: ");
        int r = input.nextInt();
        int result = kombinasi(n, r);
        System.out.println();
        System.out.println("Jumlah kombinasi dari " + n + " item yang diambil " + r + " kali adalah " + result);
        System.out.println();
        System.out.println("---------------------------------------------------------------");
        input.close();
    }
    
    // Method untuk menghitung jumlah kombinasi
    public static int kombinasi(int n, int r) {
        if (r == 0 || r == n) {
            return 1;
        } else {
            // rumus kombinasi :
            // C(n, r) = C(n-1, r-1) + C(n-1, r)
            return kombinasi(n-1, r-1) + kombinasi(n-1, r);
        }
    }
}

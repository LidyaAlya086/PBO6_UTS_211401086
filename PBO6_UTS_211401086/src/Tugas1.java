import java.util.Scanner;

// Class untuk mobil
class Mobil {
    // Variabel untuk menyimpan posisi mobil
    private int posisiX;
    private int posisiY;

    // Konstruktor mobil
    public Mobil() {
        posisiX = 0;
        posisiY = 0;
    }

    // METHOD UNTUK MENGGERAKKAN MOBIL

    // Maju sebanyak n satuan
    public void maju(int n) {
        posisiY += n;
    }

    // Mundur sebanyak n satuan
    public void mundur(int n) {
        posisiY -= n;
    }

    // Ke kiri sebanyak n satuan
    public void kiri(int n) {
        posisiX -= n;
    }

    // Ke kanan sebanyak n satuan
    public void kanan(int n) {
        posisiX += n;
    }

    // Method untuk mendapatkan posisi mobil
    public String getPosisi() {
        return "Posisi mobil saat ini (X,Y): (" + posisiX + "," + posisiY + ")";
    }
}

// Class untuk remote control
class RemoteControl {
    // Variabel untuk menyimpan mobil yang dikendalikan
    private Mobil mobil;

    // Konstruktor remote control
    public RemoteControl(Mobil mobil) {
        this.mobil = mobil;
    }

    // Method untuk menjalankan remote control
    public void jalankan() {
        Scanner scanner = new Scanner(System.in);
        boolean selesai = false;
        while (!selesai) {
            System.out.println("------------------------------------------------");
            System.out.println(mobil.getPosisi());
            System.out.println("Pilih aksi (maju, mundur, kiri, kanan, selesai):");
            String aksi = scanner.nextLine();
            switch (aksi) {
                case "maju":
                    System.out.println("Masukkan jumlah satuan: ");
                    int jarakMaju = scanner.nextInt();
                    scanner.nextLine();
                    mobil.maju(jarakMaju);
                    System.out.println();
                    System.out.println("Mobil maju sejauh " + jarakMaju + " satuan");
                    break;
                case "mundur":
                    System.out.println("Masukkan jumlah satuan: ");
                    int jarakMundur = scanner.nextInt();
                    scanner.nextLine();
                    mobil.mundur(jarakMundur);
                    System.out.println();
                    System.out.println("Mobil mundur sejauh " + jarakMundur + " satuan");
                    break;
                case "kiri":
                    System.out.println("Masukkan jumlah satuan: ");
                    int jarakKiri = scanner.nextInt();
                    scanner.nextLine();
                    mobil.kiri(jarakKiri);
                    System.out.println();
                    System.out.println("Mobil bergerak ke kiri sejauh " + jarakKiri + " satuan");
                    break;
                case "kanan":
                    System.out.println("Masukkan jumlah satuan: ");
                    int jarakKanan = scanner.nextInt();
                    scanner.nextLine();
                    mobil.kanan(jarakKanan);
                    System.out.println();
                    System.out.println("Mobil bergerak ke kanan sejauh " + jarakKanan + " satuan");
                    break;
                case "selesai":
                    selesai = true;
                    System.out.println();
                    break;
                default:
                    System.out.println();
                    System.out.println("Aksi tidak valid");
                    break;
            }
        }
        scanner.close();
    }
}

// Class untuk menjalankan program
public class Tugas1 {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        RemoteControl remoteControl = new RemoteControl(mobil);
        remoteControl.jalankan();
    }
}

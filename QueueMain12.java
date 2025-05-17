import java.util.Scanner;

public class QueueMain12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLayanan12 queue = new QueueLayanan12();
        int pilih;

        do {
            System.out.println("\n==== Menu Antrian Layanan Unit Kemahasiswaan ====");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Panggil Mahasiswa dari Antrian");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Lihat Antrian Terakhir");
            System.out.println("5. Tampilkan Semua Antrian");
            System.out.println("6. Cek Antrian Kosong");
            System.out.println("7. Cek Antrian Penuh");
            System.out.println("8. Jumlah Mahasiswa dalam Antrian");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt(); sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    Mahasiswa_12 mhs = new Mahasiswa_12(nim, nama, prodi, kelas);
                    queue.enqueue(mhs);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.peekFront();
                    break;
                case 4:
                    queue.peekRear();
                    break;
                case 5:
                    queue.printAntrian();
                    break;
                case 6:
                    System.out.println(queue.isEmpty() ? "Antrian kosong." : "Antrian tidak kosong.");
                    break;
                case 7:
                    System.out.println(queue.isFull() ? "Antrian penuh." : "Antrian masih tersedia.");
                    break;
                case 8:
                    queue.count();
                    break;
                case 9:
                    queue.clear();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilih != 0);
    }
}

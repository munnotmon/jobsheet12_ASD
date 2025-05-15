import java.util.Scanner;

public class SLLMain12 {
    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);
        SingleLinkedList12 sll = new SingleLinkedList12();

        System.out.print("\nMasukkan jumlah data yang ingin ditambahkan: ");
        int jumlah = sc12.nextInt();
        sc12.nextLine(); // buang newline

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data Mahasiswa ke-" + (i+1));
            System.out.print("Nama  : ");
            String nama = sc12.nextLine();
            System.out.print("NIM   : ");
            String nim = sc12.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc12.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc12.nextDouble();
            sc12.nextLine();

            Mahasiswa12 mhs = new Mahasiswa12(nim, nama, kelas, ipk);
            sll.addLast(mhs);
            sll.print();
        }
    }
}
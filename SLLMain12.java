import java.util.Scanner;

public class SLLMain12 {
    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);
        SingleLinkedList12 sll = new SingleLinkedList12();

        Mahasiswa12 mhs1 = new Mahasiswa12("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa12 mhs2 = new Mahasiswa12("23212201", "Bimon", "2B", 3.8);
        Mahasiswa12 mhs3 = new Mahasiswa12("22212202", "Cintia", "3C", 3.5);
        Mahasiswa12 mhs4 = new Mahasiswa12("21212203", "Dirga", "4D", 3.6);
        
        sll.print();
        sll.addFirst(mhs4);
       
        sll.print();
        sll.addLast(mhs1);

        sll.print();
        sll.insertAfter("Dirga", mhs3);

        sll.insertAt(2, mhs2);
        sll.print();
    }
}
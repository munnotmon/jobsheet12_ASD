import java.util.Scanner;

public class SLLMain12 {
    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);
        SingleLinkedList12 sll = new SingleLinkedList12();

        Mahasiswa12 mhs1 = new Mahasiswa12("Alvaro", "24212200", "1A", 4.0);
        Mahasiswa12 mhs2 = new Mahasiswa12("Bimon", "23212201", "2B", 3.8);
        Mahasiswa12 mhs3 = new Mahasiswa12("Cintia", "22212202", "3C", 3.5);
        Mahasiswa12 mhs4 = new Mahasiswa12("Dirga", "21212203", "4D", 3.6);
        
        sll.addLast(mhs4);
        sll.addLast(mhs3);  
        sll.addLast(mhs2); 
        sll.addLast(mhs1); 

        System.out.println("\nData index 1 : ");
        sll.getData(1);
        
        System.out.println("\nData mahasiswa atas nama Bimon berada pada index : " + sll.indexOf("Bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}

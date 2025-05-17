public class QueueLayanan12 {
    NodeAntrian12 front, rear;
    int size = 0;
    final int MAX = 5; 

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return size == MAX;
    }

    public void enqueue(Mahasiswa_12 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh. Tidak bisa menambah mahasiswa.");
            return;
        }

        NodeAntrian12 newNode = new NodeAntrian12(mhs);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Mahasiswa berhasil ditambahkan ke dalam antrian.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong. Tidak ada mahasiswa untuk dipanggil.");
            return;
        }

        System.out.println("Memanggil mahasiswa:");
        front.data.tampilInformasi();
        front = front.next;
        size--;

        if (front == null) {
            rear = null;
        }
    }

    public void peekFront() {
        if (!isEmpty()) {
            System.out.print("Mahasiswa terdepan: ");
            front.data.tampilInformasi();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.print("Mahasiswa terakhir: ");
            rear.data.tampilInformasi();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void printAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Daftar Mahasiswa dalam Antrian:");
            NodeAntrian12 current = front;
            int no = 1;
            while (current != null) {
                System.out.print(no++ + ". ");
                current.data.tampilInformasi();
                current = current.next;
            }
        }
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }

    public void count() {
        System.out.println("Jumlah mahasiswa dalam antrian: " + size);
    }
}

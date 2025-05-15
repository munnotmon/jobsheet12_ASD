public class SingleLinkedList12 {
    NodeMahasiswa12 head;
    NodeMahasiswa12 tail;

    public boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
            NodeMahasiswa12 tmp = head;
            System.out.println("\nIsi Linked List:\t");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("\nLinked List Kosong");
        }
    }

    public void addFirst(Mahasiswa12 input){
        NodeMahasiswa12 ndInput = new NodeMahasiswa12(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Mahasiswa12 input) {
        NodeMahasiswa12 ndInput = new NodeMahasiswa12(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, Mahasiswa12 input) {
        NodeMahasiswa12 ndInput = new NodeMahasiswa12(input, null);
        NodeMahasiswa12 temp = head;

        do { 
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt(int index, Mahasiswa12 input){
        if (index < 0) {
            System.out.println("index salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            NodeMahasiswa12 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new NodeMahasiswa12(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
}

//commit
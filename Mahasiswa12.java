public class Mahasiswa12 {
    String nim, nama, kelas;
    double ipk;

    public Mahasiswa12() {

    }

    public Mahasiswa12(String nama, String nim, String kelas, double ipk){
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.printf("%-8s %-10s %-4s %.1f\n", nama, nim, kelas, ipk);
    }
}


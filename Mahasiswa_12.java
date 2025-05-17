public class Mahasiswa_12 {
    String nim, nama, prodi, kelas;

    public Mahasiswa_12(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilInformasi() {
        System.out.printf("%-10s %-10s %-6s %-6s\n", nama, nim, prodi, kelas);
    }
    
}



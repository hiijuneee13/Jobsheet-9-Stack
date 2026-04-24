public class Mahasiswa {
    // Langkah 2: Atribut sesuai class diagram
    String nim;
    String nama;
    String kelas;
    int nilai;

    // Konstruktor default
    public Mahasiswa() {}

    // Langkah 3: Konstruktor berparameter, nilai default = -1
    public Mahasiswa(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1;
    }

    // Langkah 4: Method tugasDinilai untuk mengeset nilai
    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}

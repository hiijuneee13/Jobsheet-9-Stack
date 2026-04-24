public class Mahasiswa25 {
    // Langkah 2: Atribut sesuai class diagram
    String nim;
    String nama;
    String kelas;
    int nilai;

    // Konstruktor default
    public Mahasiswa25() {}

    // Langkah 3: Konstruktor berparameter, nilai default = -1
    public Mahasiswa25(String nama, String nim, String kelas) {
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

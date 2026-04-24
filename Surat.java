public class Surat {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin; // S = sakit, I = izin keperluan lain
    int durasi;

    // Konstruktor default
    public Surat() {}

    // Konstruktor berparameter
    public Surat(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }
}

import java.util.Scanner;

public class MahasiswaDemo {
    public static void main(String[] args) {
        // Langkah 16: Instansiasi stack kapasitas 5
        StackTugasMahasiswa stack = new StackTugasMahasiswa(5);
        // Langkah 17: Deklarasi Scanner dan variabel pilih
        Scanner scan = new Scanner(System.in);
        int pilih;

        // Langkah 18: Menu dengan do-while
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Lihat Tugas Terbawah");    // Pertanyaan No.4
            System.out.println("6. Hitung Tugas Terkumpul");  // Pertanyaan No.5
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;

                case 2:
                    // Percobaan 2: tambahkan konversi biner setelah penilaian
                    Mahasiswa dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        scan.nextLine();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                        // Baris tambahan Percobaan 2
                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.println("Nilai Biner Tugas: " + biner);
                    }
                    break;

                case 3:
                    Mahasiswa lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;

                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;

                case 5:
                    // Pertanyaan No.4 — Lihat tugas terbawah
                    Mahasiswa bawah = stack.peekBottom();
                    if (bawah != null) {
                        System.out.println("Mahasiswa pertama yang mengumpulkan tugas: " + bawah.nama);
                    }
                    break;

                case 6:
                    // Pertanyaan No.5 — Hitung jumlah tugas terkumpul
                    int jumlah = stack.countTugas();
                    System.out.println("Jumlah tugas yang sudah dikumpulkan: " + jumlah);
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <= 6);

        scan.close();
    }
}

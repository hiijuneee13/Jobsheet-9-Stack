public class StackSurat {
    Surat[] stack;
    int size;
    int top;

    public StackSurat(int size) {
        this.size = size;
        stack = new Surat[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    // Push: terima surat masuk
    public void push(Surat surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Stack penuh! Tidak bisa menerima surat lagi.");
        }
    }

    // Pop: proses/validasi surat teratas
    public Surat pop() {
        if (!isEmpty()) {
            Surat s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk diproses.");
            return null;
        }
    }

    // Peek: lihat surat teratas tanpa mengeluarkan
    public Surat peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat izin.");
            return null;
        }
    }

    // Cari surat berdasarkan nama mahasiswa (linear search)
    public boolean cariSurat(String nama) {
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                return true;
            }
        }
        return false;
    }

    // Tampilkan semua surat
    public void print() {
        if (isEmpty()) {
            System.out.println("Belum ada surat yang masuk.");
        } else {
            for (int i = top; i >= 0; i--) {
                String jenis = (stack[i].jenisIzin == 'S' || stack[i].jenisIzin == 's')
                        ? "Sakit" : "Izin";
                System.out.println(stack[i].idSurat + "\t" + stack[i].namaMahasiswa
                        + "\t" + stack[i].kelas + "\t" + jenis + "\t" + stack[i].durasi + " hari");
            }
        }
        System.out.println("");
    }
}

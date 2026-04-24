public class StackTugasMahasiswa25 {
    // Langkah 6: Atribut sesuai class diagram
    Mahasiswa25[] stack;
    int size;
    int top;

    // Langkah 7: Konstruktor berparameter
    public StackTugasMahasiswa25(int size) {
        this.size = size;
        stack = new Mahasiswa25[size];
        top = -1;
    }

    // Langkah 8: Method isFull
    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    // Langkah 9: Method isEmpty
    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    // Langkah 10: Method push
    public void push(Mahasiswa25 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    // Langkah 11: Method pop
    public Mahasiswa25 pop() {
        if (!isEmpty()) {
            Mahasiswa25 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    // Langkah 12: Method peek
    public Mahasiswa25 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    // Langkah 13: Method print — loop dari top ke 0 (LIFO)
    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }

    // === PERTANYAAN NO.4: Lihat tugas terbawah (pertama dikumpulkan) ===
    public Mahasiswa25 peekBottom() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }

    // === PERTANYAAN NO.5: Hitung jumlah tugas yang sudah dikumpulkan ===
    public int countTugas() {
        return top + 1;
    }

    // === PERCOBAAN 2: Konversi nilai desimal ke biner ===
    public String konversiDesimalKeBiner(int nilai) {
        StackKonvers25i stack = new StackKonvers25i();
        while (nilai > 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}

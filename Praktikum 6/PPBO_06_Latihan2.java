import java.util.ArrayList;
import java.util.HashMap;

public class PPBO_06_Latihan2 {
    public static void main(String[] args) {
        // pembuatan ArrayList mahasiswa
        ArrayList<Mahasiswa> mahasiswaArray = new ArrayList<Mahasiswa>();
        mahasiswaArray.add(new Mahasiswa("ABDI SANTYATMOKO", "M0521001", 2021));
        mahasiswaArray.add(new Mahasiswa("ADELINE FELLITA MARWA", "M0521002", 2021));
        mahasiswaArray.add(new Mahasiswa("ADI PRASETYA", "M0521003", 2021));
        mahasiswaArray.add(new Mahasiswa("ADITIA PRASETYA NUGRAHA", "M0521004", 2021));
        mahasiswaArray.add(new Mahasiswa("ADITYA TEGAR KARUNIA PUTRA TARRA'", "M0521005", 2021));

        // Tulis kode kalian di sini
        HashMap<String,Mahasiswa> HashMapMHS = new HashMap<String, Mahasiswa>();
        for (Mahasiswa mahasiswa : mahasiswaArray) {
            HashMapMHS.put(mahasiswa.NIM, mahasiswa);
        }
        for (HashMap.Entry<String, Mahasiswa> set : HashMapMHS.entrySet()) {
            System.out.printf("key: %s => data mahasiswa: %s, %s, %d\n", 
            set.getKey(),
            set.getValue().nama,
            set.getValue().NIM,
            set.getValue().angkatan);
        }
    }
}

class Mahasiswa {
    public String nama;
    public String NIM;
    public int angkatan;

    Mahasiswa(String nama, String NIM, int angkatan){
        this.nama = nama;
        this.NIM = NIM;
        this.angkatan = angkatan;
    }
}
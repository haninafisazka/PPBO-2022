public class PPBO_06_Latihan1 {

    static class Mahasiswa{
        public String nim;
        public static int angka_nim = -1;
        public Mahasiswa(){
            angka_nim++;
            nim = String.format("%04d", angka_nim); 
        }
    }
    
    static class Kelas{
        public static  char namaKelas = ('A'-0b1);
        private int jumlah = 0;
        public static Mahasiswa [] mahasiswaArray = new Mahasiswa[5];
        Kelas(){
            namaKelas++;
            for(; jumlah<5; jumlah++){
                mahasiswaArray [jumlah] = new Mahasiswa();
            }
        }
    }
    
    public static void main(String[] args) {
        Kelas[] kelas = new Kelas[5];
        
        for (int i = 0; i < kelas.length; i++){
            kelas[i] = new Kelas();
    
            System.out.println("Kelas " + kelas[i].namaKelas);
            
            for (int j = 0; j < kelas[i].mahasiswaArray.length; j++){
                System.out.print(" " + kelas[i].mahasiswaArray[j].nim);
                
            }
    
            System.out.println();
        }
    }
}
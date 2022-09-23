// Nama : Hanina Nafisa Azka
// NIM  : M0521027
class PPBO_02_Latihan3 {
    String nim, nama, alamat;
    char jenisKelamin;

    public PPBO_02_Latihan3 (String nim, String nama, char jenisKelamin, String alamat){
      this.nim = nim;
      this.nama = nama;
      this.jenisKelamin = jenisKelamin;
      this.alamat = alamat;
    }

    public static void main(String[] args) {
        PPBO_02_Latihan3 mhs = new PPBO_02_Latihan3 ("M0501001", "Patrick Star", 'L', "Bikini Bottom");

        System.out.printf ("%-16s: %s\n%-16s: %s\n%-16s: %s\n%-16s: %s\n",
        "NIM", mhs.nim,
        "Nama", mhs.nama,
        "Jenis Kelamin", mhs.jenisKelamin,
        "Alamat", mhs.alamat);
    }
}
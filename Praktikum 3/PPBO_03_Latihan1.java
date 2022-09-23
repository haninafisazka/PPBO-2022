// Nama : Hanina Nafisa Azka 
// NIM  : M0521027

import java.util.Scanner;

class PPBO_03_Latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int harga;
        int jumlah;
        int diskon;
        int total;
        System.out.println ("============= PROGRAM KASIR =============");
        System.out.println ("Masukkan harga barang : ");
        harga = input.nextInt ();
        System.out.println ("Masukkan jumlah barang : ");
        jumlah = input.nextInt ();
        System.out.println ("=========================================");
        total = harga*jumlah;
        System.out.println ("Total = "+total);
        System.out.println ("=========================================");

        total = harga*jumlah;
        if (125000 < total){
          diskon = total * 20/100;
          total = total - diskon;
          System.out.println ("Selamat, anda mendapatkan diskon 20%");
          System.out.println ("Total yang harus dibayar "+total);
        }
        else if (75000 <= total){
          diskon = total * 15/100;
          total = total - diskon;
          System.out.println ("Selamat, anda mendapatkan diskon 15%");
          System.out.println ("Total yang harus dibayar "+total);
        }
        else if (50000 <= total){
          diskon = total * 5/100;
          total = total - diskon;
          System.out.println ("Selamat, anda mendapatkan diskon 5%");
          System.out.println ("Total yang harus dibayar "+total);
        }
        else if (50000 > total){
          diskon = total * 0/100;
          total = total - diskon;
          System.out.println ("Maaf, anda tidak mendapatkan diskon");
          System.out.println ("Total yang harus dibayar "+total);
        }
    }
}
        
        // tambahkan code untuk menyimpan nominal total pembelian
        // tambahkan code untuk mengimplementasikan ketentuan diskon yang ditetapkan
        
        // tambahkan code untuk menampilkan nominal yang harus dibayar 
        // sesuai dengan ketentuan diskon yang diberikan

// Seorang mahasiswa berbelanja di mini market. Mini market tersebut memberikan diskon kepada
// pembeli dengan ketentuan
// a. Diskon 0% jika total pembelian di bawah 50.000
// b. Diskon 5% jika total pembelian 50.000 hingga 75.000
// c. Diskon 15% jika total pembelian di atas 75.000 hingga 125.000
// d. Diskon 20% jika total pembelian di atas 125.000
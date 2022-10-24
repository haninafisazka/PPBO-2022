// Nama :Hanina Nafisa Azka
// NIM  :M0521027

import java.util.Scanner;

public class PPBO_04_Latihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ketik bilangan pertama : ");
        int bil1 = sc.nextInt();
        System.out.print("Ketik bilangan kedua : ");
        int bil2 = sc.nextInt();
        double hasil = Double.valueOf(bil1) / Double.valueOf(bil2);
        System.out.println(bil1 + " / " + bil2 + " = " + hasil);
        sc.close();
    }
}

/* a. Ketik huruf misalnya f untuk input bilangan pertama kemudian tekan ENTER
 - Apakah program masih dapat dijalankan setelah user memasukkan f sebagai input untuk bilangan pertama?
Jawab : Ya, program masih dapat dijalankan
 - Tulis output yang muncul!
Jawab :
Exception in thread "main" java.util.InputMismatchException
        at java.base/java.util.Scanner.throwFor(Scanner.java:939)
        at java.base/java.util.Scanner.next(Scanner.java:1594)
        at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
        at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
        at PPBO_04_Latihan1.main(PPBO_04_Latihan1.java:10)

 - Jelaskan maksud dari output tersebut! 
Jawab :
Output tersebut berarti bahwa input yang dimasukkan oleh user tidak sesuai dengan tipe data yang ada
*/


/* b. Pilih salah satu angka sebagai bilangan pertama misal 5, kemudian ketik angka 0 untuk input bilangan kedua. 
    Jelaskan output yang muncul!
 - Tulis output yang muncul!
Jawab :
5/0 = Infinity
 - Jelaskan maksud dari output tersebut!
Jawab : 
Pada variabel hasil dalam source code tersebut menggunakan tipe data berupa dounle yang memungkinkan adanya pembagian dengan 0 (nol). Pembagian dengan 0 (nol) akan menghasilkan output berupa Infinity
*/

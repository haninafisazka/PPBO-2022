//Nama    : Hanina Nafisa Azka
//NIM     : M0521027

import java.util.Scanner;

class PPBO_03_Latihan2 {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println ("Enter year : ");
        year = sc.nextInt();
        System.out.println ("======================");

        if (year%4 == 0){
          System.out.println (year + " is a leap year");
        }
        else {
          System.out.println (year + " is not a leap year");
        }
        
        // tuliskan kodemu di sini
            

        sc.close();
    }
}

// Buatlah conditional statement untuk melakukan pengecekan terhadap input variabel 'year'
// Cek apakah input merupakan tahun kabisat
// Jika tahun kabisat, berikat output '... is a leap year'
// Jika bukan tahun kabisat, berikan output '... is not a leap year'
// ... di atas maksudnya adalah nilai variabel 'year' yang diinputkan

// Contoh 
// input : 2020
// output : 2020 is a leap year

// Contoh
// input : 2031
// output : 2031 is not a leap year
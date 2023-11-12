import java.util.Scanner;

/**
 * PemilihanPercobaan103
 */
public class PemilihanPercobaan103 {

    public static void main(String[] args) {
        Scanner input03= new Scanner (System.in);

        System.out.print("Masukan angka: ");
        int angka = input03.nextInt();
        String jenis =(angka % 2 == 0 ) ? "genap" : "ganjil";
        System.out.println(jenis);  

            
        }
    }

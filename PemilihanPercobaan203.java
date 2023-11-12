import java.util.Scanner;

/**
 * PemilihanPercobaan203
 */
public class PemilihanPercobaan203 {

    public static void main(String[] args) {
        
        
        Scanner input03 = new Scanner(System.in);
        System.out.print("Nilai uas  : ");
        float uas = input03.nextFloat();
        System.out.print("Nilai uts  : ");
        float uts = input03.nextFloat();
        System.out.print("Nilai kuis : ");
        float kuis =input03.nextFloat();
        System.out.print("Nilai tugas: ");
        float tugas = input03.nextFloat();
        
        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        String message = total <65 ? "Remidi" : "Tidak Remidi";
        System.out.println("Nilai akhir = " + total + "sehingga" + message);
        
        if(total >80){
            System.out.println("Mendapatkan Nilai A  ");
        }else if (total >=80){
            System.out.println("Mendapatkan Nilai B+ ");
        }else if (total >=73){
            System.out.println("Mendapatkan Nilai B  ");
        }else if (total >=65){
            System.out.println("Mendapatkan Nilai C+ ");
        }else if (total >=60){
            System.out.println("Mendapatkan Nilai C  ");
        }else if (total >=50){
            System.out.println("Mendapatkan Nilai D  ");
        }else if (total >=39){
            System.out.println("Mendapatkan Nilai E  ");
        }
        }
        


    }



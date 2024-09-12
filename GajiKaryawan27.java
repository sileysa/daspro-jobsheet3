import java.util.Scanner;
public class GajiKaryawan27 {
    public static void main(String[] args) {
        
        int jumlahJam, upahPerJam;
        float persenBonus = 10/100f, persenPajak = 5/100f;
        
        //1. input
        Scanner sc = new Scanner(System.in);
        jumlahJam = sc.nextInt();
        upahPerJam = sc.nextInt();

        //2. hitung gaji
        int totalGaji = jumlahJam * upahPerJam;
        float bonus = persenBonus * totalGaji;
        int totalGajiPlusBonus = totalGaji + (int)bonus;
        float pajak = persenPajak * totalGajiPlusBonus;
        int gajiBersih = totalGajiPlusBonus - (int)pajak;
        
        //3. output
        System.out.println("Total Gaji = " + totalGaji);
        System.out.println("Bonus = " + bonus);
        System.out.println("Pajak = " + pajak);
        System.out.println("Gaji Bersih = " + gajiBersih);
    }
}

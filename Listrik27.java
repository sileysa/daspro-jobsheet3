import java.util.Scanner;
public class Listrik27 {
    public static void main(String[] args) {
        int totalPenggunaanListrik;
        int tarif = 1500;

        //1. input
        Scanner sc = new Scanner(System.in);
        totalPenggunaanListrik = sc.nextInt();

        //2. hitung tarif
        double totalTarif = tarif * totalPenggunaanListrik;

        //3. output
        System.out.println("Lebih dari 500kwh? " + (totalPenggunaanListrik>500));
        System.out.println("Total tarif = " + totalTarif);
    }
}

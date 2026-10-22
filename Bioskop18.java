import java.util.Scanner;
 
public class Bioskop18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int hargaTiket = 50000;
        int jumlahPelanggan, totalTiket = 0;
        double totalPenjualan = 0;
 
        System.out.print("Masukkan jumlah pelanggan hari ini: ");
        jumlahPelanggan = sc.nextInt();
 
        int i = 1;
        while (i <= jumlahPelanggan) {
            System.out.print("Jumlah tiket pelanggan ke-" + i + ": ");
            int tiket = sc.nextInt();
 
            if (tiket < 0) {
                System.out.println("Input tidak valid. Masukkan jumlah tiket yang benar!");
                continue;
            }
 
            double diskon = 0;
            if (tiket > 10) {
                diskon = 0.15;
            } else if (tiket > 4) {
                diskon = 0.10;
            }
 
            double harga = tiket * hargaTiket;
            double bayar = harga - (harga * diskon);
 
            System.out.println("Diskon: " + (int) (diskon * 100) + "%");
            System.out.println("Total bayar pelanggan ke-" + i + ": Rp " + (long) bayar);
 
            totalTiket += tiket;
            totalPenjualan += bayar;
            i++;
        }
 
        System.out.println("=== Rekap Penjualan Hari Ini ===");
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp " + (long) totalPenjualan);
    }
}

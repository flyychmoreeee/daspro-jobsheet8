import java.util.Scanner;

public class Tugas319 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlah_toko, jumlah_pelanggan, jumlah_barang, total_barang, total_seluruh_barang = 0, barang_terbanyak = -1,
                toko_terbanyak = 1;

        System.out.print("Masukkan jumlah toko: ");
        jumlah_toko = sc.nextInt();

        while (jumlah_toko < 1) {
            System.out.print("Jumlah toko minimal 1. Ulangi");
            jumlah_toko = sc.nextInt();
        }

        for (int i = 1; i <= jumlah_toko; i++) {
            System.out.print("Masukkan jumlah pelanggan toko " + i + ": ");
            jumlah_pelanggan = sc.nextInt();

            while (jumlah_pelanggan < 0) {
                System.out.print("Jumlah pelanggan tidak boleh kurang dari 0 (negatif). Ulangi");
                jumlah_pelanggan = sc.nextInt();
            }

            total_barang = 0;

            for (int j = 1; j <= jumlah_pelanggan; j++) {
                System.out.print("Jumlah barang pelanggan " + j + ": ");
                jumlah_barang = sc.nextInt();

                while (jumlah_barang < 0) {
                    System.out.print("Jumlah barang pelanggan tidak boleh kurang dari 0 (negatif). Ulangi");
                    jumlah_barang = sc.nextInt();
                }

                total_barang += jumlah_barang;
            }

            System.out.println("Toko " + i + " - pelanggan: " + jumlah_pelanggan + ", total barang: " + total_barang);

            total_seluruh_barang += total_barang;

            if (total_barang > barang_terbanyak) {
                barang_terbanyak = total_barang;
                toko_terbanyak = i;
            }
        }

        System.out.println("Total barang seluruh toko: " + total_seluruh_barang);
        System.out.println("Toko dengan barang terbanyak: " + toko_terbanyak);

        sc.close();
    }
}

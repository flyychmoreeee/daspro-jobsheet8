import java.util.Scanner;

public class Tugas219 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, jumlah = 0;

        System.out.print("Masukkan nilai n = ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int hasil = i * j;

                System.out.printf("%4d", hasil);
                jumlah += hasil;
            }
            System.out.println();
        }

        System.out.println("Jumlah seluruh angka: " + jumlah);
        sc.close();
    }
}

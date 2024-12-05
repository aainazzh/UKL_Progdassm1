import java.util.Scanner;

public class UKLSU1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();
        
        int[] nilaiUjian = new int[jumlahSiswa];
        
        for (int a = 0; a < jumlahSiswa; a++) {
            System.out.print("Masukkan nilai ujian siswa ke-" + (a + 1) + ": ");
            nilaiUjian[a] = scanner.nextInt();
        }
        
        double totalNilai = 0;
        for (double nilai : nilaiUjian) {
            totalNilai += nilai;
        }
        
        double rataRata = totalNilai / jumlahSiswa;
        
        System.out.println("Rata-rata nilai siswa: " + rataRata);
        scanner.close(); 
        }
}
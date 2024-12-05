import java.util.Scanner;
public class UKLM1{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int JarakMinim = 10;
        int harga1 = 4250;
        int harga2 = 6000;
        int harga3 = 50000;
        int VolumeMinim = 100;

        System.out.println("Masukkan berat paket : " + "cm");
        int berat = input.nextInt();
        System.out.println("Masukkan jarak tempuh : " + "km");
        int jarak = input.nextInt();
        System.out.println("Masukkan panjang :");
        int p = input.nextInt();
        System.out.println("Masukkan lebar : ");
        int l = input.nextInt();
        System.out.println("Masukkan tinggi : ");
        int t = input.nextInt();

        int Volume = p*l*t;

        if (jarak <= JarakMinim){
            int hasil1 = harga1*berat;
            if (Volume > VolumeMinim){
                int Hasil = hasil1 + harga3;
                System.out.println("biaya yang harus dibayar : " + Hasil);
                }else{
                    System.out.println("biaya yang harus dibayar : " + hasil1);
                }
            }else if (jarak > JarakMinim){
                int hasil2 = harga2*berat;
                if (Volume > VolumeMinim){
                    int Hasil = hasil2 + harga3;
                    System.out.println("Biaya yang harus dibayar Rp. " + Hasil);
                }else{
                    System.out.println("Biaya yang harus dibayar Rp. " + hasil2);}
            }

    }
}
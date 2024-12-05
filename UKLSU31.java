import java.util.Scanner;
public class UKLSU31{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah data input array: ");
        int datainput = scanner.nextInt();
        
        int[] inputray = new int[datainput];
        
        for (int i = 0; i < datainput; i++) {
            System.out.print("Masukkan data input array ke-" + (i + 1) + ": ");
            inputray[i] = scanner.nextInt();
        }
        System.out.println("Nilai yang dimasukkan:");
        for (int i = 0; i < datainput; i++) {
            System.out.println("Nilai ke-" + (i + 1) + ": " + inputray[i]);
        }
        System.out.println("Frekuensi Data");
        for (int i = 0; i < datainput; i++) {
            int count = 1;  
            
            if (inputray[i] == -1) {
                continue;
            }
            for (int j = i + 1; j < datainput; j++) {
                if (inputray[i] == inputray[j]) {
                    count++; 
                    inputray[j] = -1;  
                }
            }

            
            System.out.println(inputray[i] + " muncul " + count + " kali");
        }
        scanner.close(); 
    }
}
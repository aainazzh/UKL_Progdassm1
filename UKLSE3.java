import java.util.Random;
import java.util.Scanner;

public class UKLSE3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Kuis Matematika Sederhana!");
        System.out.println("Ketik 'exit' untuk berhenti.");

        while (true) {
            int num1 = random.nextInt(10) + 1; 
            int num2 = random.nextInt(10) + 1; 
            int operator = random.nextInt(3);  
            int jawabanBenar = 0;
            String Operator = "";

            if (operator == 0) { 
                jawabanBenar = num1 * num2;
                Operator = "*";
            } else if (operator == 1) {
                num1 = num1 * num2; 
                jawabanBenar = num1 / num2;
                Operator = "/";
            } else { 
                jawabanBenar = num1 % num2;
                Operator = "%";
            }

            System.out.println("Berapa hasil dari: " + num1 + " " + Operator + " " + num2 + " ?");
            System.out.print("Jawaban Anda: ");
            String input = scanner.nextLine();
            
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Terima kasih telah bermain!");
                break;
            }

            int jawabanPengguna = Integer.parseInt(input); 
            if (jawabanPengguna == jawabanBenar) {
                System.out.println("Benar!");
            } else {
                System.out.println("Salah. Jawaban yang benar adalah " + jawabanBenar);
            }
            System.out.println(); 
        }

        scanner.close(); 
    }
}
public class UKLSU3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 3, 4};

        int[] frekuensi = new int[array.length]; 
        boolean[] sudahDihitung = new boolean[array.length]; 

        for (int i = 0; i < array.length; i++) {
            if (!sudahDihitung[i]) { 
                int count = 1; 
                for (int a = i + 1; a < array.length; a++) {
                    if (array[i] == array[a]) { 
                        count++; 
                        sudahDihitung[a] = true; 
                    }
                }
                frekuensi[i] = count; 
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (!sudahDihitung[i]) { 
                System.out.println(array[i] + " muncul " + frekuensi[i] + " kali");
            }
        }
    }
}
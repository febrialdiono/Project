
package inputoutput;

import java.util.Scanner;

public class InputOutputFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.println("Program penjumlahan sangat sederhana");
         System.out.println("Masukan Angka Pertama : ");
         int value = scanner.nextInt();
         System.out.println("Masukan Angka Kedua");
         int anotherValue = scanner.nextInt();
         int result = value +anotherValue;
         System.out.println("hasilnya adalah : " + result);
    }
}

package TinhDoPhucTapThuatToan;

import java.util.Scanner;

public class AlgorithmComplexityText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap tu");
        String Inputstring = scanner.nextLine();
        int[] frequentChar = new int[225];
        for (int i = 0; i < Inputstring.length(); i++) {
            int value = (int) Inputstring.charAt(i);
            frequentChar[value] += 1;
        }
        int max = 0;
        char character = (char) 255;
        for (int j = 0; j < 255; j++) {
            if (frequentChar[j] > max) {
                max = frequentChar[j];
                character = (char) j;
            }
        }
        System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");
    }
}
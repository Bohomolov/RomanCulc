package culc;

import java.util.Scanner;

public class TestCulc {

    public static String[] romanNumber10 = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    public static String[] romanNumber100 = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXX", "XC"};
    public static String[] romanNumber1000 = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM",};
    public static String[] romanNumber10000 = {"", "M", "MM", "MMM", "MV", "V", "VM",};

    public static void main(String[] args) {

        int[] arabicOut = new int[100];

        String[] romanNumbersOut = new String[100];

        Scanner inNumbers = new Scanner(System.in);

        System.out.println("Enter arabic numbers: ");

        int arabic = inNumbers.nextInt();

        for (int i = 0; i < 5; i++) {

            if (arabic % 10 < 10 && arabic % 10 != 0) {
                arabicOut[0] = arabic % 10;
            }
            if (arabic % 100 < 100 && arabic % 100 != 0) {
                arabic -= arabic % 10;
                arabicOut[1] = arabic % 100;
            }
            if (arabic % 1000 < 1000 && arabic % 1000 != 0) {
                arabic -= arabic % 100;
                arabicOut[2] = arabic % 1000;
            }
            if (arabic % 10000 < 10000 && arabic % 10000 != 0) {
                arabic -= arabic % 1000;
                arabicOut[3] = arabic % 10000;
            }
        }
        romanNumbersOut[0] = romanNumber10[arabicOut[0]];
        romanNumbersOut[1] = romanNumber100[arabicOut[1] / 10];
        romanNumbersOut[2] = romanNumber1000[arabicOut[2] / 100];
        romanNumbersOut[3] = romanNumber10000[arabicOut[3] / 1000];

        for (int i = 6; i >= 0; i--) {
            if (romanNumbersOut[i] != null)
                System.out.print(romanNumbersOut[i]);
        }
        inNumbers.close();
    }
}

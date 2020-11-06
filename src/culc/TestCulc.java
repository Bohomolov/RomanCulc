package culc;

import java.util.Scanner;

public class TestCulc {

    public static String[] romanNumber = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XX", "XXX", "XL", "L",
    "LX","LXX","LXX","XC","C","CC","CCC","CD","D","DC","DCC","DCCC","CM","M"};


    public static void main(String[] args) {

        String[] romanNumbersOut = new String[100];

        Scanner inNumbers = new Scanner(System.in);

        System.out.println("Enter arabic numbers: ");

        int arabic = inNumbers.nextInt();

        for (int i = 0; i < 5; i++) {

            if (arabic % 10 == 1) {
                romanNumbersOut[0] = romanNumber[0];
                arabic -= 1;

            } else if (arabic % 10 == 2) {
                romanNumbersOut[0] = romanNumber[1];
                arabic -= 2;

            } else if (arabic % 10 == 3) {
                romanNumbersOut[0] = romanNumber[2];
                arabic -= 3;

            } else if (arabic % 10 == 4) {
                romanNumbersOut[0] = romanNumber[3];
                arabic -= 4;

            } else if (arabic % 10 == 5) {
                romanNumbersOut[0] = romanNumber[4];
                arabic -= 5;

            } else if (arabic % 10 == 6) {
                romanNumbersOut[0] = romanNumber[5];
                arabic -= 6;

            } else if (arabic % 10 == 7) {
                romanNumbersOut[0] = romanNumber[6];
                arabic -= 7;

            } else if (arabic % 10 == 8) {
                romanNumbersOut[0] = romanNumber[7];
                arabic -= 8;

            } else if (arabic % 10 == 9) {
                romanNumbersOut[0] = romanNumber[8];
                arabic -= 9;

            } else if (arabic % 100 == 10) {
                romanNumbersOut[1] = romanNumber[9];
                arabic -= 10;

            } else if (arabic % 100 == 20) {
                romanNumbersOut[1] = romanNumber[10];
                arabic -= 20;

            } else if (arabic % 100 == 30) {
                romanNumbersOut[1] = romanNumber[11];
                arabic -= 30;

            } else if (arabic % 100 == 40) {
                romanNumbersOut[1] = romanNumber[12];
                arabic -= 40;

            } else if (arabic % 100 == 50) {
                romanNumbersOut[1] = romanNumber[13];
                arabic -= 50;

            } else if (arabic % 100 == 60) {
                romanNumbersOut[1] = romanNumber[14];
                arabic -= 60;

            } else if (arabic % 100 == 70) {
                romanNumbersOut[1] = romanNumber[15];
                arabic -= 70;

            } else if (arabic % 100 == 80) {
                romanNumbersOut[1] = romanNumber[16];
                arabic -= 80;
            }else if (arabic % 100 == 90) {
                romanNumbersOut[1] = romanNumber[17];
                arabic -= 90;
            }else if (arabic % 1000 == 100) {
                romanNumbersOut[2] = romanNumber[18];
                arabic -= 100;
            }else if (arabic % 1000 == 200) {
                romanNumbersOut[2] = romanNumber[19];
                arabic -= 200;
            }else if (arabic % 1000 == 300) {
                romanNumbersOut[2] = romanNumber[20];
                arabic -= 300;
            }else if (arabic % 1000 == 400) {
                romanNumbersOut[2] = romanNumber[21];
                arabic -= 400;
            }else if (arabic % 1000 == 500) {
                romanNumbersOut[2] = romanNumber[22];
                arabic -= 500;
            }else if (arabic % 1000 == 600) {
                romanNumbersOut[2] = romanNumber[23];
                arabic -= 600;
            }else if (arabic % 1000 == 700) {
                romanNumbersOut[2] = romanNumber[24];
                arabic -= 700;
            }else if (arabic % 1000 == 800) {
                romanNumbersOut[2] = romanNumber[25];
                arabic -= 800;
            }else if (arabic % 1000 == 900) {
                romanNumbersOut[2] = romanNumber[26];
                arabic -= 900;
            }else if (arabic % 10000 == 1000) {
                romanNumbersOut[3] = romanNumber[27];
                arabic -= 1000;
            }
        }
        if (romanNumbersOut[5] != null)
            System.out.print(romanNumbersOut[5]);
        if (romanNumbersOut[4] != null)
            System.out.print(romanNumbersOut[4]);
        if (romanNumbersOut[3] != null)
            System.out.print(romanNumbersOut[3]);
        if (romanNumbersOut[2] != null)
            System.out.print(romanNumbersOut[2]);
        if (romanNumbersOut[1] != null)
            System.out.print(romanNumbersOut[1]);
        if (romanNumbersOut[0] != null)
            System.out.print(romanNumbersOut[0]);
    }
}

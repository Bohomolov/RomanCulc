package culc;

import java.util.Scanner;

//Я решил написать метод о котором ты говорил что бы получать числа от остатка деления, а потом его уже както прикрутить
//к масиву стрингов с римскими числами. С числами от 1 до 9999 проблем никаких  нет, а вот после цикл работать как надо не хочет.

public class CulcMain {

    public static void main(String[] args) {

        Scanner inNumbers = new Scanner(System.in);         // сканер для ввода арабских чисел

        System.out.println("Enter arabic numbers: ");

        int arabic = inNumbers.nextInt();

        for (int i = 0; i < 1 ; i++) {                      // начало цикла

            int one_ten = arabic % 10;                      // переменная для вычисления 1-9
            System.out.println(one_ten);

            int ten_hundred = arabic - one_ten;             // создаю переменную для десятков 10 - 90 и отнимаю от суммы ввода переменную с 1-9

            for (int j = 0; j < 1 ; j++) {

                ten_hundred = ten_hundred % 100;            // переменная для десятков вычисляет от 10 до 90
                System.out.println(ten_hundred);

                int hundred_thousand = arabic - (ten_hundred + one_ten);        // переменная для сотен диапазон от 100 до 900

                for (int k = 0; k < 1; k++) {

                    hundred_thousand = hundred_thousand % 1000; // вычисляет сотни
                    System.out.println(hundred_thousand);

                    int thousand_tenThousand = arabic - (hundred_thousand + ten_hundred + one_ten) ; // переменная для тысяч

                    for (int l = 0; l < 1; l++) {

                        thousand_tenThousand = thousand_tenThousand % 10000; // само вычисление
                        System.out.println(thousand_tenThousand);

                        //дальше не понимаю tenThousand_oneHundredTH пишет что переменная избыточная
                      /*  int tenThousand_oneHundredTH =  arabic - thousand_tenThousand + hundred_thousand + ten_hundred + one_ten;

                            созданая выше переменная не хочет работать, как я понял она то ли не видит arabic то ли просто не хочет никак с ней взаимодейсвовать

                        for (int m = 0; m < 1; m++) {

                            tenThousand_oneHundredTH= arabic % 100000;
                            System.out.println(tenThousand_oneHundredTH);

                           int oneHundredThousand_million = arabic - (tenThousand_oneHundredTH + thousand_tenThousand + ten_hundred + ten_hundred + one_ten);

                            следующий цикл вроде как работает нормально но из предыдущего цикла делает вычисления не правильно!

                            for (int n = 0; n < 1; n++) {
                                oneHundredThousand_million = oneHundredThousand_million % 1000000;
                                System.out.println(oneHundredThousand_million);

                            }
                        }*/
                    }
                }

            }

        }

        String roman_Result = "";

        System.out.println(roman_Result);

    }
}

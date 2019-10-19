import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            /*int lensmax = Integer.MIN_VALUE;
            int lensmin = Integer.MAX_VALUE;
            String smin = new String();
            String smax = new String();
            String setalon = new String();


            Scanner sin = new Scanner(System.in);
            System.out.println("Введите n строк, окончание ввода строк, завершите пустой строкой.");
            do {
                System.out.print("Введите строку символов: ");
                setalon = sin.nextLine();
                if (setalon.length() >= lensmax) {
                    smax = setalon;
                    lensmax = setalon.length();
                }
                if (setalon.length() <= lensmin && setalon.length() > 0) {
                    smin = setalon;
                    lensmin = setalon.length();
                }
            } while (setalon.length() > 0);
            System.out.println();
            if (lensmax > lensmin) {
                System.out.print("Самая длинная строка (последняя для одинаково длинных): ");
                System.out.println(smax);
                System.out.println("Длина строки : " + lensmax + " симв.");
                System.out.println();
                System.out.print("Самая короткая строка (последняя для одинаково коротких): ");
                System.out.println(smin);
                System.out.println("Длина строки : " + lensmin + " симв.");
            } else if (lensmax != 0) {
                System.out.println("По длине строки одинаковы : по " + lensmax + " симв.");
            } else {
                System.out.println("Недостаточно строк для сравнения.");
            }*/

        /*Scanner scLeng = new Scanner(System.in);
        System.out.println("Enter the line of array:");
        int scannedLeng = scLeng.nextInt();
        String [] arrayValue = new String[scannedLeng];
        Scanner scNumb = new Scanner(System.in);
        System.out.println("Enter your values:");
        for (int i = 0; i < arrayValue.length; i++) {
            arrayValue[i] = scNumb.nextLine();
        }
        System.out.println(Arrays.toString(arrayValue));*/

        /*    int min = 10, max = 0;
            String minStr = null, maxStr = null;
            for (String digi : args) {
                System.out.println(digi);
                if (digi.length() < min) {
                    min = digi.length();
                    minStr = digi;
                }
                if (digi.length() > max) {
                    max = digi.length();
                    maxStr = digi;
                }
            }
            System.out.println("Минимальное число " + minStr + " состоит из " + min
                    + " цифр\nМаксимальное число " + maxStr + " состоит из " + max
                    + " цифр");
        }*/
        /*Scanner scLeng = new Scanner(System.in);
        System.out.println("Enter the line of array:");
        int scannedLeng = scLeng.nextInt();
        int[] arrayValue = new int [scannedLeng];
        Scanner scNumb = new Scanner(System.in);
        System.out.println("Enter your values:");
        for (int i = 0; i < arrayValue.length; i++) {
            arrayValue[i] = scNumb.nextInt();
        }
        int n = arrayValue.length;
        System.out.println(n);
        *//*for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arrayValue[j] > arrayValue[j+1])
                {
                    int temp = arrayValue[j];
                    arrayValue[j] = arrayValue[j+1];
                    arrayValue[j+1] = temp;
                }
        System.out.println(Arrays.toString(arrayValue));*/
    }
}
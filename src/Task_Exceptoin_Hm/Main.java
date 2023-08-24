package Task_Exceptoin_Hm;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Мумкун болгон каталар:\n" +
                "\n"+"1) Берилген маалымат терс сан болсо\n" +
                "\n" +
                "2) Берилген маалымат сан эмес тамга болсо\n" +
                "\n" +
                "3) Берилген сан  10000 ден чон болсо  ");
        System.out.println();
        try {
            System.out.println("Parallelepiped"+"\n");

            System.out.println("Ведите высоту Праллелипипеда ");
            int a = sc.nextInt();
            System.out.println("Ведите ширину Параллелипипеда ");
            int b = sc.nextInt();
            System.out.println("Ведите длину Параллелипипеда ");
            int c = sc.nextInt();
            Parallelepiped method = new Parallelepiped(a, b, c);


            if (a < 0 || b < 0 || c < 0) {
                throw new ArithmeticException();
            } else if (String.valueOf(a).matches("\\D")
                    || String.valueOf(b).matches("\\D")
                    || String.valueOf(c).matches("\\D")){
                throw new NumberFormatException();
            } else if (a>10000||b>10000||c>10000) {
                throw new RuntimeException();
            }
            System.out.println(method.getAreaP());
            System.out.println();
            System.out.println(method.getVolumeP());


        } catch (ArithmeticException e) {
            System.out.println("Берилге маалымат терс сан");
        } catch (InputMismatchException ex) {
            System.out.println("Берилген маалымат сан эмес тамга");
        } catch (RuntimeException exc) {
            System.out.println("Берилген сан 10000 ден коп !");
        }


        try {
            System.out.println("Цилиндр");
            System.out.println("Ведите высоту Цилиндра ");
            int a1 = sc.nextInt();
            System.out.println("Ведите ширину Цилиндра ");
            int b2 = sc.nextInt();

            Cylinder cylinder = new Cylinder(a1, b2);
            System.out.println("Площадь паралипида " + cylinder.getAreaC());
            System.out.println("Объем паралипида " + cylinder.getVolumeC());
            if (a1 < 0 || b2 < 0) {
                throw new ArithmeticException();
            } else if (String.valueOf(a1).matches("\\D")
                    || String.valueOf(b2).matches("\\D")){
                throw new NumberFormatException();
            } else if (a1>10000||b2>10000) {
                throw new RuntimeException();
            }
            System.out.println(cylinder.getAreaC());
            System.out.println();
            System.out.println(cylinder.getVolumeC());
        }catch (ArithmeticException e) {
            System.out.println("Берилге маалымат терс сан");
        } catch (InputMismatchException ex) {
            System.out.println("Берилген маалымат сан эмес тамга");
        } catch (RuntimeException exc) {
            System.out.println("Берилген сан 10000 ден коп !");
        }
    }
}

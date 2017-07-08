import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * Created by ОЛЕГ on 28.06.2017.
 */
public class SampleSolution {
    // Создать 2 метода с решением задачи
    public static void sampleOne() {
        //Пример
        for (int i = 1; i < 30; i++) {
            System.out.println(i + "+" + (i + 1) + "=" + (i + (i + 1)));
        }
    }

    public static void sampleTwo() {
        //Пример
        for (int i = 1; i < 30; i++) {
            if (i % 2 != 0) {
                System.out.println(i + "+" + (i + 1) + "=" + (i + (i + 1)));
            }
        }
    }

    // Создать меню для выбора нужного варианта
   // public static void menuShow() {
        //Текст меню
//        System.out.println("Выберите один вариантов");
//        System.out.println("1) Последовательное попарное сложение чисел от 1 до 30.");
//        System.out.println("2) Последовательное сложение чисел через один.");
//        System.out.println("3) Вывод последовательного попарного сложения чисел от 1 до 30 в txt файл.");
//        System.out.println("4) Вывод последовательного сложения чисел через один в txt файл.");
//        System.out.println("5) Вывод последовательного попарного сложения чисел от 1 до 30 в html файл.");
//        System.out.println("6) Вывод последовательного сложения чисел через один в html файл.");
   // }

    // Создать методы для вывода результата в файлы txt и html
    public static void sampleSolutionToTxtFileSampleOne() {
        //создать объект куда мы записываем решение примера
        File sampleOneTxt = new File("A:\\AllProject\\SampleSolution\\SampleOne.txt");
        try {
            PrintWriter print = new PrintWriter(sampleOneTxt);
            for (int i = 1; i < 30; i++) {
                print.println(i + "+" + (i + 1) + "=" + (i + (i + 1)));
            }
            System.out.print("Был создан txt файл");
            print.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void sampleSolutionToTxtFileSampleTwo() {
        //создать объект куда мы записываем решение примера
        File sampleTwoTxt = new File("A:\\AllProject\\SampleSolution\\SampleTwo.txt");
        try {
            PrintWriter print = new PrintWriter(sampleTwoTxt);
            for (int i = 1; i < 30; i++) {
                if (i % 2 != 0) {
                    print.println(i + "+" + (i + 1) + "=" + (i + (i + 1)));
                }
            }
            System.out.print("Был создан txt файл");
            print.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    public static void sampleSolutionToHtmlFileSampleOne() {
        //создать объект куда мы записываем решение примера
        File sampleOneHtml = new File("A:\\AllProject\\SampleSolution\\SampleOne.html");
        try {
            PrintWriter print = new PrintWriter(sampleOneHtml);
            String b = "<!DOCTYPE html>" + "\n" +
                    "<html lang=\"ru\">" + "\n" +
                    "   <head>" + "\n" +
                    "       <meta charset=\"UTF-8\">" + "\n" +
                    "       <title>Document</title>" + "\n" +
                    "   </head>" + "\n" +
                    "   <body>" + "\n" +
                    "       <table border=\"1\">";
            String d = "        </table>" + "\n" +
                    "   </body>" + "\n" +
                    "</html>";
            String tr = "           <tr>";
            String td = "<td>";
            String trClose = "</tr>";
            String tdClose = "</td>";
            print.println(b);
            for (int a = 1; a < 26; a++) {
                print.println(tr + td + a + "+" + (a + 1) + tdClose + td + (a + (a + 1)) + tdClose + trClose);
            }
            print.println(d);
            System.out.print("Был создан html файл");
            print.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

    public static void sampleSolutionToHtmlFileSampleTwo() {
        //создать объект куда мы записываем решение примера
        File sampleTwoHtml = new File("A:\\AllProject\\SampleSolution\\SampleTwo.html");
        try {
            PrintWriter print = new PrintWriter(sampleTwoHtml);
            String b = "<!DOCTYPE html>" + "\n" +
                    "<html lang=\"ru\">" + "\n" +
                    "   <head>" + "\n" +
                    "       <meta charset=\"UTF-8\">" + "\n" +
                    "       <title>Document</title>" + "\n" +
                    "   </head>" + "\n" +
                    "   <body>" + "\n" +
                    "       <table border=\"1\">";
            String d = "        </table>" + "\n" +
                    "   </body>" + "\n" +
                    "</html>";
            String tr = "           <tr>";
            String td = "<td>";
            String trClose = "</tr>";
            String tdClose = "</td>";
            print.println(b);
            for (int a = 1; a < 26; a++) {
                if (a % 2 != 0) {
                    print.println(tr + td + a + "+" + (a + 1) + tdClose + td + (a + (a + 1)) + tdClose + trClose);
                }
            }
            print.println(d);
            System.out.print("Был создан html файл");
            print.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public  static int getUserChoise(){
        System.out.print("Введите номер выбранного варианта: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

        static String[] nums = new String[1];
    public  static void array() {
        nums[0] = "Выберите один из вариантов\n" +
                "1) Последовательное попарное сложение чисел от 1 до 30.\n" +
                "2) Последовательное сложение чисел через один.\n" +
                "3) Вывод последовательного попарного сложения чисел от 1 до 30 в txt файл.\n" +
                "4) Вывод последовательного сложения чисел через один в txt файл.\n" +
                "5) Вывод последовательного попарного сложения чисел от 1 до 30 в html файл.\n" +
                "6) Вывод последовательного сложения чисел через один в html файл.\"";
        System.out.println(nums[0]);
    }
}

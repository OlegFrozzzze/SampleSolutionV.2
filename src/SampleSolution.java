import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

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
    public static void menuShow() {
        //Текст меню
        System.out.println("Выберите один вариантов");
        System.out.println("1) Последовательное попарное сложение чисел от 1 до 30");
        System.out.println("2) Последовательное сложение чисел через один");
        System.out.println("3) Вывод последовательного попарного сложения чисел от 1 до 30 в txt файл");
        System.out.println("4) Вывод последовательного сложения чисел через один в txt файл");
        System.out.println("5) Вывод последовательного попарного сложения чисел от 1 до 30 в html файл");
        System.out.println("6) Вывод последовательного сложения чисел через один в html файл");
    }

    // Создать методы для вывода результата в файлы txt и html
    public static void sampleSolutionToTxtFileSampleOne() {
        //создать объект куда мы записываем решение примера
        File sampleOne = new File("A:\\AllProject\\SampleSolution\\SampleOne.txt");
        try {
            PrintWriter print = new PrintWriter(sampleOne);
            for (int i = 1; i < 30; i++) {
                print.println(i + "+" + (i + 1) + "=" + (i + (i + 1)));
                print.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void sampleSolutionToTxtFileSampleTwo() {
        //создать объект куда мы записываем решение примера
        File sampleOne = new File("A:\\AllProject\\SampleSolution\\SampleTwo.txt");
        try {
            PrintWriter print = new PrintWriter(sampleOne);
            for (int i = 1; i < 30; i++) {
                if (i % 2 != 0) {
                    print.println(i + "+" + (i + 1) + "=" + (i + (i + 1)));
                    print.close();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    public static void sampleSolutionToHtmlFileSampleOne() {
        //создать объект куда мы записываем решение примера
        

    }
    public static void sampleSolutionToHtmlFileSampleTwo() {
        //создать объект куда мы записываем решение примера
    }
}

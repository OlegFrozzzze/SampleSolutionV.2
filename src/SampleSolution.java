/**
 * Created by ОЛЕГ on 28.06.2017.
 */
public class SampleSolution {
    // Создать 2 метода с решением задачи
    public static void solutionOne() {
        //Пример
        for (int i = 1; i < 30; i++) {
            System.out.println(i + "+" + (i + 1) + "=" + (i + (i + 1)));
        }
    }

    public static void solutionTwo() {
        for (int i = 1; i < 30; i++) {
            if (i % 2 != 0) {
                System.out.println(i + "+" + (i + 1) + "=" + (i + (i + 1)));
            }
        }
    }

    // Создать меню для выбора нужного варианта
    public static void menuShow() {
        //Текст меню
    }

    // Создать методы для вывода результата в файлы txt и html
    public static void sampleSolutionInTxtFile() {
        //создать объект куда мы записываем решение примера
    }

    public static void sampleSolutionInHtmlFile() {
        //создать объект куда мы записываем решение примера
    }
}

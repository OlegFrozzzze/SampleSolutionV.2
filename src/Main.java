import java.util.Scanner;

/**
 * Created by ОЛЕГ on 28.06.2017.
 */
public class Main {
    public static void main(String[] args) {
        // Алгоритм
        // Вывод меню
        SampleSolution.menuShow();
        // Выбор из меню нужное решение
        // Вывод выброного решения на экран

    }
    public  static int getUserChoise(){
        System.out.println("Введите номер выбранного варианта");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}

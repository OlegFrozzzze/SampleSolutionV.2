/**
 * Created by ОЛЕГ on 28.06.2017.
 */
public class Main {
    public static void main(String[] args) {
        // Алгоритм
        // Вывод меню
        SampleSolution.menuShow();
        // Выбор из меню нужное решение
        int variant = SampleSolution.getUserChoise();
        if (variant == 1) {
            SampleSolution.sampleOne();
        } else {
            if (variant == 2){
                SampleSolution.sampleTwo();
            }else{
                if(variant == 3){
                    SampleSolution.sampleSolutionToTxtFileSampleOne();
                }else{
                    if(variant == 4){
                        SampleSolution.sampleSolutionToTxtFileSampleTwo();
                    }else{
                        if(variant == 5){
                            SampleSolution.sampleSolutionToHtmlFileSampleOne();
                        }else{
                            if(variant == 6){
                                SampleSolution.sampleSolutionToHtmlFileSampleTwo();
                            }else{
                                System.out.println("Введено неверное число");
                                System.out.println("Перезапустите программу");
                            }
                        }
                    }
                }
            }
        }
    }
}

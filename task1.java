import java.util.Scanner;

/*
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
 * и возвращает введенное значение. 
 * Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, 
 * необходимо повторно запросить у пользователя ввод данных.
*/

public class task1 {
    public static void main(String[] args) {
        float floatNum = printFloat();
        System.out.println(floatNum);
    }

    public static float printFloat () {
        Scanner fl = new Scanner(System.in);
        float num = 0;
        do {
            try {
                System.out.print("Введите дробное число: ");
                num = Float.parseFloat(fl.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Введенно неверное значение. Пожалуйста, повторите попытку!");
            }
        } while (num == 0); 
        
        fl.close();
        return num;
    }
    
}

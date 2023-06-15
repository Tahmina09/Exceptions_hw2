/*
 * Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
 * Пользователю должно показаться сообщение, что пустые строки вводить нельзя. 
*/

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        try {
            emptyString();
        } catch (Exception e) {
            System.out.println("Пустые строки вводить нельзя!");
        }
    }

    public static void emptyString() throws Exception{
        String abc = "";
        Scanner str = new Scanner(System.in);
        System.out.print("Введите строку: ");
        abc = str.nextLine();
        if (abc.isEmpty()){
            throw new Exception();
        } else {
            System.out.println(abc);
        }
        str.close();
    }
}

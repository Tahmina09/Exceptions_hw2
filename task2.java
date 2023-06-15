/*
 * Если необходимо, исправьте данный код (задание 2)
*/

public class task2 {
    public static void main(String[] args) {
        int[] intArray = new int[] {4,5,6,9,12,45,67,80,18};
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }
    
    }


}

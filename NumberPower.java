package lesson5;

public class NumberPower {
    public static void main(String[] args) {

        System.out.println(counting(-2, 3));

    }
    private static double counting(double number, int power) {
        if (number == 0 && power <= 0) {
            throw new ArithmeticException("Невозможно применить формулу");
        }
        if (power == 0) {
            return 1;
        } else if (power < 0) {
            return 1 / number * counting(number, ++power);
        } else {
            return number * counting(number, --power);
        }
    }
}

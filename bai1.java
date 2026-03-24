@FunctionalInterface
interface MathOperation {
    int compute(int a, int b);
}
public class Main {
    public static void main(String[] args) {

        MathOperation add = (a, b) -> a + b;

        MathOperation subtract = (a, b) -> a - b;

        MathOperation multiply = (a, b) -> a * b;

        MathOperation divide = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Không thể chia cho 0");
            }
            return a / b;
        };

        System.out.println("Cộng: " + add.compute(10, 5));
        System.out.println("Trừ: " + subtract.compute(10, 5));
        System.out.println("Nhân: " + multiply.compute(10, 5));
        System.out.println("Chia: " + divide.compute(10, 5));
    }
}
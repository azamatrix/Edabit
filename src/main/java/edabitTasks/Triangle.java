package edabitTasks;

public class Triangle {
    public static double calculateArea(double base, double height) {
        if (base <= 0 || height <= 0) {
            throw new IllegalArgumentException("Base and height must be positive values.");
        }
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        double base = 10.0;
        double height = 5.0;
        double area = calculateArea(base, height);
        System.out.printf("The area of the triangle is: %.2f%n", area);
    }
}
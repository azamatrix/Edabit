package edabitTasks;

public class AgeInDays {
    public static int calculateAgeInDays(int years) {
        if (years < 0) {
            throw new IllegalArgumentException("Age in years must be non-negative.");
        }
        return years * 365; // Approximation, not accounting for leap years.
    }

    public static void main(String[] args) {
        int ageYears = 30;
        int ageDays = calculateAgeInDays(ageYears);
        System.out.printf("Age in years: %d, Age in days: %d%n", ageYears, ageDays);
    }
}

import java.util.Scanner;

public class NumberSummation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking two numbers as input
        System.out.println("Choose your first number:");
        int num1 = scanner.nextInt();
        System.out.println("Choose your second number:");
        int num2 = scanner.nextInt();

        // Checking the difference
        if (Math.abs(num1 - num2) < 200) {
            System.out.println("The difference between your numbers is less than 200. That is not acceptable. Try again.");
            return;
        }
        // Determining the starting and ending point for the loops
        int start = Math.min(num1, num2);
        int end = Math.max(num1, num2);

        // Variables to hold sums
        int sumDiv4 = 0, sumDiv8 = 0, sumNotEvenNot5 = 0;

        // Summing numbers that are even and can be divided by 4 (using for loop)
        for (int i = start; i <= end; i++) {
            if (i % 4 == 0) {
                sumDiv4 += i;
            }
        }

        // Summing numbers that are even and can be divided by 8 (using while loop)
        int i = start;
        while (i <= end) {
            if (i % 8 == 0) {
                sumDiv8 += i;
            }
            i++;
        }

        // Summing numbers that are not even and can NOT be divided by 5 (using do-while loop)
        int j = start;
        do {
            switch (j % 2) {
                case 0: // Even number
                    break;
                default: // Odd number
                    if (j % 5 != 0) {
                        sumNotEvenNot5 += j;
                    }
                    break;
            }
            j++;
        } while (j <= end);

        // Displaying results
        System.out.println("Sum of numbers that are even and divisible by 4: " + sumDiv4);
        System.out.println("Sum of numbers that are even and divisible by 8: " + sumDiv8);
        System.out.println("Sum of numbers that are not even and not divisible by 5: " + sumNotEvenNot5);
    }
}


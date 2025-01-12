import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int maxAttempts = 10; // Limit the number of attempts
        int score = 0; 
        int rounds = 3; // Number of rounds

        for (int round = 1; round <= rounds; round++) {
            int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int attempts = 0;
            System.out.println("\nRound " + round + ":");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess (between " + lowerBound + " and " + upperBound + "): ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    score += (maxAttempts - attempts + 1) * 10; // Award points based on attempts
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
            }

            if (attempts >= maxAttempts) {
                System.out.println("Sorry, you've reached the maximum number of attempts.");
            }
        }

        System.out.println("\nGame Over! Your final score: " + score);
    }
}
import java.util.Random;
import java.util.Scanner;
import java.util.random;

public class Guess {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Random random = new Random();
        int secretNum = random.nextInt(10) + 1;

        int guessNum = 0;
        int guess = 0;

        while (guess != secretNum){
            System.out.println("Enter your guess: ");
            guess = scanner.nextInt();
            guessNum += 1;

        if (guess < secretNum) {
            System.out.println("Your guess is too low.");
        } else if (guess > secretNum) {
            System.out.println("Your guess is too high.");
        } else {
            System.out.println("You got it!");
        }
    }

        System.out.println("It took you " +guessNum + " guesses.");

        scanner.close();
    }
}

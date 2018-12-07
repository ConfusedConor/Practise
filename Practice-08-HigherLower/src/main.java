import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		int secretNumber = 17;
		int clicker = 0;
		int guess;
		boolean finished = false;

		//scanner import
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to higher or lower, make your first guess!");
		System.out.println("Hint: The number is between 1-100 ");
		do {
			guess = sc.nextInt();
			if (guess==secretNumber) {finished=true;}
			if (guess < secretNumber) {System.out.println("Too low, try again");}
			if (guess > secretNumber) {System.out.println("Too high, try again");}
			
			
		}
		while (finished==false);
			
			System.out.println("Well Done, You Guessed the correct number.");
		
	}

}

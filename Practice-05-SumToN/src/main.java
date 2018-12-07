import java.util.Scanner;

public class main {

	public main() {
		
	}

	public static void main(String[] args) {
		
		//Initialising
				int num1;
				int num2;
				int answer = 1;
				
		//Importing Scanner for Text input
				Scanner sc = new Scanner(System.in);
			
				System.out.println("Enter a number.");
				num2 = sc.nextInt();
		//closing Scanner
				sc.close();
			
		//Counting
				System.out.println(answer);
				for(num1=2; num1<=num2; num1++) {
					answer= answer+num1;
					System.out.println(answer);
					
					
				}
	}

}

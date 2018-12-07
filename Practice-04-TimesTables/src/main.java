import java.util.Scanner;

public class main {

	public main() {
	
	}

	public static void main(String[] args) {
		//Initialising
		int num1;
		int num2;
		int answer;
		System.out.println("Printing Your Times Tables");
		
	
		//Counting
		//First Loop the first number being multiplied
		for(num1=1; num1<=12; num1++) {
			System.out.println("");
			System.out.println("The "+num1+ " times tables.");
			System.out.println("");
			//Second loop the second number being multiplied
			for(num2=1; num2<=12; num2++) {
				answer = num1 * num2;
				System.out.println(num1+" x "+num2+" = "+answer);	
			}
		}
	}

	}



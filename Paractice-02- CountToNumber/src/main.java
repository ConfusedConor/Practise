import java.util.Scanner;

public class main {

	public main() {
	}

	public static void main(String[] args) {
		int request;
		int num;
		//New scanner for input
		Scanner scan= new Scanner(System.in);
		//Taking in input
		System.out.println("What number would you like us to count to?");
		request = scan.nextInt();
		//Closing Scanner
		scan.close();
		//Counting
		for(num=1; num<=request; num++) {
			System.out.println(num);
		}
	}

}

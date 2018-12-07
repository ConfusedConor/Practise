import java.util.Arrays;
import java.util.Scanner;

public class main {

	public main() {
	
	}

	public static void main(String[] args) {
		//Initialing variables
		int num1, num2, num3, num4, num5, num6, num7;
		//Starting scanner for input
		Scanner sc = new Scanner(System.in);
		//Taking Input
		System.out.println("Howdy, Please Enter & numbers followed by the ENTER key");
		num1 =sc.nextInt();
		num2 =sc.nextInt();
		num3 =sc.nextInt();
		num4 =sc.nextInt();
		num5 =sc.nextInt();
		num6 =sc.nextInt();
		num7 =sc.nextInt();
	//Storing in array
	int[] list = new int[7];
	list[0] = num1;
	list[1] = num2;
	list[2] = num3;
	list[3] = num4;
	list[4] = num5;
	list[5] = num6;
	list[6] = num7;
	
	Arrays.sort(list);
	System.out.println("The smallest number is: "+list[0]);
	System.out.println("The largest number is: "+list[6]);
	
	}
}

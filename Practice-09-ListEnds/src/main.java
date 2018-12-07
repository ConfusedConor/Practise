import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//Initialising
		Integer number;
		Integer frontEnd;
		Integer backEnd;
		int i;
		List list = new ArrayList<Integer>();
		List listEnds = new ArrayList<Integer>();
		//Starting scanner
		
		Scanner sc = new Scanner(System.in);
		
		for(i=0; i<3; i++) {
		System.out.println("Enter a list of 6 numbers");
		number = sc.nextInt();
		list.add(number);
		number = sc.nextInt();
		list.add(number);
		number = sc.nextInt();
		list.add(number);
		number = sc.nextInt();
		list.add(number);
		number = sc.nextInt();
		list.add(number);
		number = sc.nextInt();
		list.add(number);
		
		frontEnd= (Integer) list.get(0);
		backEnd= (Integer) list.get(5);
				
		//System.out.println(list.toString());
		//System.out.println(frontEnd);
		//System.out.println(backEnd);
		
		listEnds.add(frontEnd);
		listEnds.add(backEnd);
		list.clear();
		}
		System.out.println("List Ends Are: ");
		System.out.println(listEnds.toString());
		
	}

}

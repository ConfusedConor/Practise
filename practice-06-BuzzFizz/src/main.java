
public class main {

	public main() {
	
	}

	public static void main(String[] args) {
		int num;
		for (num=1; num<=1000; num++) {
			if(num%5==0 && num%3==0){System.out.println("Buzz Fizz");}
			if(num%5==0){System.out.println("Fizz");}
			if(num%3==0){System.out.println("Buzz");}
			else{System.out.println(num);};
			
			
		}


	}

}

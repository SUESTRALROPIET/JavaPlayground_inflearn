import java.util.Scanner;

public class Gugudan_assignment1 {

	public static void main(String[] args) {
		
		System.out.println("숫자를 입력하시오.");
		
		Scanner scanner = new Scanner(System.in);
	    int number = scanner.nextInt();
	    
	    for(int i=2; i <= number; i++) {
		    for (int j =1; j <= number; j++) {
		    	System.out.println(i +","+ j);
		    }
	    }
	}
}

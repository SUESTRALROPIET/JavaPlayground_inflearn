import java.util.Scanner;

public class Gugudan_assignment2 {

	public static void main(String[] args) {

		System.out.println("숫자 두 를 입력하시오.");

		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		
		String[] splitedValue = inputValue.split(",");
		
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		
		for(int i = 2; i <= first; i++) {
			for(int j = 1; j <= second; j++) {
				System.out.println(i + "," + j);
			}
		}
	}
}

//프로그램을 실행하는 main 메소드를 별도의 클래스로 분리해서 만들어,
//클래스에서 구구단 메소드를 호출하는 방식 

//클래스명은 대문자로, 메소드명은 소문자로 시작하는 것이 관례 
public class Gugudan_mainmethod {

	public static void main(String[] args) {
		for(int i = 2; i < 10; i++) {
			int[] result = Gugudan_mainmethod1.calculate(i);
			Gugudan_mainmethod1.print(result);
		}
	}
}

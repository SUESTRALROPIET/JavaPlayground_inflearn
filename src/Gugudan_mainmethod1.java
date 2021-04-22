
public class Gugudan_mainmethod1 {
	//메소드를 만들어 코드의 양을 줄인다.
	//'2'라는 값을 받으면, 2단의 곱셈결과를 배열로 반환해주는 메소드 
				//int[]: 출력값  //int times: 입력값 
	public static int[] calculate(int times) {
		int[] result = new int[9];
		for(int i = 0; i < result.length; i++) {
			result[i] = times * (i+1);
		}
		return result;
	}
	//실행결과를 return해야하는 것은 없어서 void!
	//입력만 있고, 출력은 없는 경우. 
	public static void print(int[] result) {
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	
}


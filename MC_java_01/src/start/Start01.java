package start;

public class Start01 {

	public static void main(String[] args) {
		// 나이, 이름, 키(실수), 남자는 false 여자는 true
		int age = 17;
		String name = "suho";
		float height = 172;
		boolean isFemale = false;
		
		System.out.println(age);// 줄바꿈 o
		System.out.print(height);//줄바꿈 x
		System.out.print(name);//줄바꿈 x
		System.out.printf("여자인가요? : %b", isFemale);//변수 바인딩
		
	}

}

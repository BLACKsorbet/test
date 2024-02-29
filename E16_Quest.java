
public class E16_Quest {
		/*
		 * 알파벳 A부터 Z까지 출력
		 * 단, 대문자와 소문자를 아래형식으로 출력
		 * A - a
		 * B - b
		 * C - c
		 * .....
		 * Z - z
		 * 
		 * char 형 변수
		 * A 와 A의 문자코드값을 이용
		 * 
		 * 
		 */
	public static void main(String[] args) {
		
		
		char ch1 = 65;
		char ch2 = 97;		
		do {
			System.out.println(ch1 + " " + "-" + " " + ch2);
			ch1++;
			ch2++;
		}while(ch1 < 91);
		
		
		

	}

}

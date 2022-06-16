package basic;

public class BasicTest {

	public static void main(String[] args) {
		System.out.println('A' + 3);
		System.out.println((char)('A' + 3)); //숫자를 문자롷 변환
		System.out.println((char)('A' + 32)); //소문자와 대문자 차이는 32
		System.out.println("A" + 32); //A32
		System.out.println(2 + 5);
		System.out.println('2' + '5'); //'2' = 50, '5' = 53  즉 103
		System.out.println("2" + "5"); //문자 25
		System.out.println('2'-48 + '5'-48); //숫자 7로변

		System.out.println("2" + "5"); //문자열 25
		System.out.println(Integer.parseInt("2") + Double.parseDouble("5")); //문자열을 숫자 7로 변
		
		
		
	}

}

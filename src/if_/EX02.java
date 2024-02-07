package if_;

import java.util.Scanner;

public class EX02 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int num;
	System.out.println("수입력");
	num = input.nextInt();
	if(num > 10) {
		System.out.println("1.종속문장실행"); //참일때 실행되는 문장 종속문장
	System.out.println("2.종속문장실행");  //{}를 이용해서 묶어주면 종속문장을 만들 수 있다.
	System.out.println("3.종속문장실행"); 
	}
	System.out.println("다음 문장들 실행!!!");
	
}
}

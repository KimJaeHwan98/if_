package if_;

import java.util.Scanner;

public class quiz05 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("계산기입니다.");
	System.out.println("1.덧셈");
	System.out.println("2.뺄셈");
	System.out.println("3.곱셈");
	System.out.println("4.나눗셈");
	System.out.println("5.나머지");
	System.out.println("원하시는 기능의 숫자를 입력해주세요 :");
	int num = input.nextInt();
	int numA=0,numB=0,result=0;
	if(num ==1) {
		System.out.println("덧셈을 진행할 두개의 값을 입력해주세요");
		System.out.println("첫번째 값 :");
		numA=input.nextInt();
		System.out.println("두번째 값 :");
		numB=input.nextInt();
		result =numA+numB;
		System.out.println("결과값"+(result));
		
	}
	else if(num==2) {
		System.out.println("덧셈을 진행할 두개의 값을 입력해주세요");
		System.out.println("첫번째 값 :");
		numA=input.nextInt();
		System.out.println("두번째 값 :");
		numB=input.nextInt();
		result =numA-numB;
		System.out.println("결과값"+(result));
	} else if(num==3) {
	System.out.println("덧셈을 진행할 두개의 값을 입력해주세요");
	System.out.println("첫번째 값 :");
	numA=input.nextInt();
	System.out.println("두번째 값 :");
	numB=input.nextInt();
	result =numA*numB;
	System.out.println("결과값"+(result));
	} else if(num==4) {
	System.out.println("덧셈을 진행할 두개의 값을 입력해주세요");
	System.out.println("첫번째 값 :");
	numA=input.nextInt();
	System.out.println("두번째 값 :");
	numB=input.nextInt();
	result =numA/numB;
	System.out.println("결과값"+(result));
	 } else if (num==5) {
	System.out.println("덧셈을 진행할 두개의 값을 입력해주세요");
	System.out.println("첫번째 값 :");
	numA=input.nextInt();
	System.out.println("두번째 값 :");
	numB=input.nextInt();
	result =numA%numB;
	System.out.println("결과값"+(result));
	
	 
	 
 } else {
	System.out.println("해당하는 기능이 없습니다."); 
 }
 
}

}

package if_;

import java.util.Scanner;

public class quiz02 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("수입력 :");
	int num = input.nextInt();
	if(num%3==0&&num%4==0) {
	System.out.println("3의 배수이면서,4의배수에도 해당합니다");
	}else if(num%3==0){
	System.out.println("3의배수에만 해당합니다.");
	}else if(num%4==0){
	System.out.println("4의배수에만 해당합니다");
	}else if (num %3 !=0 && num % 4 !=0) {
	System.out.println("배수 아님");
	}else {
		System.out.println("배수 아님");
	}
}
}

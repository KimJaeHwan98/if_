package if_;

import java.util.Scanner;

public class quiz03 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("정수를 입력하세요 : ");
	int num = sc.nextInt();
	
	if(num > 0) {
		System.out.printf("%d는 양수입니다.",num);
		
	}else {
		System.out.printf("%d는 음수입니다.",num);
	}
}
}

package if_;

import java.util.Scanner;

public class quiz04 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("문자열을 입력하세요 :");
	String a = input.nextLine();
	System.out.println("찾을 단어");
	String b = input.next();
	
	if(a.contains(b)) {
		System.out.println("단어가 있습니다.");
		
	}else {
		System.out.println("단어가 없습니다.");
	}
	
	
}
}

package if_;

public class EX06 {
public static void main(String[] args) {
	int n1=30, n2=10, n3=20;
//	if(n1 > n2 && n1 > n3) {
//		System.out.println("n1이 가장 크다");
//	}
//	//가장 큰수, 두번째 큰수, 마지막 수
	if(n1> n2) {
		if(n1 > n3) {
			if(n2 > n3) {
				System.out.println(n1);
				System.out.println(n2);
				System.out.println(n3);
			}else {
				System.out.println(n1);
				System.out.println(n3);
				System.out.println(n2);
			}
			
		}else {
//			System.out.println(n3);
//			System.out.println(n1);
//			System.out.println(n2);
		}
	}
	
	
	
	
	
	
	
	
	//n2가 가장 큰 경우
	if(n2>n1) {
		if(n2>n3) {
			if(n1 > n3) {//n2>n1>n3
				System.out.println(n2);
				System.out.println(n1);
				System.out.println(n3);
			}else {//n3>n1 n2>n3>n1
				System.out.println(n2);
				System.out.println(n3);
				System.out.println(n1);
			}
		} else {
//			System.out.println(n3);
//			System.out.println(n2);
//			System.out.println(n1);
		}
	}
	
	
	
	
	//n3가 가장 큰 경우 
	if(n3>n1) {
		if(n3>n2) {
			if(n2 >n1) {// n3>n2>n1
				System.out.println(n3);
				System.out.println(n2);
				System.out.println(n1);
				
			}else {// n1>n2 n3
				System.out.println(n3);
				System.out.println(n1);
				System.out.println(n2);
			}
		} else {// n1 n2 n3
//			System.out.println(n2);
//			System.out.println(n3);
//			System.out.println(n1);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}

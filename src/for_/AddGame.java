package for_;

import java.util.Random;
import java.util.Scanner;

public class AddGame {

	public static void main(String[] args) {
		
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		
		int user, a, b;
		String yn;
		
		while(true) {
			int count=0;
		
			for(int i = 1; i<=5; i++) {
			a = r.nextInt(89)+10;
			b = r.nextInt(89)+10;
				
			System.out.print("[" + i + "] " + a +" + " + b + " = ");
			user = s.nextInt();
		
				for (int c=1; c<=1; c++) {
					if(user == a+b) System.out.println("딩동댕");
					else {
						System.out.println("틀렸다. 다시한번 생각해보세요.");
						System.out.print("[" + i + "] " + a +" + " + b + " = ");
						user = s.nextInt();
						
						if(user == a+b) System.out.println("딩동댕");
						else System.out.println("틀렸다. 정답은 " + (a+b) + "입니다"); 
						}
					if (user == a+b) count++;
				}//for 1번 문제
				System.out.println();
			}//for 5 문제
			
			System.out.println();
			System.out.println("당신은 총 " + count + " 문제를 맞추어서 점수 " + (count*20) +"점 입니다.");

			System.out.println();
			
			
			do {
				System.out.print("\n 또 할래(Y/N) : ");
				yn = s.next();
	         	}while(!yn.equals("Y") && !yn.equals("y") && !yn.equals("N") && !yn.equals("n"));
	         
	         if(yn.equals("N") || yn.equals("n")) break; //while를 벗어나라
			
	         
		}//while
		System.out.println("프로그램을 종료합니다.");
	}

}

/*
문제] 덧셈 계산 (for, while, 다중 for)
- 10 ~ 99 사이의 난수를 2개 발생하여 합을 구하는 프로그램
- 5문제를 제공한다.
- 1문제당 점수 20점씩 처리한다.
- 틀리면 1번 더 기회를 주고, 2번 다 틀리면 답을 알려준다.

[실행결과]
[1] 25 + 36 = 50
틀렸다
[1] 25 + 36 = 59
틀렸다 정답은 xx

[2] 10 + 25 = 35
딩동뎅

[5] 78 + 95 = 89
틀렸다
[5] 78 + 95 = 173
딩동뎅

당신은 총 x 문제를 맞추어서 점수 xx점 입니다.

또 할래(Y/N) : 
프로그램을 종료합니다. 
*/
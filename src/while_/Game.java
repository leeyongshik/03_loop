package while_;

import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {

		Random r = new Random();
		Scanner scan = new Scanner(System.in);
		
		int com, user;
		
		while(true) {
		
			com = r.nextInt(100)+1;
			System.out.println(com);
			
			System.out.println("1~100사이의 숫자를 맞추세요.");
			
			int count = 0;
			while (true) {
				System.out.print("숫자 입력 : ");
				user = scan.nextInt();
				count++; // 숫자를 받을 떄 마다 카운트 ..
				
				if(user > com) System.out.println(user + "보다 작은 숫자입니다.");
				else if(user < com) System.out.println(user + "보다 큰 숫자입니다.");
				else break;
				
				
				/* 내가 한 실패 코
				count++;
				if(user > com) System.out.println(user + "보다 작은 숫자입니다.");
				if(user < com) System.out.println(user + "보다 큰 숫자입니다.");
				else System.out.println("딩동댕");*/
				
			}//while
			System.out.println();
			System.out.println("딩동댕 " + count + "번만에 맞추셨습니다.");
			
			System.out.print("\n 또 할래(Y/N) : ");
			String yn = scan.next();
			
			if (yn.equals("N") || yn.equals("n")) break;
			//int yn = scan.nextInt();
			
		}//while
		
		System.out.println("프로그램을 료합니다.");
		
		

	}

}
/*
문제] 숫자 맞추기 게임
- 컴퓨터가 1 ~ 100사이의 난수를 발생하면, 발생한 난수를 맞추는 게임
- 몇 번만에 맟주었는지 출력한다.

[실행결과]
1 ~ 100사이의 숫자를 맞추세요 (77)

숫자 입력 : 50
50보다 큰 숫자입니다
숫자 입력 : 80
80보다 작은 숫자입니다.
~
~
숫자 입력 : 77
딩동뎅...x번만에 맞추셨습니다.
*/
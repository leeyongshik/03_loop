package for_;

public class For01 {

	public static void main(String[] args) {
		
		int i = 1;
		
		for ( i = 1 ; i <= 10 ; i++) {
		System.out.println("Hello Java : " + i);
		}
		
		System.out.println("탈출 i = " + i );//11
		System.out.println();
		
		//10 9 8 7 6 5 4 3 2 1 
		for (i = 10 ; i > 0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//A B C D ~~~ X Y Z
		for (i = 'A'; i <= 'Z'; i++) {
			System.out.print((char)(i) + " ");
		}
		

	}

}

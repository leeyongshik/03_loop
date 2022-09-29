package for_;

import java.util.Random;

public class For04 {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		int count = 0;
		
		
		for (int i=1 ; i<=100 ; i++) {
		System.out.print((char)(r.nextInt(26) + 65)+" ");
		
		if (i % 10 == 0) System.out.println();
		
		if (r.nextInt(26) + 65 == 'A') count++;
		}
		System.out.println(count);
		

	}

}

/*

*/
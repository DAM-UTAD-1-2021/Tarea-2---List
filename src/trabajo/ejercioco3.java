package trabajo;

import java.io.*;
import java.util.ArrayDeque;

//@nicolassomoza
class ejercii2 {
	public static void main(String args[]) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		char ch1, ch2;
		System.out.println("Enter a string:");
		String str = br.readLine();
		// Create ArrayDeque of Character
		ArrayDeque<Character> dobleCola = new ArrayDeque<Character>();
		for (int i = 0; i < str.length(); i++)
			dobleCola.add(str.charAt(i));
		/// {write your code here
		/// }

		Character SUPERR_FRANKY_COLA = (dobleCola.poll());
		
		SUPERR_FRANKY_COLA = (dobleCola.pollFirst());
		SUPERR_FRANKY_COLA = (dobleCola.pollFirst());
		dobleCola.add(SUPERR_FRANKY_COLA);
		dobleCola.addLast(SUPERR_FRANKY_COLA);
		for (Character sivir : dobleCola) {
			System.out.print(sivir);
		}
	}
}
//Challenge,ejercii2
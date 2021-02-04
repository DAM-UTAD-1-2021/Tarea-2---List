package trabajo;


	import java.io.*;
	import java.util.LinkedList;
	public class ejerciico1 {
	public static void main(String args[]) throws IOException {
	InputStreamReader is = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(is);
	String newstr = "";
	char ch;
	System.out.print("Enter the Word: ");
	String str = br.readLine();
	LinkedList<Character> al = new LinkedList<Character>();
	// Create LinkedList of Character
	for (int i=0;i<str.length();i++)
	al.add(str.charAt(i));
	/// {write your code here
	/// }
	System.out.println("Input:  ");
	newstr = str.replaceAll("[AEIOUaeiou]",   "");
	
	
	System.out.println("Edited Word: " + newstr);

	}
	}


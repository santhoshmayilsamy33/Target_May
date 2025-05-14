package Reverse_string;

public class Reverse_string_Approach2 {
	
	public static void main(String[] args) {
		// reverseing the string using default method present in the stringbuilder
		
		String str = "Mayilsamy";
		StringBuilder build = new StringBuilder(str);
		String reverse = build.reverse().toString();
		
		System.out.print(reverse);
	}

}

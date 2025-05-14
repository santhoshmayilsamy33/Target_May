package Reverse_string;

public class Reverse_string_Approach1 {
	
	public static void main(String[] args) {
		
		//Reverse a Given string without using the default method
		
		String str = "santhosh";
		char[] arr = str.toCharArray();
		int length = arr.length;
		for(int i=length-1;i>=0;i--) {
			System.out.print(arr[i]);
		}
		
	}
}

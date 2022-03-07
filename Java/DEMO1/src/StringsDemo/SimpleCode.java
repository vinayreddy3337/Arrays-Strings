package StringsDemo;

public class SimpleCode {

	public static void main(String[] args) {
		
		String s1="                  HELLO";
		String s2= new String("all");
		//char s3[]= {'T','E','X','T'};
		
		
		System.out.println(s1.length());
		System.out.println(s1.concat(s2));
		System.out.println(s2.charAt(1));
		System.out.println(s2.contains("al"));
		System.out.println(s2.replace('a', 'A'));
		System.out.println(s1.toLowerCase());
		System.out.println(s2.toUpperCase());
		System.out.println(s1.endsWith("LO"));
		System.out.println(s1.trim());
		
		
	
	}
	
	
}

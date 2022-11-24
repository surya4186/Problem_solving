package javaone;
/*
 * intput:a1b6c5d4
 * output:abbbbbbcccccdddd
 */

public class LetterDigits {

	public static void main(String[] args) {
		
		 String letter="a1b6c5d7";
		 int count=0;
		 char c=' ';
		 for(int i=0;i<letter.length();i++) {
			 
			 if(!(letter.charAt(i)>=97 && letter.charAt(i)<=122)) {
				 count=letter.charAt(i)-'0';
				 for(int j=0;j<count;j++) {
					 System.out.print(c);
				 }
				 
			 }
			 c=letter.charAt(i);
		 }
		

	}

}

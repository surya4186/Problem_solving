package javaone;

/*
 find the first Non-digits number
 Note:get the input as an integer,not as an array or string
 
 	input:1233621
 	output:6
 */
public class NonRepeatDigits {

	public static void main(String[] args) {

		int num = 1231231230;
		String str = Integer.toString(num);
		int len = str.length();
		int count = 0;
		for (int i = 0; i < len; i++) {
			count = 0;
			for (int j = 0; j < len; j++) {
				if (i != j && str.charAt(i) == str.charAt(j)) {
					break;
				}
				count++;
			}
			if (count == len) {
				System.out.println("Non-repeat digits: " + str.charAt(i));
				break;
			}
		}
	}

}

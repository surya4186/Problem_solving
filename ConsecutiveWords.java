package javaone;

/*
 * write a program to remove a fragment that occur in all string,where a fragment
 * is 3 consecutive words.
 * don't use in built functions string eg:split,indexOf,replace,substring.
 * 
 */
public class ConsecutiveWords {
	public static String words(String s1, String s2, String s3) {
		if (s2.contains(s1)) {
			if (s3.contains(s1)) {
				return s1;
			}
		}
		return " ";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "every morning i want to do exercice regularly";
		String st2 = "every morning i want to do meditation without fail";
		String st3 = "it is important that i want to be happy always";
		String str = "";
		String finals = "";
		for (int i = 0; i < st.length(); i++) {
			if (st.charAt(i) == 32) {
				// System.out.println("hii");
				finals += words(str, st2, st3) + " ";
				str = "";

			} else {
				str += st.charAt(i);
			}

		}
		System.out.println(finals);

	}

}

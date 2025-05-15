package nivelamento;

public class ur1114 {

	public static void main (String[] args) {
		String original = "abcde FGIJ ABC abc DEFG"; 

		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2,9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "x");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println("original:  " + original + "1");
		System.out.println("toLowerCase:  " + s01 + "1");
		System.out.println("trim:  " + s02 + "1");
		System.out.println("substring(2)  " + s03 + "1");
		System.out.println("substring(2,9)  " + s04 + "1");
		System.out.println("replace('a', 'x')  " + s05 + "1");
		System.out.println("replace(\"abc\", \"x\") " + s06 + "1");		
		System.out.println("indexOf(\"bc\") " + i);
		System.out.println("lastIndexOf(\"bc\") " + j);
		
		String s = "potato apple lemon orange";
		String[] vect = s.split(" ");
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		System.out.println(word1 + " " + word2 + " "+ word3); 
		
	}
}

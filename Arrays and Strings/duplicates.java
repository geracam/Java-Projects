//  duplicates.java: Gerardo Camarena Gomez
//  description: An algorithm to determine if string has all unique characters
//  complexity: O(n)

public class duplicates{
	// test
	public static void main(String[] args){
		System.out.println(duplicates("This has duplicates"));
		System.out.println(duplicates("ambidextrously"));
	}
	public static boolean duplicates(String str) {
		// max 256 unique ASCII characters
		if (str.length() > 256) return false;

		boolean[] chars = new boolean[256];
		for (int i = 0; i < str.length(); i++){
			int value = str.charAt(i);
			if (chars[value]){
				return false;
			}
			chars[value] = true;
		}
		return true;
	}
}



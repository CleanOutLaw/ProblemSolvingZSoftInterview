//ABBDCA, 2 -> true
//
//BAAABDBB, 3 -> true
//
//BAABDB, 3 -> false

public class Main {
	
	public static boolean countConsecutifElements(String str, int n) {
		
		if (n < 0) throw new IllegalArgumentException("the int parameter should be greater or equal to 0");
		if ( (str.isEmpty() || str == null) && n > 0) throw new IllegalArgumentException("The string parameter should not be null or empty for for an int value greater than 0");
		else if ( (str.isEmpty() || str == null) && n == 0) return true;
		
		char[] strArray = str.toCharArray();
		for(int i = 0; i <= strArray.length - 1; i++) { 
			int count = 1;
			for(int j = i + 1, k = 1; k <= n && j < strArray.length; j++, k++) {
				if(strArray[i] == strArray[j]) count++;
				if(count == n) return true;
			}
		}
	    return false;
	}
	
	public static void main(String args[]) {
		System.out.println("ABBDCA, 2    -> " + countConsecutifElements("ABBDCA", 2));
		System.out.println("BAAABDBB, 3  -> " + countConsecutifElements("BAAABDBB", 3));
		System.out.println("BAABDB, 3    -> " + countConsecutifElements("BAABDB", 3));
		System.out.println("BBBBBBBB, 8  -> " + countConsecutifElements("BBBBBBBB", 8));
		System.out.println("Empty string, 0  -> " + countConsecutifElements("", 0));
	}
  

}

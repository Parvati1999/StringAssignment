package tcAssignment;

public class CountVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input ="Education";
		int output=countVowel(input);
		System.out.println(output);
	}
	public static int countVowel(String str) {
		str = str.toLowerCase();
		int count=0;
		for(int i =0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				count++;
			}
		}
		return count;
		
	}

}

package tcAssignment;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String output = reverseWords("I Love India");
		System.out.println(output);
	}
	public static String reverseWords(String str) {
		String[] splitted = str.split(" ");
		String result ="";
		for(int i =splitted.length-1;i>=0;i--) {
			result += splitted[i]+" ";
		}
		return result;
	}

}

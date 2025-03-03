package tcAssignment;

public class ReverseCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String output = reverseword("java");
		System.out.println(output);
	}
	public static String reverseword(String str) {
		char[] arr = str.toCharArray();
		int left =0;
		int right= arr.length-1;
		char temp;
		while(left<=right) {
			temp= arr[left];
			arr[left] = arr[right];
			arr[right]= temp;
			left++;
			right--;
		}
		return new String(arr);
	}

}

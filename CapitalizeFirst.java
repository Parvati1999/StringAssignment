package tcAssignment;

public class CapitalizeFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String output = capitalize("i love india");
		System.out.println(output);
		
	}
	public static String capitalize(String str) {
		String[] splitted = str.split(" ");
		String result ="";
		for(int i =0;i<splitted.length;i++) {
           result += Character.toUpperCase(splitted[i].charAt(0)) + splitted[i].substring(1) + " ";
        }
		return result.trim();
	}

}

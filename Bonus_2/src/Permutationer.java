
public class Permutationer { 
	
	public static void main(String[] args){
		permutations("aRandomString");
	}
	public static void permutations(String s) {
		permutations("", s);
	}
	public static void permutations(String first, String second) {
		if (second.length()>0){
			for (int i =0;i<second.length();i++){
				permutations(first+second.charAt(i), second.substring(0, i)+second.substring(i+1));
			}
		}else{
			System.out.println(first);
		}
	}
}


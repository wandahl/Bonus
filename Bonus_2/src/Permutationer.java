
public class Permutationer {

//	Konstruera en funktion som skriver ut alla permutationer av en str�ng. T.ex. skall anropet 
//	permutations(�abc�); 
//	ge utskriften 
//	abc 
//	 acb 
//	 bac 
//	 bca 
//	 cab 
//	 cba 
//	Ledning: Permutationerna av str�ngen S f�s genom att f�r varje tecken c i S addera c till varje 
//	permutation av S� d�r S� f�s genom att ta bort c ur S. Ex. addera a till varje permutation av bc, b
//	till varje permutation av ac, och c till varje permutation av ab. En str�ng av l�ngd n har n! 
//	permutationer. 
//	Skriv en rekursiv hj�lpfunktion som bygger upp en permutation i en extra ackumulerande 
//	parameter (f�r exempel p� tekniken se fibIter i den f�rsta f�rel�sningen om rekursion). 
//	Funktionen f�r inneh�lla en loop. Anropa hj�lpfunktionen fr�n permutations. 
	
	public static void main(String[] args){
		permutations("olof");
	}
	public static void permutations(String s) {
		permutations("", s);
	}
	public static void permutations(String s1, String s2) {
		if (s2.length() > 0) {
			for (int i = 0; i < s2.length(); i++) {
				permutations(s1 + s2.charAt(i),
						s2.substring(0, i) + s2.substring(i + 1));
			}}
		else
			System.out.println(s1);
	}
}


package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		for(int i = 0; i < tabell.length; i++){
			System.out.println(tabell[i]);
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {

		String resultat = "[";

		for(int i = 0; i < tabell.length; i++){
			resultat += tabell[i];
			if(i != tabell.length - 1){
				resultat += ",";
			}
		}

		resultat += "]";

		return resultat;
	}

	// c)
	public static int summer(int[] tabell) {

		int sum = 0;

		for (int num : tabell) {
			sum += num;
		}

		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		for (int item : tabell) {
			if (item == tall){
				return true;
			}
		}
		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		
		for (int i = 0; i < tabell.length; i++) {
			if (tall == tabell[i]){
				return i;
			}
		}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] result = new int[tabell.length];
		for (int i = 0; i < tabell.length; i++) {
			result[tabell.length - 1 - i] = tabell[i];
		}
		return result;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		for (int i = 0; i < tabell.length; i++) {
			if (i == 0){continue; };
			if (tabell[i-1] > tabell[i]){
				return false;
			}
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}
}

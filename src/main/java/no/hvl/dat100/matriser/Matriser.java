package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for (int[] item : matrise) {
			for (int number : item) {
				System.out.println(number);
			}
		}		
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String result = "";

		for (int[] item : matrise) {
			for (int i = 0; i < item.length; i++) {
				if( i != item.length - 1 ){
					result += item[i] + " ";
				} else {
					result += item[i];
				}
			}
			result += "\n";
		}

		return result;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int length = matrise.length;
		int height = matrise[0].length;
		int[][] result = new int[length][height];

		for(int i = 0; i < matrise.length; i++){
			for (int j = 0; j < matrise[i].length; j++) {
				result[i][j] = matrise[i][j] * tall;
			}
		}

		return result;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		if(a != b){
			return false;
		}
		return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}

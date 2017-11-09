package uebung_4_0; 

public class uebung_4_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int maximum = 500000 ;
		int summe = 0 ;
		int add = 1 ; 
			
		while ( summe <= maximum ) 
		{ 
			System.out.println ( summe + " + " + add +  " = " +  Math.addExact (summe, add) ) ;
		summe = summe + add ;
		add = add + 1 ;
		}
	}
}
// Testiluokka ja samalla näkymäluokka
public class main {

	public static void main (String [] args){
		//Luodaan pari subjektia ja pari tarkkailijaa
		KSubjekti Ks1 = new KSubjekti(1);
		KSubjekti Ks2 = new KSubjekti(3);
		KOTarkkailija t1 = new KOTarkkailija();
		KOTarkkailija t2 = new KOTarkkailija();
		KOTarkkailija t3 = new KOTarkkailija();

		//Lisätään kohteille tarkkailijoita
		Ks1.lisaaTarkkailija(t1);
		Ks1.lisaaTarkkailija(t2);
		Ks2.lisaaTarkkailija(t3);
		
		//Muutetaan kohteen 1 tilaa
		Ks1.setTila(2);
		
		//Poistetaan yksi tarkkailija kohteelta 1
		Ks1.poistaTarkkailija(t2);
		
		//Muutetaan tilaa kohteilta 1 ja 2
		Ks1.setTila(35);
		Ks2.setTila(66);
		
	}
}

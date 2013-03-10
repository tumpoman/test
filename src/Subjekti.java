
import java.util.ArrayList;
import java.util.Iterator;

// Yliluokka jossa määritellään tarkkailuun liittyvät attribuutit ja metodit
public class Subjekti {

	//Tarkkailija oliot säilytetään ArrayListalla
	private ArrayList<Tarkkailija> tarkkailijat = new ArrayList<Tarkkailija>();

	//Lisää tarkkailijan listalle ja lisää tarkkailijalle kohteen
	public void lisaaTarkkailija(Tarkkailija t) {
		tarkkailijat.add(t);
		t.setSubjekti(this);
		System.out.println(t+ " lisätty " +this);
	}
	
	//Poistaa tarkkailijan listalta
	public void poistaTarkkailija(Tarkkailija t) {
		tarkkailijat.remove(t);
		System.out.println(t+ " poistettu " +this);
	}

	//Suunnittelumallin mukainen notify() kaikille tarkkailijoille
	public void ilmoita(){
			
		 Iterator <Tarkkailija> t = tarkkailijat.iterator();
         while( t.hasNext() ) {
        	 Tarkkailija ta = ( Tarkkailija ) t.next();
             ta.paivita();
             //System.out.println("Imoitettu: " + ta );
         }
	}
	
	//Dummy getteri, jotta alityyppiperiaate toteutuu aliluokissa
	public int getTila() {
		return 0;
	}


}

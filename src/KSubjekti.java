

public class KSubjekti extends Subjekti {

	//Jotain tarkkailtavaa 
	private int tila;
	
	//Konstruktori
	public KSubjekti(int i){
		this.tila=i;
	}

	//Tilan asettaja
	public void setTila(int i){
		this.tila=i;
		
		//Käytetään yliluokan metodia
		//ilmoittamaan tarkkailijoille
		this.ilmoita();
	}
	
	//Tilan palauttaja 
	//Uudelleenmääritellään yliluokan metodi
	public int getTila (){
		return this.tila;
	}
	
}

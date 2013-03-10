

public class KOTarkkailija implements Tarkkailija{

	//Tarkkailun kohde määritellään Subjekti yliluokan mukaisesti
	private Subjekti subjekti;
	
	//Tarkkailun kohteen tila pidetään tallessa myös tarkkailijalla
	private int subjektintila;

	
	//Aseta tarkkailtava
	public void setSubjekti(Subjekti subjekti) {
		this.subjekti = subjekti;
	}
	
	//Päivitetään näkymää
	public void paivita(){
		this.subjektintila = subjekti.getTila();
		System.out.println((this)+" huomasi muutoksen:" 
		+ this.subjekti+" tila on "+this.subjektintila);
	}

}

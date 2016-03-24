package core;
import base.Descripteur;


public class Aretes {
	
	private int longueurArete;
	private Descripteur descript;
	private Sommets sommetSucc;
	
	public Aretes(int longueurArete, Descripteur descript, Sommets sommetSucc){
		this.longueurArete=longueurArete;
		this.descript=descript;
		this.sommetSucc=sommetSucc;
	}
	
	
	//geter arra ya les condés
	public int getLongueurArete() {
		return longueurArete;
	}
	
	public Descripteur getDescript() {
		return descript;
	}
	
	public Sommets getSommetSucc() {
		return sommetSucc;
	}
	
	//seter, jet seter
	public void setLongueurArrete(int longueurArete) {
		this.longueurArete = longueurArete;
	}

	public void setDescript(Descripteur descript) {
		this.descript = descript;
	}
	
	public void setSommetSucc( Sommets sommetSucc ) {
		this.sommetSucc=sommetSucc;
	}
	
}

package core;
import base.Descripteur;


public class Arete {
	
	private int longueurArete;
	private Descripteur descript;
	private Sommets sommetSucc;
	
	public Arete(int longueurArete, Descripteur descript, Sommets sommetSucc){
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
	public void setLongueurArete(int longueurArete) {
		this.longueurArete = longueurArete;
	}

	public void setDescript(Descripteur descript) {
		this.descript = descript;
	}
	
	public void setSommetSucc( Sommets sommetSucc ) {
		this.sommetSucc=sommetSucc;
	}
	
}

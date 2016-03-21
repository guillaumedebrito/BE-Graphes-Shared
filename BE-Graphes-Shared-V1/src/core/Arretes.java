package core;
import base.Descripteur;


public class Arretes {
	
	private int longueurArrete;
	private Descripteur descript;
	private Sommets sommetSucc;
	
	public Arretes(int longueurArrete, Descripteur descript, Sommets sommetSucc){
		this.longueurArrete=longueurArrete;
		this.descript=descript;
		this.sommetSucc=sommetSucc;
	}
	
	
	//geter arra ya les condés
	public int getLongueurArrete() {
		return longueurArrete;
	}
	
	public Descripteur getDescript() {
		return descript;
	}
	
	public Sommets getSommetSucc() {
		return sommetSucc;
	}
	
	//seter, jet seter
	public void setLongueurArrete(int longueurArrete) {
		this.longueurArrete = longueurArrete;
	}

	public void setDescript(Descripteur descript) {
		this.descript = descript;
	}
	
	public void setSommetSucc( Sommets sommetSucc ) {
		this.sommetSucc=sommetSucc;
	}
	
}

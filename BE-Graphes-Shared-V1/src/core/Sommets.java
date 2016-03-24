package core;

import java.util.ArrayList;

public class Sommets {
	
	private int num;
	private float longitudes;
	private float latitudes;
	private ArrayList<Arete> arete;
	private int nbSuccesseur ; 
	
	
	public Sommets(int num, float longitudes, float latitudes,int nbSuccesseur){
		this.num=num;
		this.longitudes=longitudes;
		this.latitudes=latitudes;
		this.nbSuccesseur=nbSuccesseur ; 
		this.arete = new ArrayList<Arete>();
	}
	
	
	public void addArete(Arete a) {
		arete.add(a) ; 
	}
	
	
	
	
	
	//geter arra ya les condés
	public int getNum(){
		return this.num;
	}
	
	public float getLongitudes(){
		return this.longitudes;
	}
	public float getLatitudes(){
		return this.latitudes;
	}

	public ArrayList<Arete> getArete() {
		return arete;
	}
	
	public int getNbSuccesseur() {
		return nbSuccesseur;
	}

	//seter, jet seter
	public void setArete(ArrayList<Arete> arete) {
		this.arete = arete;
	}
	
	public void setNum(int num) {
		this.num = num;
	}

	public void setLongitudes(float longitudes) {
		this.longitudes = longitudes;
	}

	public void setLatitudes(float latitudes) {
		this.latitudes = latitudes;
	}

	public void setNbSuccesseur(int nbSuccesseur) {
		this.nbSuccesseur = nbSuccesseur;
	}
	
	
	
	

}

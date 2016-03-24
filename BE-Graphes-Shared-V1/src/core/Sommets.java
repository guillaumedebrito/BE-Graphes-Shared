package core;

import java.util.ArrayList;

public class Sommets {
	
	private int num;
	private float longitudes;
	private float latitudes;
	private ArrayList<Aretes> arete;
	private int nbSuccesseur ; 
	
	
	public Sommets(int num, float longitudes, float latitudes,int nbSuccesseur){
		this.num=num;
		this.longitudes=longitudes;
		this.latitudes=latitudes;
		this.nbSuccesseur=nbSuccesseur ; 
		this.arete = new ArrayList<Aretes>();
	}
	
	
	public void addArete(Aretes a) {
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

	public ArrayList<Aretes> getArretes() {
		return arete;
	}
	
	public int getNbSuccesseur() {
		return nbSuccesseur;
	}

	//seter, jet seter
	public void setArretes(ArrayList<Aretes> arretes) {
		this.arete = arretes;
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

package com.blog.samples.domain;

import java.util.Date;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.blog.samples.web.utils.DateSerializer;

/**
 * The Class Fund.
 */
public class Produit{

	private String Id;
	private String Marque;
	private String Model;
	private String Etat;
	private String Desc;
	
    
	
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Produit(String id, String marque, String model, String etat, String desc) {
		super();
		Id = id;
		Marque = marque;
		Model = model;
		Etat = etat;
		Desc = desc;
	}


	public String getId() {
		return Id;
	}


	public void setId(String id) {
		Id = id;
	}


	public String getMarque() {
		return Marque;
	}


	public void setMarque(String marque) {
		Marque = marque;
	}


	public String getModel() {
		return Model;
	}


	public void setModel(String model) {
		Model = model;
	}


	public String getEtat() {
		return Etat;
	}


	public void setEtat(String etat) {
		Etat = etat;
	}


	public String getDesc() {
		return Desc;
	}


	public void setDesc(String desc) {
		Desc = desc;
	}




	@Override
	public String toString() {
		return "Produit [Id=" + Id + ", Marque="
				+ Marque + ", Model=" + Model + ", Etat="

				+ Etat + ", Desc=" + Desc + "]";
		
		
		
	}
}

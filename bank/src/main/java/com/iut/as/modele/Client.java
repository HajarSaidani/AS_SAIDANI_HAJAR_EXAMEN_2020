package com.iut.as.modele;

import java.util.List;

import org.hibernate.cfg.NotYetImplementedException;

public class Client {

	private String numeroClient;

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getNumeroClient() {
		return numeroClient;
	}

	public String getNom() {
		return nom;
	}

	private String nom;
	private String adresse;

	// 1 Client possède 1 ou plusieurs comptes :
	// 1 client 'estTitulaire' de 1 ou plusieurs comptes.
	private List<Compte> comptes;

	public boolean addCompte(Compte compte) {
		throw new NotYetImplementedException();
	}
}
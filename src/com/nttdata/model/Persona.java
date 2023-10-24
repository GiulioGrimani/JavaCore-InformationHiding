package com.nttdata.model;

public class Persona {

	// ATTRIBUTI DELLA CLASSE
	private String nome;
	private String cognome;
	private int eta;

	// COSTRUTTORE
	public Persona(String nome, String cognome, int eta) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}

	// GETTERS & SETTERS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

}

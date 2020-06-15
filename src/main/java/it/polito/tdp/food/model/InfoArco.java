package it.polito.tdp.food.model;

public class InfoArco {

	// Classe che rappresenta gli archi del grafo...creo un nuovo elemento di questa classe se esiste almeno un Food che può essere servito in entrambi i modi
	// descritti dalle porzioni (rappresentati dalle stringhe). Il peso indica quanti cibi vengono serviti con entrambi i tipi di porzione
	private String vertice1;
	private String vertice2;
	private int peso ;
	
	/**
	 * @param vertice1
	 * @param vertice2
	 * @param peso
	 */
	public InfoArco(String vertice1, String vertice2, int peso) {
		super();
		this.vertice1 = vertice1;
		this.vertice2 = vertice2;
		this.peso = peso;
	}
	public String getVertice1() {
		return vertice1;
	}
	public void setVertice1(String vertice1) {
		this.vertice1 = vertice1;
	}
	public String getVertice2() {
		return vertice2;
	}
	public void setVertice2(String vertice2) {
		this.vertice2 = vertice2;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	
	
}

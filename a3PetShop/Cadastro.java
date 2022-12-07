package a3PetShop;

import java.util.Scanner;


public class Cadastro{
	Scanner sc = new Scanner(System.in);
	private String nome, especie, raca;
	private int banho, tosa, vacina;
	private int id, preco;

	public String getNome() {
		return nome;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public int getBanho() {
		return banho;
	}

	public void setBanho(int banho) {
		this.banho = banho;
                this.preco = preco + banho;
	}

	public int getTosa() {
		return tosa;
	}

	public void setTosa(int tosa) {
		this.tosa = tosa;
                this.preco = preco + tosa;
	}

	public int getVacina() {
		return vacina;
	}

	public void setVacina(int vacina) {
		this.vacina = vacina;
                this.preco = preco + vacina;
	}
	
	Cadastro(String nome, String especie
                , String raca, int banho, int tosa, int vacina, int preco ) {
		this.nome = nome;
                this.especie = especie;
                this.raca = raca;
                this.banho = banho;
                this.tosa = tosa;
                this.vacina = vacina;
                this.preco = preco;
	}
        
        
        
	public void padrao() {
		
	}

}
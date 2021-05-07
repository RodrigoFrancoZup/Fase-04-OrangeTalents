package br.com.zupacademy.rodrigo.fase04.pessoa;

public class Pessoa {

	private String nome;
	private Integer idade;

	public Pessoa(String nome, Integer idade) {
		this.nome = nome;
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Sou o " + this.nome + " e tenho " + this.idade + " anos.";
	}

}

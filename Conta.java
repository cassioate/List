package List;

public class Conta {
	private String nome;
	private int idade;
	private int senha;
	private Conta proximo;
	private Conta Anterior;
	
	public Conta(String nome, int idade, int senha) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.senha = senha;
	}


	public Conta getProximo() {
		return proximo;
	}


	public void setProximo(Conta proximo) {
		this.proximo = proximo;
	}



	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public int getSenha() {
		return senha;
	}


	public void setSenha(int senha) {
		this.senha = senha;
	}


	public Conta getAnterior() {
		return Anterior;
	}


	public void setAnterior(Conta anterior) {
		Anterior = anterior;
	}

	
	
}

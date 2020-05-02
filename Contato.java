package Lista04.q01;

public class Contato {
	private String doc;
	private String nome;
	private String telefone;
	private String endereco;

	public Contato(String nome) {
		this(nome, "  ", "  ", "  " );
	}



	public Contato(String nome, String telefone, String endereco, String doc) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.doc = doc;
	}

	/*public Contato(String doc, String nome, String telefone, String endereco) {
		super();
		this.doc = doc;
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
	}*/
	
	public String getDoc() {
		return doc;
	}

	public void setDoc(String doc) {
		this.doc = doc;
	}
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}

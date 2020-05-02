package Lista04.q01;

public class BaseDeDados {

	Contato[] contatos;
	int numContatos;
	String valDoc;

	public BaseDeDados() {
		contatos = new Contato[100];
		numContatos = 0;
	}

	void adicionar(Contato novovalDoc, Contato novoContato) {
		// TODO adicionar
		contatos[numContatos] = novoContato;
		contatos[numContatos] = novovalDoc;
		numContatos++;
	}

	Contato buscar(int posicao) {
		return contatos[posicao];
	}

	Contato buscar(String nome) {
		// TODO buscar
		for (int posicao = 0; posicao < contatos.length; posicao++) {
			Contato contatoPosicaoAtual = contatos[posicao];
			if (contatoPosicaoAtual == null)
				continue;
			else if (contatoPosicaoAtual.getNome().equals(nome)) {
				return contatoPosicaoAtual;
			}
		}
		return null;
	}

	// TODO alterar
	void alterarNome(int posicao, String novoNome) {
		contatos[posicao].setNome(novoNome);
	}

	void alterarEndereco(int posicao, String novoEndereco) {
		contatos[posicao].setEndereco(novoEndereco);
	}

	void alterarTelefone(int posicao, String novoTelefone) {
		contatos[posicao].setTelefone(novoTelefone);
	}

	void remover(int posicao) {
		// TODO remover
		contatos[posicao] = null;
		numContatos--;
	}

}

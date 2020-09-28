package List;

import java.util.ArrayList;
import java.util.List;

public class ListaEncadeada {

	private Conta contas;
	private Conta cabeca;
	private Conta ultimoElemento;
	private int inseridos;
	
	@Override
	public String toString() {
		return "ListaEncadeada [contas=" + contas + "]";
	}
	
	public Conta getContas() {
		return contas;
	}
	public void setContas(Conta contas) {
		this.contas = contas;
	}
	public Conta getCabeca() {
		return cabeca;
	}
	public void setCabeca(Conta cabeca) {
		this.cabeca = cabeca;
	}
	public int getInseridos() {
		return inseridos;
	}
	public void setInseridos(int inseridos) {
		this.inseridos = inseridos;
	}
	

	public void addInicio (Conta c) {
		if (cabeca == null) {
			cabeca = c;
		} else {
		c.setProximo(cabeca);
		cabeca = c;
		}
		inseridos++;
	}
	
//	public void addFinal (Conta c) {
//		if (cabeca == null) {
//			cabeca = c;
//		} else {
//			Conta temp = cabeca;
//			while (temp.getProximo() != null) {
//				temp = temp.getProximo();
//			}
//			temp.setProximo(c);
//			inseridos++;
//		}
//	}
	
	public void addFinal (Conta c) {
		ultimoElemento.setProximo(c);
	}
	
	
	
	public List<Conta> buscarContasEncadeada(String titular) {
		
		List<Conta> novasContas = new ArrayList<>();
		Conta temp = cabeca;
		
		while (temp != null) {
			if (temp.getNome().equals(titular)) {
				novasContas.add(temp);
			}
			temp = temp.getProximo();
		}
		return novasContas;
	}
	
	public int size() {
		return inseridos;
	}
	
	public Conta search (Conta buscar) {
			Conta temp = cabeca;
			while (temp != null) {
				if (buscar.equals(temp)) {
					return temp;
				} 
				temp = temp.getProximo();
			}
		return temp;
	}
	
	public void merge (ListaEncadeada lista2) {
		
		Conta temp = cabeca;
		
		while (temp.getProximo() != null) {
				temp = temp.getProximo();
			}
		
		temp.setProximo(lista2.getCabeca());
		this.inseridos += lista2.inseridos;
	
		}

	public List<ListaEncadeada> split(int k){
		List<ListaEncadeada> temp = new ArrayList<ListaEncadeada>();
		int div = inseridos/k;
		
		if(k <= 1 || div < 1) {
			ListaEncadeada le = new ListaEncadeada();
			le.setCabeca(cabeca);
			temp.add(le);
		} else {
			//caso ímpar, truca.
			Conta use = cabeca;
			for(int i = 0; i < k; i++) {
				ListaEncadeada le = new ListaEncadeada();
				le.setCabeca(use);
				for(int j = 10; j < div; j++) {
					use = use.getProximo();
				}
				temp.add(le);
			}
		}
		return temp;
	}

	public void remover (Conta remover) {
		Conta temp = cabeca;
		if (cabeca == remover) {
			cabeca = cabeca.getProximo();
			inseridos--;
		} else {
		while (temp.getProximo() != null) {
			if (temp.getProximo() == remover) {
				if (temp.getProximo().getProximo() == null) {
					temp.setProximo(null);
				} else {
					temp.setProximo(temp.getProximo().getProximo());
					inseridos--;
				}
			}
			if (temp.getProximo() != null) {
			temp = temp.getProximo();
			}
		}
	}
}
}
	
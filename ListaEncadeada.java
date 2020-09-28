package List;

import java.util.ArrayList;
import java.util.List;

public class ListaEncadeada {

	private List<Conta> contas;
	private Conta cabeca;
	private int inseridos;
	
	public List<Conta> getContas() {
		return contas;
	}
	public void setContas(List<Conta> contas) {
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
	
	public void addFinal (Conta c) {
		if (cabeca == null) {
			cabeca = c;
		} else {
			Conta temp = cabeca;
			while (temp.getProximo() != null) {
				temp = temp.getProximo();
			}
			temp.setProximo(c);
			inseridos++;
		}
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
			//caso �mpar, truca.
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
}

	
	
	
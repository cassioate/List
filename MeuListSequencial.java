package List;

import java.util.Arrays;

public class MeuListSequencial<T> {

	private static final int INITIAL_ALLOCATION = 10;
	
	private T[] array = (T[]) new Object [INITIAL_ALLOCATION];
	
	private int inseridos;
	
	public void add(T o) {
		if (inseridos == array.length) {
			
			T[] novoArray = (T[]) new Object [array.length + INITIAL_ALLOCATION];
			for (int i = 0; i < array.length; i++) {
				novoArray[i] = array[i];
			}
			array = novoArray;
		}
		array[inseridos] = o;
		inseridos++;
	}
	
	public int size() {
		return inseridos;
	}
	
	public void remove(Integer posicao) {
		array[posicao] = null;
		T[] novoArray = (T[]) new Object [inseridos -1];
		int r = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i] != null) {
				novoArray[r] = array[i];
				r++;
			}
		}
		array = novoArray;
		inseridos--;
	}

	@Override
	public String toString() {
		return Arrays.toString(array);
	}
	
	
}

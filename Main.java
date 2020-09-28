package List;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		MeuListSequencial<String> teste = new MeuListSequencial<String>();

		teste.add("Cassio");
		teste.add("THALYS");
		teste.add("Opa");
		teste.add("Pedro");
		teste.add("José");
		teste.add("Clerosmino");
		teste.add("NumSei");
		teste.add("Pedro2.0");
		teste.add("Thalys2.0");
//		teste.add("Emanuel");
		
	
		System.out.println(teste);
		
		teste.remove(8);
		System.out.println(teste);
	
		
	}


}

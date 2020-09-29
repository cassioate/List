package List;

public class Main {

	public static void main(String[] args) {
		
		MeuListSequencial<String> teste = new MeuListSequencial<String>();
		
		ListaEncadeada teste123 = new ListaEncadeada();
		
		Conta c1 = new Conta("A", 10, 12345);
		Conta c2 = new Conta("B", 10, 12345);
		Conta c3 = new Conta("C", 10, 12345);
		Conta c4 = new Conta("D", 10, 12345);
		Conta c5 = new Conta("E", 10, 12345);
		Conta c6 = new Conta("F", 10, 12345);
		
		teste123.addInicio(c1);
		teste123.addInicio(c2);
		teste123.addInicio(c3);
		teste123.addInicio(c4);
		teste123.addInicio(c5);
		teste123.addFinal(c6);
		
		System.out.println(teste123.contasEncadeadas());
//		System.out.println(teste123.size());
//		teste123.remover(c3);
//		System.out.println(teste123.contasEncadeadas());
//		System.out.println(teste123.size());
//		teste123.remover(c1);
//		System.out.println(teste123.contasEncadeadas());
//		System.out.println(teste123.size());
//		teste123.remover(c5);
//		System.out.println(teste123.contasEncadeadas());
//		System.out.println(teste123.size());
//		teste123.remover(c4);
//		System.out.println(teste123.contasEncadeadas());
//		System.out.println(teste123.size());
		
//		teste.add("Cassio");
//		teste.add("THALYS");
//		teste.add("Opa");
//		teste.add("Pedro");
//		teste.add("José");
//		teste.add("Clerosmino");
//		teste.add("NumSei");
//		teste.add("Pedro2.0");
//		teste.add("Thalys2.0");
//		teste.add("Emanuel");
//		
//	
//		System.out.println(teste);
//		teste.remove(8);
//		System.out.println(teste);
//	
		
	}


}

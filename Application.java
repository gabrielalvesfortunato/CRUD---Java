package CRUD;

import java.util.List;

public class Application {
	static Operacoes operacoes = new Operacoes();
	
	public static void main(String[] args) {

		cadastroArray();
		listarCadastro();
	}
	
	public static void cadastroArray() {
		
		Cadastro cadastro1 = new Cadastro();
		cadastro1.setNome("Joao");
		cadastro1.setEmail("email@gmail.com");
		cadastro1.setId(1);
		cadastro1.setCidade("Belo Horizonte");
		cadastro1.setUf("MG");
		operacoes.salvarCadastro(cadastro1);
		
	//**************************************************************//	
		
		Cadastro cadastro2 = new Cadastro();
		cadastro2.setNome("Maria");
		cadastro2.setEmail("email2@gmail.com");
		cadastro2.setId(2);
		cadastro2.setCidade("Sao Paulo");
		cadastro2.setUf("MG");
		operacoes.salvarCadastro(cadastro2);

	}
	
	public static void listarCadastro (){
		
		List<Cadastro> lista = operacoes.listarCadastro();
		
		for (Cadastro cadastro : lista) {
			
			System.out.println("ID: " + cadastro.getId());
			System.out.println("Nome: " + cadastro.getNome());
			System.out.println("UF: " + cadastro.getUf());
			System.out.println("Email: " + cadastro.getEmail());
			System.out.println("Cidade: "+ cadastro.getCidade());
				
		}
		
	}
	
}


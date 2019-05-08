package CRUD;

import java.util.ArrayList;
import java.util.List;

public class Operacoes implements InterfaceOperacoes {

	
	List<Cadastro> listaCadastro = new ArrayList<Cadastro>();
	
	public boolean salvarCadastro(Cadastro cadastro) {
		try {
		listaCadastro.add(cadastro);
		
		}catch(Exception erro) {
			return false;
		}
		return true;
	}
	
	public boolean excluirCadastro(Integer id) {
		return false;
	}

	public boolean atualizarCadastro(Cadastro cadastro) {
		return false;
	}

	public List<Cadastro> listarCadastro() {
		return listaCadastro;
	}
}

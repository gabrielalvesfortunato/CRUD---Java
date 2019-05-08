package CRUD;

import java.util.List;

public interface InterfaceOperacoes {
	
	public boolean atualizarCadastro(Cadastro cadastro);
	public boolean excluirCadastro(Integer id);
	public List <Cadastro> listarCadastro();
	public boolean salvarCadastro(Cadastro cadastro);

}	
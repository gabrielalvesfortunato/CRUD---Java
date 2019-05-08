package CRUD;

public class Cadastro {

	public Integer id;
	public String nome;
	public String email;
	public String cidade;
	public String uf;
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Integer getId() {
		return id;
	}
	public  void setId(Integer id) {
		this.id = id;
	}
	
	public  String getCidade() {
		return cidade;
	}
	
	public  void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public  String getUf() {
		return uf;
	}
	
	public  void setUf(String uf) {
		this.uf = uf;
	}
}
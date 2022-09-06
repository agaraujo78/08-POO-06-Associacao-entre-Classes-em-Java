package pessoaendereco;

public class Endereco {
	//Atributos
	private String logradouro;
	private String complemento;
	private int numero;
	private String cep;
	
	//métodos de acesso
	 
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	//impressao de dados
	public String imprimir() {
		return logradouro + ", " + numero + "\nComplemento: " 
				+ complemento + "\nCEP: " + cep;
	}
	//métodos de acesso
	
}
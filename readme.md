 # Associação entre Classes em Java (Conceito e Exercício) 



**![img](file:///C:\Users\Agara\AppData\Local\Temp\msohtmlclip1\01\clip_image002.png)![img](file:///C:\Users\Agara\AppData\Local\Temp\msohtmlclip1\01\clip_image004.png)![img](file:///C:\Users\Agara\AppData\Local\Temp\msohtmlclip1\01\clip_image006.png)******



###public class Pessoa


	package pessoaendereco;
	public class Pessoa {
	//atributos 
	private String nome;
	private int idade;
	private char sexo;
	private Endereco end;
	
	//Default
	public Pessoa() {
		this.end = new Endereco();
	}
	public Pessoa(String nome, int idade, char sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.end = new Endereco();
	}	
	public Pessoa(String nome, int idade, char sexo, Endereco end) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.end = end;
	}	
	//métodos de acesso
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public Endereco getEnd() {
		return end;
	}
	public void setEnd(Endereco end) {
		this.end = end;
	}
	//impressao de dados
	public String imprimir() {
		return "\nNome: "+ nome + "\nIdade: "+ idade + "\nSexo: " 
				+ sexo + "\nEndereço: " + end.imprimir();
	}

### public class Endereco




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
	}


 

### public class AppPessoaEndereco




	package pessoaendereco;
	
	import java.util.Scanner;
	
	public class AppPessoaEndereco {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Scanner entradaString = new Scanner(System.in);
		
		char resp;
		
		// Estou criando OBJETO Pessoa e Endereço
		Pessoa p = new Pessoa();
		Endereco end = new Endereco();
		
		//dados da pessoa
		System.out.print("Digite o nome: ");
		p.setNome(entradaString.nextLine());
		System.out.print("Digite a idade: ");
		p.setIdade(entrada.nextInt());
		System.out.print("Digite o sexo (m/f) : ");
		p.setSexo(entrada.next().charAt(0));
		System.out.println("===================================");
		
		//dados do Endereco
		System.out.print("Digite o seu endereço: ");
		end.setLogradouro(entradaString.nextLine());
		System.out.printf("Digite o numero: ");
		end.setNumero(entrada.nextInt());
		
		System.out.printf("Tem complemento?");
		resp = entrada.next().charAt(0);
		
		if(resp == 's') {
			System.out.printf("Digite o complemento: ");
			end.setComplemento(entradaString.nextLine());	
		} else {
			end.setComplemento("");
		}
		System.out.printf("Digite o CEP: ");
		end.setCep(entradaString.nextLine());
		System.out.println("===================================");
		
		// associaçao entre pesssoa e endereco
		p.setEnd(end);
		
			System.out.println("Dados da Pessoa: " + p.imprimir());
			}
		}





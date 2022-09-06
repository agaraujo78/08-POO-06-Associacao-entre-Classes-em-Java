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

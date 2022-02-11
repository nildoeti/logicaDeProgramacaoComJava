package logicaDeProgramacaoComJavaIntroducao;

import java.util.Scanner;

public class CalcularValorTroco {

	public static void main(String[] args) {
		// CALCULA troco de um produto
		Scanner terminal = new Scanner(System.in);	
		
		// entrada dos dados
		System.out.print("Digite o valor do produto: ");
		Double valorDoProduto = terminal.nextDouble();
		
		System.out.println("Informe o valor passado pelo cliente: ");
		Double valorPassadoPeloCliente = terminal.nextDouble();
		
		// processamento dos dados
		Double resultado = valorPassadoPeloCliente - valorDoProduto;
		
		// saida
		System.out.println("Troco: " + resultado);
		
		terminal.close();
	}

}

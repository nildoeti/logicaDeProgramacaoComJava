package logicaDeProgramacaoComJavaIntroducao;

import java.util.Scanner;

public class CalcularValorTroco {

	public static void main(String[] args) {
		// CALCULA troco de um produto
		Scanner terminal = new Scanner(System.in);
		
		System.out.println("Digite o valor do produto: ");
		Double valorDoProduto = terminal.nextDouble();
		
		System.out.println("Digitee a quantidade passada pelo cliente: ");
		Double valorPassadoPeloCliente = terminal.nextDouble();
		
		Double resultado = valorDoProduto - valorPassadoPeloCliente;
		
		System.out.println("Troco: " + resultado);
		terminal.close();
	}

}

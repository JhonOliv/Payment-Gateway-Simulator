package viewers;

import java.util.Scanner;

import Exception.ArrayIsEmptyException;
import models.Checkout;
import models.Produtos;
import models.ProdutosDisponiveis;

public class InicializarCompra {
	public static void main(String[] args) throws ArrayIsEmptyException {
		
		Scanner scan = new Scanner(System.in);
		menu();
		System.out.print("Digite a opção escolhida: ");
		int opcao = scan.nextInt();
		ProdutosDisponiveis pd = new ProdutosDisponiveis();			
		while (opcao != 3) {	
			
			
		if(opcao == 1) {
			System.out.println("Digite o nome do Produto: ");
			String nomeProduto = scan.next();
			System.out.println("Digite o preço do produto: ");
			double  preco = scan.nextDouble();
			System.out.println("Digite a quantidade: ");
			int  qtdEstoque = scan.nextInt();
			Produtos produto = new Produtos(nomeProduto, preco, qtdEstoque);
			
			pd.setProdutoDisponiveis(produto);
			
			System.out.println(produto.getNomeProduto() + " foi adicionado com sucesso disponível em estoque"
					+ " são " + produto.getQtdEstoque());
		}else if(opcao == 2) {
			System.out.println("Digite seu nome: ");
			String nomeCliente = scan.next();
			System.out.println("Digite número cartão: ");
			String cardNumber  = scan.next();
			System.out.println("Digite código segurança: ");
			String codSeg = scan.next();
			System.out.println("Digite data validade: ");
			String data = scan.next();
			System.out.println("Digite o nome do produto: ");
			
			String nomeProduto = scan.next().toLowerCase();
			
			Checkout compra = new Checkout(nomeCliente, cardNumber, codSeg, data, pd.getProdutoDisponiveis(nomeProduto));
			
			System.out.print("Escolha a forma de pagemento, Parcelo ou Avista: ");
			String pagamento = scan.next().toLowerCase();
			
			if(pagamento.equals("avista")) {
				System.out.println("Valor total com desconto: R$ " + compra.PagamentoAvista());
			}else if(pagamento.equals("parcelado")) {
				System.out.print("Você deseja parcelar em quantas vezes: ");
				int vezes = scan.nextInt();
				System.out.println("\nValor Parcelado em "+ vezes + " valor a ser pago por mês:"
				+ compra.PagamentoParcelado(vezes)); 
			}else {
				System.out.print("Nenhuma opção selecionada!");
			}
			
		}else {
			System.out.print("Obrigado Volte Sempre");
		}
			menu();
			System.out.print("Digite a opção escolhida: ");
			opcao = scan.nextInt();
		}
		
		scan.close();
	}
	
	
	public static void menu() {
		System.out.println("----------Menu----------");
		System.out.println("1- Adicionar Produto----");
		System.out.println("2- Realizar Compra------");
		System.out.println("3- Finalizar seção------");
		
	}
		
		
}

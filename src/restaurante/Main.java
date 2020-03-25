package restaurante;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ColecaoDePedidos colecao = new ColecaoDePedidos();


		for (int i = 0; i < 10; i++) {
			Alimento a = new Alimento();
			Cliente cliente = new Cliente();
			Comida comida = new Comida();
			Bebida bebida = new Bebida();

			a.cliente = cliente;
			a.comida = comida;
			a.bebida = bebida;
			
			System.out.println("Seja Bem-Vindo\n---------------");
			System.out.println(" 1- Adicionar\n 2- Remover\n 3- Listar\n 4- Fechar");
			int registrarmesa = scanner.nextInt();

			if (registrarmesa == 1) {
				System.out.println("Digite o número da mesa:");
				a.cliente.mesa = scanner.nextInt();

				System.out.println("Digite a opção escolhida:\n 1- A la carte\n 2- Self Service");
				a.opcao = scanner.nextInt();

				// a la carte
				if (a.opcao == 1) {

					// Entrada
					System.out.println("Digite o nome da entrada:\n (Não havendo, digite 1)");
					a.comida.entrada = scanner.next();

					if (!a.comida.entrada.equals("1")) {
						System.out.println("Digite o preço de " + a.comida.entrada + ":");
						a.comida.valorEnt = scanner.nextFloat();
						a.ValorTotal = a.ValorTotal + a.comida.valorEnt;
						
					}
					// Prato Principal
					System.out.println("Digite o nome do prato principal:\n (Não havendo, digite 1)");
					a.comida.pratoPrincipal = scanner.next();

					if (!a.comida.pratoPrincipal.equals("1")) {
						System.out.println("Digite o preço de " + a.comida.pratoPrincipal + ":");
						a.comida.valorPrato = scanner.nextFloat();
						a.ValorTotal = a.ValorTotal + a.comida.valorPrato;

					}
					// Sobremesa
					System.out.println("Digite o nome da sobremesa:\n (Não havendo, digite 1)");
					a.comida.sobremesa = scanner.next();

					if (!a.comida.sobremesa.equals("1")) {
						System.out.println("Digite o preço de " + a.comida.sobremesa + ":");
						a.comida.valorSob = scanner.nextFloat();
						a.ValorTotal = a.ValorTotal + a.comida.valorSob;

					}
					// Porcao Extra
					System.out.println("Digite o nome da porção extra:\n (Não havendo, digite 1)");
					a.comida.porcaoExtra = scanner.next();

					if (!a.comida.porcaoExtra.equals("1")) {
						System.out.println("Digite o preço de " + a.comida.porcaoExtra + ":");
						a.comida.valorPor = scanner.nextFloat();
						a.ValorTotal = a.ValorTotal + a.comida.valorPor;

					}
					// Bebida
					System.out.println("Digite o nome da bebida:\n (Não havendo, digite 1)");
					a.bebida.bebida = scanner.next();

					if (!a.bebida.bebida.equals("1")) {
						System.out.println("Digite o preço de " + a.bebida.bebida + ":");
						a.bebida.valorBeb = scanner.nextFloat();
						a.ValorTotal = a.ValorTotal + a.bebida.valorBeb;

					}

					// Self Service
				} else if (a.opcao == 2) {

					a.comida.selfService = "Self Service";

					System.out.println("Digite o peso da refeição:");
					a.comida.peso = scanner.nextFloat();

					final float PrecoPorKg = 40;

					a.comida.valorSelfService = PrecoPorKg * a.comida.peso;

				}

				else if (a.opcao < 1 || a.opcao > 2) {
					System.out.println("Número Inválido");
				}

				colecao.adicionar(a);

			} else if (registrarmesa == 2) {
				System.out.println("Digite o número do índice");
				int indice = scanner.nextInt();
				colecao.remover(indice);

			} else if (registrarmesa < 1 || registrarmesa > 4) {
				System.out.println("Número Inválido");
			} else if (registrarmesa == 3) {
				
				colecao.listar();
				
			}else if (registrarmesa == 4) {
				i =10;
			}

		}
		System.out.println("Sistema Encerrado");
		scanner.close();
	}
}
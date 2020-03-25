package restaurante;
import java.util.ArrayList;

public class ColecaoDePedidos extends Alimento {

	public ArrayList<Alimento> listaAlimentos = new ArrayList<Alimento>();

	public void listar() {

		for (int j = 0; j < listaAlimentos.size(); j++) {

			int mesa = listaAlimentos.get(j).cliente.mesa;
			String entrada = listaAlimentos.get(j).comida.entrada;
			String pratoPrincipal = listaAlimentos.get(j).comida.pratoPrincipal;
			String sobremesa = listaAlimentos.get(j).comida.sobremesa;
			String porcaoExtra = listaAlimentos.get(j).comida.porcaoExtra;
			String selfService = listaAlimentos.get(j).comida.selfService;
			String bebida = listaAlimentos.get(j).bebida.bebida;
			float peso = listaAlimentos.get(j).comida.peso;
			int opcao =  listaAlimentos.get(j).opcao;
			String cop ="1";

			if (opcao == 1) {

				System.out.println(j + " - " + "mesa " + mesa + ":");
				if (!entrada.equals(cop)) {
					System.out.println("Entrada: " + entrada + " R$ " + listaAlimentos.get(j).comida.valorEnt);
				}
				if (!pratoPrincipal.equals(cop)) {
					System.out.println(
							"Prato Principal: " + pratoPrincipal + " R$ " + listaAlimentos.get(j).comida.valorPrato);
				}
				if (!sobremesa.equals(cop)) {
					System.out.println("Sobremesa: " + sobremesa + " R$ " + listaAlimentos.get(j).comida.valorSob);
				}
				if (!porcaoExtra.equals(cop)) {
					System.out.println("Porção Extra: " + porcaoExtra + " R$ " + listaAlimentos.get(j).comida.valorPor);
				}
				if (!bebida.equals(cop)) {
					System.out.println("Bebida: " + bebida + " R$ " + listaAlimentos.get(j).bebida.valorBeb);
				}
				
				System.out.println("Valor Total: R$: "+ listaAlimentos.get(j).ValorTotal );
				
				

			} else if (opcao == 2) {

				System.out.print(j + " - " + selfService + " - " + peso + "Kg\n" + "Total a pagar: " + "R$ "
						+ listaAlimentos.get(j).comida.valorSelfService);
			}

			System.out.println("\n-----------------");
		}
	}

	public void adicionar(Alimento a) {
		listaAlimentos.add(a);
		System.out.println("Pedido Adicionado\n");
	}

	public void remover(int indice) {
		listaAlimentos.remove(indice);
		System.out.println("Pedido Removido\n");

	}
}
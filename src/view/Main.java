package view;

import model.ItemVenda;
import model.Produto;
import model.Venda;
import model.VendaLista;

public class Main {

	public static void main(String[] args) {
		
		Produto objProduto = new Produto("Rabanete",2.5);
		ItemVenda objItemVenda = new ItemVenda(objProduto, 5);

		Produto objProduto2 = new Produto("Alho",1.5);
		ItemVenda objItemVenda2 = new ItemVenda(objProduto2, 8);
		
		Venda obVenda = new Venda();
		
		obVenda.adicionarItem(objItemVenda);
		obVenda.adicionarItem(objItemVenda2);
		
		VendaLista objVendaLista = new VendaLista(obVenda);
		
		
		System.out.println(objVendaLista.exibir());
		System.out.println("Vendas: "+obVenda.totalVenda());

	}

}

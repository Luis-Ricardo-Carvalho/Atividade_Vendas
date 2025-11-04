package model;

import java.util.ArrayList;
import java.util.List;

public class VendaLista {
	
	private List<ItemVenda> itens;

    public VendaLista(Venda itens) {
        this.itens = itens.getItens();
    }
    
    public void exibir(){
    	
    	for (int i = 0; i < itens.size(); i++) {
            System.out.printf("%-15s %-10d R$ %-13.2f R$ %-13.2f%n",
            		itens.get(i).getProduto().getNome(),
            		itens.get(i).getQuantidade(),
            		itens.get(i).getProduto().getValor(),
            		itens.get(i).getTotalItem());
        }
    }
	
	
}

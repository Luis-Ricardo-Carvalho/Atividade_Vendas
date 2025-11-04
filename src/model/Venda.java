package model;

import java.util.ArrayList;
import java.util.List;

public class Venda {
	
    private List<ItemVenda> itens;

    public Venda() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemVenda item) {
        itens.add(item);
    }

    public List<ItemVenda> getItens() {
        return itens;
    }
    
    public double totalVenda() {
    	
    	double total = 0;
    	
    	for (int i = 0; i < itens.size(); i++) {
			total =+ itens.get(i).getTotalItem();
		}
    	
    	return total;
    }

}

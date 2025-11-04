package model;

import java.util.ArrayList;
import java.util.List;

public class VendaLista {
	
	private List<ItemVenda> itens;
	private List<String> retorno = new ArrayList<>();;
	
	

    public VendaLista(Venda itens) {
        this.itens = itens.getItens();
    }
    
    public List<String> exibir(){
    	
    	for (int i = 0; i < itens.size(); i++) {
    		retorno.add(""+itens.get(i).getProduto().getNome()+" "+
            		itens.get(i).getQuantidade()+" "+
            		itens.get(i).getProduto().getValor()+" "+
            		itens.get(i).getTotalItem());
        }
    	
		return retorno;
    }
	
	
}

package com.uefs.sigsorveterias.model;

public class ItemPedido {

    private Produto produto;
    private Integer quantidade;

    public ItemPedido(Produto produto, Integer quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    /**
     * Retorna o valor total do pedido
     * @return valorTotal (preço do produto * quantidade)
     */
    public Double getValorTotal() {
        return produto.getPreco() * quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "{" +
                "produto=" + produto +
                ", quantidade=" + quantidade +
                '}';
    }
}

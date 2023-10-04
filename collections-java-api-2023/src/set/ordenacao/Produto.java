package set.ordenacao;

import java.util.Objects;
import java.util.Comparator;

public class Produto implements Comparable<Produto> {

    //Atributos

    private long codigo;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(long codigo, String nome, double preco, int quantidade){
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // compara o nome do produto
    public int compareTo(Produto p){
        return nome.compareToIgnoreCase(p.getNome());
    }

    
    public long getCodigo(){
        return codigo;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public int getQuantidade(){
        return quantidade;
    }

        // Elimina códigos duplicados
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return getCodigo() == produto.getCodigo();
    }

    public int hashCode(){
        return Objects.hash(getCodigo());
    }


    // Impressão formatada
    public String toString() {
        return "Produto{" +
            "Codigo = " + codigo +
            ", Nome = '" + nome + '\'' +
            ", Preco = " + preco +
            ", Quantidade = " + quantidade +
            '}';
      }

}

class ComparatorPorPreco implements Comparator<Produto> {
    public int compare(Produto p1, Produto p2){
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}
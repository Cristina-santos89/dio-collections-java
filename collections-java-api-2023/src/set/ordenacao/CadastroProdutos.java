package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    // atributos

    private Set<Produto> produtosSet;

    public CadastroProdutos(){
        this.produtosSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtosSet.add(new Produto(cod, nome, preco, quantidade));
    }

    // TreeSet deixa organizado por nome
    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtosSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtosSet);
        return produtosPorPreco;
    } 

    public static void main(String[] args) {
    // Criando uma instância do CadastroProdutos
    CadastroProdutos cadastroProdutos = new CadastroProdutos();

    // Adicionando produtos ao cadastro
    cadastroProdutos.adicionarProduto(2222, "Smartphone", 2000, 10);
    cadastroProdutos.adicionarProduto(2222, "Notebook", 3500, 5);
    cadastroProdutos.adicionarProduto(2224, "Mouse", 30, 20);
    cadastroProdutos.adicionarProduto(2225, "Teclado", 50, 15);

    // Exibindo todos os produtos no cadastro
    System.out.println(cadastroProdutos.produtosSet);

    // Exibindo produtos ordenados por nome
    System.out.println(cadastroProdutos.exibirProdutosPorNome());

    // Exibindo produtos ordenados por preço
    System.out.println(cadastroProdutos.exibirProdutosPorPreco());
  }
}



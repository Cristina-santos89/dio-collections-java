package set.pesquisa;
public class Contato {
//Atributos

private String nome;

private int numero;

public Contato(String nome, int numero){
    this.nome = nome;
    this.numero = numero;
}

public String getNome(){
    return nome;
}

public int getNumero(){
    return numero;
}

}

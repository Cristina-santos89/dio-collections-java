package map.operacoesbasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

// Atributo

private Map<String, Integer> agendaContatoMap;

public AgendaContatos(){
    this.agendaContatoMap = new HashMap<>();
}

// Put serve para adicionar elemento e atualizar // Faz um replace (atualiza)
public void adicionarContato(String nome, Integer telefone){
    agendaContatoMap.put(nome, telefone);
}

// Vericar se a lista está vazia (!agendaContatoMap.isEmpty)
public void removerContato(String nome){
    if(!agendaContatoMap.isEmpty()){
        agendaContatoMap.remove(nome);
    }
}

// Imprime os contatos
public void exibirContatos(){
    System.out.println(agendaContatoMap);
}
//Retorna o número correspondente ao nome
public Integer pesquisarPorNome(String nome){
    Integer numeroPorNome = null;
    if(!agendaContatoMap.isEmpty()){
       numeroPorNome = agendaContatoMap.get(nome);
    }
    return numeroPorNome;
}

public static void main(String[] args) {
    AgendaContatos agendaContatos = new AgendaContatos();

       // Adicionando contatos à agenda
      agendaContatos.adicionarContato("João", 123456);
      agendaContatos.adicionarContato("Maria", 0);
      agendaContatos.adicionarContato("Maria Fernandes", 1111);
      agendaContatos.adicionarContato("Ana", 5555555);
      agendaContatos.adicionarContato("Fernando", 666643);
      //Exemplo: Carolina adicionada duas vezes com telefones diferentes
      // Devido ao Put ele considera o último dados incluso (replace)
      agendaContatos.adicionarContato("Carolina", 675433);
      agendaContatos.adicionarContato("Carolina", 32325432);

      agendaContatos.exibirContatos();

      agendaContatos.removerContato("Ana");
      agendaContatos.exibirContatos();

}

}

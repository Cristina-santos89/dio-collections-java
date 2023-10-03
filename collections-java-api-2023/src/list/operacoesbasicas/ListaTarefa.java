package list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;
public class ListaTarefa {
    // atributo
    private List<Tarefa> tarefaList;

    /**
     * 
     */
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }
// Adicionar tarefas
    public void adicionarTarefa(String descricao) {
    tarefaList.add(new Tarefa(descricao));
  }
    // Renover tarefas
    public void removerTarefa(String descricao){
        List<Tarefa> TarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                TarefasParaRemover.add(t);
            }
        }
        // Excluir todas as tarefas duplicadas
        tarefaList.removeAll(TarefasParaRemover);
    }
    // Retornar o numero total de tarefas
    // size retorna o total 
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    // Retonar descrição das tarefas
    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args){
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
       
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
        
        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
        
        listaTarefa.obterDescricoesTarefas();

}

}






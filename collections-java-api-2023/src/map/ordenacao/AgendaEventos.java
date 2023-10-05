package map.ordenacao;

import java.rmi.dgc.VMID;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import org.w3c.dom.events.Event;

public class AgendaEventos {
    //Atributos

    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos(){
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        // Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximoEvento + " acontecerá na data " + proximaData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 15),"Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9),"Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 1, 10),"Evento 3", "Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 10, 4),"Evento 4", "Atração 4");
        //agendaEventos.adicionarEvento(LocalDate.of(2023, 11, 20),"Evento 5", "Atração 5");
        
        //agendaEventos.exibirAgenda();
        
        agendaEventos.obterProximoEvento();

}
    
}


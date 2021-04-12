package br.edu.fatecmm.prj_exercicio01.model;

import java.util.ArrayList;
import java.util.List;

public class Time {
    private int idTime;
    private String nomeTime;
    private List<Jogador> jogadores = new ArrayList<>();

    public int getIdTime() {
        return idTime;
    }

    public void setIdTime(int idTime) {
        this.idTime = idTime;
    }

    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public void addJogador(Jogador j){
        jogadores.add(j);
    }

    public String listaDeJogadores(){
        StringBuilder b = new StringBuilder();
        b.append("Time: "+idTime+", nome do time: "+nomeTime+".\n");
        for (Jogador jgr : jogadores) {
            b.append("Nome do jogador: ").append(jgr.getNomeJogador()).append(", número: ").append(jgr.getNumCamisa()).append(", posição: ").append(jgr.getPosicao()).append(", id: ").append(jgr.getIdJogador()).append(".\n");
        }
        return b.toString();
    }
}

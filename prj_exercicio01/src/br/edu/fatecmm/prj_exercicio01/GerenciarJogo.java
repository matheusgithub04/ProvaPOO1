package br.edu.fatecmm.prj_exercicio01;

import br.edu.fatecmm.prj_exercicio01.model.Jogador;
import br.edu.fatecmm.prj_exercicio01.model.Time;

import java.util.Scanner;

public class GerenciarJogo {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Time t = new Time();
        System.out.println("TIME:");
        System.out.print("Digite o ID do time: ");
        t.setIdTime(Integer.parseInt(read.nextLine()));
        System.out.print("Digite o nome do time: ");
        t.setNomeTime(read.nextLine());
        System.out.println();
        for(int i = 0; i < 3; i++){
            Jogador j = new Jogador();
            System.out.println("JOGADOR");
            System.out.print("Digite o ID do jogador: ");
            j.setIdJogador(Integer.parseInt(read.nextLine()));
            System.out.print("Digite o nome do jogador: ");
            j.setNomeJogador(read.nextLine());
            System.out.print("Digite a número da camisa do jogador: ");
            j.setNumCamisa(Integer.parseInt(read.nextLine()));
            System.out.print("Digite a posição do jogador: ");
            j.setPosicao(read.nextLine());
            t.addJogador(j);
            System.out.println();
        }
        System.out.println(t.listaDeJogadores());
    }
}

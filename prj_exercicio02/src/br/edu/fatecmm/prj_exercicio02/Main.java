package br.edu.fatecmm.prj_exercicio02;


import br.edu.fatecmm.prj_exercicio02.model.Carro;

public class Main {

    public static void main(String[] args) {
        Carro c1, c2, c3;
        c1 = new Carro();
        c1.setMarca("Palio 2002");
        c1.setPlaca("123");
        c1.vaga();

        c2 = new Carro();
        c2.setMarca("Up 2012");
        c2.setPlaca("241");
        c2.vaga();

        c3 = new Carro();
        c3.setMarca("bmw");
        c3.setPlaca("666");
        c3.vaga();

    }
}

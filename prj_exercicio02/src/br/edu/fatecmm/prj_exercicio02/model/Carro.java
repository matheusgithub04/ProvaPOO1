package br.edu.fatecmm.prj_exercicio02.model;

public class Carro {
    private String marca;
    private String placa;

    private static int vaga = 0;
    private static int bmw = 0;

    public Carro(){
        vaga++;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if(marca.equalsIgnoreCase("bmw")){
            bmw++;
        }
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void vaga() {
        System.out.println("Marca do carro: "+marca+", placa: "+placa+", vagas ocupadas: "+vaga+", carros de luxo: "+bmw);
    }
}

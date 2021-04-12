package br.edu.fatecmm.prj_exercicio03;

import java.util.Random;

public class Cartela {
    private int[][] matriz = new int[5][5];
    Random r = new Random();
    public void formarCartela(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(j == 0){
                    matriz[i][j] = geradorAleatorio(1, 15);
                }else if(j == 1){
                    matriz[i][j] = geradorAleatorio(16, 30);
                }else if(j == 2){
                    matriz[i][j] = geradorAleatorio(31, 45);
                }else if(j == 3){
                    matriz[i][j] = geradorAleatorio(46, 60);
                }else{
                    matriz[i][j] = geradorAleatorio(61, 75);
                }
            }
        }
    }

    private int geradorAleatorio(int x, int y){
        int numAlea = r.nextInt((y - x) + 1) + x;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(verificador(numAlea) == true){
                    numAlea = geradorAleatorio(x, y);
                }
            }
        }
        return numAlea;
    }

    private boolean verificador(int num){
        boolean ret = false;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(num == matriz[i][j]){
                    ret = true;
                }
            }
        }
        return ret;
    }

    public void imprimir(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(i == 2 && j == 2){
                    System.out.print("\t");
                }else{
                    System.out.print(matriz[i][j]+"\t");
                }
            }
            System.out.println();
        }
    }
}

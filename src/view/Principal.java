package view;

import controller.VetorNegativo;

public class Principal {
    public static void main(String[] args) {

        VetorNegativo vetorNegativo = new VetorNegativo();

        int [] vetor = {3, 9, -11, -45, 1, -2, -9};

        int resultado = vetorNegativo.buscaNegativo(vetor, vetor.length -1);

        System.out.println("Qtde. de negativos no vetor: " +resultado);
    }
}

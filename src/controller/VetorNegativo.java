package controller;

public class VetorNegativo {
    public VetorNegativo() {
        super();
    }

    public int buscaNegativo(int[] vetor, int indice) {
        if (indice == 0) {// Condição de parada: Quando 0, exibe o elemento se for negativo, no contrário exibe 0
            if (vetor[indice] < 0) {
                return 1;
            } else {
                return 0;
            }
        } else {
            // Chamada recursiva
            int totalNegativosRestantes = buscaNegativo(vetor, indice - 1);
            if (vetor[indice] < 0) { // Termo n em função do termo anterior: Quando 0, exibe o elemento se for negativo, no contrário exibe 0 e adiciona o resultado da chamada recursiva
                return 1 + totalNegativosRestantes;
            } else {
                return totalNegativosRestantes;
            }
        }
    }
}

package br.com.calculator;

public class Main {

    public static void main(String[] args) {
        MinhaClasse minhaInstancia = new MinhaClasse();

        // fazendo o teste de calcular a soma dos numeros 
        int resultadoSoma = minhaInstancia.calcularSoma(5, 7);
        System.out.println("A soma de 5 e 7 é: " + resultadoSoma);

        // fazendo o teste do metodo par
        int numeroParaVerificar = 10;
        if (minhaInstancia.verificarPar(numeroParaVerificar)) {
            System.out.println(numeroParaVerificar + " é um número par.");
        } else {
            System.out.println(numeroParaVerificar + " não é um número par.");
        }
    }
}
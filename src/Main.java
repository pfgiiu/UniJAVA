package src;

public class Main {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();


        int resultadoSoma = calculadora.somar(5, 3);
        int resultadoSubtracao = calculadora.subtrair(10, 4);

  
        System.out.println("Resultado da Soma: " + resultadoSoma);
        System.out.println("Resultado da Subtração: " + resultadoSubtracao);        
    }
}
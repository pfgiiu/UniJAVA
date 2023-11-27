public class Main {
    public static void main(String[] args) {
        Calculo calc = new Calculo();

        double areaTriangulo = calc.areaTriangulo(5, 10);
        double areaQuadrado = calc.areaQuadrado(5);

        System.out.println("Área do triângulo: " + areaTriangulo);
        System.out.println("Área do quadrado: " + areaQuadrado);
    }
}
import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double lado, area;
        System.out.println("Digite o valor do lado do quadrado: ");
        lado = entrada.nextDouble();
        area = lado * lado;
        System.out.println("A área do quadrado é: " + area);

        entrada.close();
    }
}

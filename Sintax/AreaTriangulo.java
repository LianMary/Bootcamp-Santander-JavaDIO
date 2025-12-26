import java.util.Scanner;
public class AreaTriangulo {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double altura, base, area;
        System.out.println("Digite a altura do triângulo: ");
        altura = entrada.nextDouble();
        System.out.println("Digite a base do triângulo: ");
        base =entrada.nextDouble();
        area =(base*altura)/2;
        System.out.println("A área do triângulo é: " + area);
        entrada.close();
    }
}

import java.util.Scanner;
public class Idades {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in); 
        int idade, diferenca;
        String nome;

        for(int i=0; i<=2; i++){
            System.out.println("Digite seu nome:");
            nome = entrada.nextLine();
            System.out.println("Digite sua idade:");
            idade = entrada.nextInt();
        }
        entrada.close();
    }
}

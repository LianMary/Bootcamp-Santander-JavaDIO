import java.util.Scanner;

public class SintaxBasica {
    /* Escreva um código que receba o nome e o ano de nascimento de alguém
    e imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"*/

    public static void main(String[] args){
        Scanner entra = new Scanner (System.in);

        String nome;
        int anoNascimento;

        System.out.println("Digite seu nome:");
        nome = entra.nextLine();

        System.out.println("Digite seu ano de nascimento:");
        anoNascimento = entra.nextInt();

        int idade = 2025 - anoNascimento;

        System.out.println("Olá " + nome + " você tem " + idade + " anos");
        entra.close();
    }
}

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //variavel maior armazenar o maio valor, valor que o usuario vai digitar, contatdor;
        // usuario digita o valor em relação ao maior é maior, maior = 0; esse valor e armazena na variavel
        int valormaior = 0, valor, contador = 1;



        while (contador <= 5) {
            System.out.println("Escreva um numero: ");
        valor = sc.nextInt();

        if (contador == 1 || valor > valormaior) {
            valormaior = valor;
            }
        contador = contador + 1;
        }
        System.out.println("O valor maior é:"+valormaior);
    }
}

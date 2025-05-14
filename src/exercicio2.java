import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor, contador = 0, resultado;
        int resposta = 1;

        while (resposta == 1) {
            System.out.println("Valor --> ");
            valor = sc.nextInt();
            contador = 0;
            while (contador <= 10) {
                resultado = valor * contador;
                System.out.println(valor + " x " + contador + " = " + resultado);
                contador = contador + 1;
            }
            System.out.println("digite 1 para nova tábuada ou 0 para finalizar --> ");
            resposta=sc.nextInt();
        }
    }
}

//variavel que guarda soma recebe valor 0,
// variavel que armazena subtração recebe o valor 1.

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qnt, cont = 1, resultado=1;

        System.out.print("Digite um valor do fatorial: ");
        qnt = sc.nextInt();

      while (cont <= qnt){
          resultado = resultado * cont;
          cont = cont + 1;
      }
        System.out.println("Fatorial = " + resultado);
    }
}

//exercicio de atenção

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qnt, x=1, y=1, z, contador=1;

        System.out.print("Quantos termos você quer que apareça? ");
        qnt = sc.nextInt();

        if (qnt == 1){
            System.out.print(x);
        }
        else if (qnt == 2) {
            System.out.print(x + " " + y );

        }
        else {
            System.out.print(x + " " + y + " ");
            contador = 3;
            while (contador <= qnt) {
                z = x + y;
                System.out.print(z + " ");
                x = y;
                y = z;
                contador = contador + 1;
            }
        }

    }
}

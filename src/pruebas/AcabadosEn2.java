package pruebas;

import java.util.Scanner;

public class AcabadosEn2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, contador=0;
        System.out.print("Introduce un n�mero entero: ");
        n = sc.nextInt();
        while(n>=0){
              if(n%10==2)  //Si el n�mero acaba en dos
                 contador++;       //esta variable contendr� cu�ntos n�meros acabados en 2 se han le�do.
              System.out.print("Introduce un n�mero entero: ");
              n = sc.nextInt();
    }
        System.out.println("Se han introducido " + contador + " n�meros acabados en 2");
    }
}
import java.util.Scanner;

/**
 * Ejercicio11
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double impares, pares, Cp, docena, maximo;
        impares=0; pares=0; Cp=0; docena=0; maximo=0;

        System.out.println("cantidad de numeros a ingresar");
        int numero = scanner.nextInt();
        for (int i = 0; i < numero; i++) {
            int ruleta = (int)(Math.random()*37);
            int par = ruleta % 2;
            System.out.println(ruleta+" "+par);
            if (0<ruleta) {
                if (par==0) {
                    pares +=ruleta;
                    Cp++;
                } else {
                    impares++;
                }
            }
            if ((13<=ruleta)&&(ruleta<=24)) {
                docena++;
            }
            if (maximo<ruleta) {
                maximo = ruleta;
            }
        }
        pares /= Cp;
        System.out.println("impares: "+impares+" promedio pares: "+pares+" docena: "+docena+" maximo: "+maximo);
        
    }
}
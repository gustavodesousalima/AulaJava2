package comandoscondicionais;
import java.util.Scanner;
public class MenorNumero {
    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("digite numero 1");
        float numero1 = entrada.nextFloat();

        System.out.println("digite numero 2");
        float numero2 = entrada.nextFloat();

        System.out.println("digite numero 3");
        float numero3 = entrada.nextFloat();

        if(numero1 < numero2 && numero1 < numero3){
            System.out.println("O menor numero é: " + numero1);
        }else if(numero2 < numero1 && numero2 < numero3){
            System.out.println("O menor numero é: " + numero2);
        }else if(numero3 < numero1 && numero3 < numero1) {
            System.out.println("O menor numero é: " + numero3);
        }else{
            System.out.println("Os numeros sao iguais");
        }
    }
}

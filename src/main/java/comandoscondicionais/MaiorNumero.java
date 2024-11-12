package comandoscondicionais;
import java.util.Scanner;
public class MaiorNumero {
    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("digite numero 1");
        float numero1 = entrada.nextFloat();

        System.out.println("digite numero 2");
        float numero2 = entrada.nextFloat();

        if(numero1 < numero2){
            System.out.println("O maior numero é: " + numero2);
        }else if(numero1 > numero2){
            System.out.println("O maior numero é: " + numero1);
        }else{
            System.out.println("Os números são iguais");
        }
    }
}

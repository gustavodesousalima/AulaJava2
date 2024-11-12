package comandoscondicionais;
import java.util.Scanner;
public class Numeropar {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("entre com um numero");
        float numero = entrada.nextFloat();

        if(numero % 2 == 0){
            System.out.println("O numero é par:" + numero);
        }else{
            System.out.println("O numero é impar:" + numero);
        }
    }
}

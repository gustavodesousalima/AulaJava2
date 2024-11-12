package comandoscondicionais;
import java.util.Scanner;


public class TabelaImc {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu peso");

        float peso = entrada.nextFloat();

        System.out.println("Digite sua altura");
        float altura = entrada.nextFloat();

        float calculoImc = peso / (altura * altura);

        if (calculoImc < 18.5) {
            System.out.println("Abaixo do peso");

        }else if (calculoImc >= 18.5 && calculoImc <= 24.9) {
            System.out.println("Peso Ideal");

        }else if (calculoImc >= 25 && calculoImc <= 29.9) {
            System.out.println("Levemente acima do peso");

        }else if (calculoImc >= 30 && calculoImc <= 34.9) {
            System.out.println("Obesidade grau I");

        }else if (calculoImc >= 35 && calculoImc <= 39.9) {

            System.out.println("Obesidade grau II");

        }else {

            System.out.println("Obesidade grau III");

        }
    }
}

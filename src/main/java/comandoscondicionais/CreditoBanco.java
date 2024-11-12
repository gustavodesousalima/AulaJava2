package comandoscondicionais;
import java.util.Scanner;

public class CreditoBanco {
    public static void main(String[] args) {

        Scanner salario = new Scanner(System.in);

        System.out.println("Digite o salário do mês 1");
        float salariomes1 = salario.nextFloat();

        System.out.println("Digite o salário do mês 2");
        float salariomes2 = salario.nextFloat();

        System.out.println("Digite o salário do mês 3");
        float salariomes3 = salario.nextFloat();

        System.out.println("Digite o salário do mês 4");
        float salariomes4 = salario.nextFloat();

        System.out.println("Digite o salário do mês 5");
        float salariomes5 = salario.nextFloat();

        System.out.println("Digite o salário do mês 6");
        float salariomes6 = salario.nextFloat();

        float mediasalario = (salariomes1 + salariomes2 + salariomes3 + salariomes4 + salariomes5 + salariomes6) / 6;

        float valorcredito;

        if(mediasalario <= 500){
            System.out.println("Nenhum crédito");
        }else if(mediasalario >= 501 && mediasalario <= 1000) {
            valorcredito = (mediasalario * 30) / 100;
            System.out.println("Seu crédito é de: " + valorcredito);
        }else if(mediasalario >= 1001 && mediasalario <= 3000){
            valorcredito = (mediasalario * 40) / 100;
            System.out.println("Seu crédito é de: " + valorcredito);
        }else {
            valorcredito = (mediasalario * 50) / 100;
            System.out.println("Seu crédito é de: " + valorcredito);
        }
    }
}

package comandoscondicionais;
import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {

        Scanner nota = new Scanner(System.in);

        System.out.println("Digite a nota 1");
        float nota1 = nota.nextFloat();

        System.out.println("Digite a nota 2");
        float nota2 = nota.nextFloat();

        System.out.println("Digite a nota 3");
        float nota3 = nota.nextFloat();

        System.out.println("Digite a nota 4");
        float nota4 = nota.nextFloat();

        float soma = (nota1 + nota2 + nota3 + nota4) / 4;

        if(soma >= 7){
            System.out.println("Aprovado");
        }else if(soma >= 5){
            System.out.println("Recuperação");
        }else{
            System.out.println("Reprovado");
        }
    }
}

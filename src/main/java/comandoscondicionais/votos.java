package comandoscondicionais;
import java.util.Scanner;


public class votos {
    public static void main(String[] args){

        Scanner entradavoto = new Scanner(System.in);

        System.out.println("Digite sua idade");

        int idade = entradavoto.nextInt();

        if (idade >= 18 && idade < 65){
            System.out.println("Voto obrigatório");
        }else if(idade >= 16 || idade >= 65 ){
            System.out.println("Voto opcional");
        }else{
            System.out.println("Não pode votar");
        }
    }
}

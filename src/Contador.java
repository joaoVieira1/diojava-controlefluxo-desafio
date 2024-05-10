import java.util.Scanner;

/**
 @author João Pedro da Silva Vieira
 @since 09/05/2024
 @version 1.0
 */
public class Contador {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Número um: ");
        int numero1 = leitor.nextInt();

        System.out.print("Número dois: ");
        int numero2 = leitor.nextInt();

        try{
            contador(numero1, numero2);
        }catch(ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
        }


    }


    /**
     @param numero1 inicio do intervalo.
     @param numero2 final do intervalo.
     @return não há um return, porém, é impresso uma contagem com a quantidade determinada pelo intervalo dos parâmetros.
     */
    public static void contador(int numero1, int numero2) throws ParametrosInvalidosException{

        if(numero1 > numero2){
            throw new ParametrosInvalidosException();
        }

        int iteracoes = numero2 - numero1;

        for(int i = 1; i <= iteracoes; i++){
            System.out.println("Imprimindo o número: " + i);
        }

    }


}

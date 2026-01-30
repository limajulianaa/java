import java.util.Scanner;

public class Idade {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Olá! Vamos calcular a sua idade em dias?");


        System.out.println("Primeiro, quantos anos você tem?");
        int anos = scan.nextInt();

        System.out.println("E quantos meses?");
        int meses = scan.nextInt();

        System.out.println("Por último, quantos dias?");
        int dias = scan.nextInt();


        int resultado = anos * 365 + meses * 30 + dias ;

        System.out.println("Sua idade em dias é " + resultado);

        scan.close();
    }
}

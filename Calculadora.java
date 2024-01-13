import java.util.Scanner;
public class Calculadora
{
    public static void main(String[] args) {
        int n1,n2,soma,mult,subt,div;
        Scanner teclado=new Scanner (System.in);
        //Entrada
        System.out.println("Digite um numero: ");
        n1=teclado.nextInt();
        System.out.println("Digite outro numero: ");
        n2=teclado.nextInt();
        //Processamento
        soma=n1+n2;
        mult=n1*n2;
        subt=n1-n2;
        div=n1/n2;
        System.out.println("A soma é "+soma);
        System.out.println("A subtração é "+subt);
        System.out.println("A multiplicação é "+mult);
        System.out.println("A divisão é "+div);                                                                                                           
    }
}

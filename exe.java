import java.util.Scanner;
public class exe{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        float soma, sub, mult, divi, n1, n2;

        System.out.print("Insira o primeiro número: ");
        n1 = leia.nextFloat();

        System.out.print("Insira o segundo número: ");
        n2 = leia.nextFloat();

        soma = n1+n2;
        sub = n1-n2;
        mult = n1*n2;
        divi = n1/n2;

        System.out.print("Soma: " + soma);
        System.out.print("Subtração: " + sub);
        System.out.print("Multiplicação: " + mult);
        if( n2 == 0){
            System.out.print("Divisão: " + divi);
        }else {
            System.out.print("Não é possível dividir por zero");
        }
    }
}
package calculadora_cli;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Calculadora_CLI {

    public static void main(String[] args) {
        //Instância dos objetos
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");

        //Declaração de variáveis
        double valor1;
        double valor2;
        char operacao;
        double resultado;

        //Finalidade do programa
        System.out.println("===================================================");
        System.out.println("Calculadora que realiza as quatro operações básicas:");
        System.out.println("Soma (+)");
        System.out.println("Subtração (-)");
        System.out.println("Divisão (/)");
        System.out.println("Multiplicação (*)");
        System.out.println("===================================================");

        //Entrada de dados
        System.out.print("Entre com o primeiro valor: ");
        valor1 = entrada.nextDouble();
        System.out.println("===================================================");
        System.out.print("Entre com a operação (+,-,/,*)");
        operacao = entrada.next().charAt(0);
        System.out.println("===================================================");
        System.out.print("Entre com o segundo valor: ");
        valor2 = entrada.nextDouble();
        System.out.println("===================================================");

        //Processamento
        switch (operacao) {
            case '+':
                resultado = valor1 + valor2;
                System.out.println(df.format(resultado));
                System.out.println("===================================================");
                break;

            case '-':
                resultado = valor1 - valor2;
                System.out.println(df.format(resultado));
                System.out.println("===================================================");
                break;
                
            case '*':
                resultado = valor1 * valor2;
                System.out.println(df.format(resultado));
                System.out.println("===================================================");
                break;
                
            case '/':
                if (valor2 == 0){
                System.out.println("Impossível dividir por zero!");
                System.out.println("===================================================");
            } else {
                    resultado = valor1 / valor2;
                    System.out.println(df.format(resultado));
                    System.out.println("===================================================");
                }
                break;
            
            default:
                System.out.println("Operação inválida, tente novamente!");
                System.out.println("===================================================");
                break;
        }
    }
}

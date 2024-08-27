import java.util.Scanner;

public class ExemploCondicao2 {

    // Quero adicionar um desconto gradativo
    // Valor Maior que 1000 - 10%
    // Valor Maior que 2000 - 20%
    // Valor Maior igual que 3000 - 30%
    // Valor Menor igual a 1000 - 0%

    public static void main(String[] args) {

        double ValorBruto = 3000;
        double desconto = 0d;

        //Operadores Logicos
        // && e
        // || ou

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor Bruto : ");
        ValorBruto = scanner.nextDouble();

        if (ValorBruto > 1000 && ValorBruto <= 2000) {
            desconto = ValorBruto * 0.10;
        } else if (ValorBruto > 2000 && ValorBruto < 3000) {
            desconto = ValorBruto * (20 / 100);
        } else if (ValorBruto >= 3000) {
            desconto = ValorBruto * (30. / 100);
        }
            System.out.println("Valor Bruto é " + ValorBruto);
            System.out.println("Valor do Desconto é " + desconto);
            System.out.println("Valor Liquido é :" + (ValorBruto - desconto));
        }
    }



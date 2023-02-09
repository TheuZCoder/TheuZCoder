package CalculadoraDeDesconto;

import java.util.Scanner;

public class CalcDesconto {

    public void calcular(){
        try (Scanner Ler = new Scanner(System.in)) {
            double precoProduto,percentualDesconto,desconto,precoComDesconto;
            System.out.println("Qual o preço do seu produto ?: ");
            precoProduto = Ler.nextDouble();
            System.out.println("O preço do produto é de " + precoProduto + " reais");
            System.out.println("Qual é a % da promoção?: ");
            percentualDesconto = Ler.nextDouble();
            System.out.println("o desconto será de " + percentualDesconto + "%");
            desconto = precoProduto * percentualDesconto / 100;
            precoComDesconto = precoProduto - desconto;
            System.out.println("Com desconto, o produto sai " + precoComDesconto + "R$" + " sem o desconto o produto ficara por " + precoProduto + "R$");





        }
    }
}

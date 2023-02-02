package CalcularVelocidadeMedia;
import  java.util.Scanner;
public class CalcularVelocidadeMedia {

    public static void main(String[] args) {
        Scanner ler =  new Scanner(System.in);
        int a,b;
        System.out.println("======Calcular Velocidade Média===========");
        System.out.println("informe a distancia: ");
        a = ler.nextInt();
        System.out.println("A distancia percorrida foi de " + a + "Km.");
        System.out.println("Informe Tempo gasto: ");
        b = ler.nextInt();
        System.out.println("O tempo gasto foi de " + b + "horas");
        double velocidadeMedia = a / b;
        System.out.println("Para encontrar a velocidade média " + "dividimos a distância (" + a + ") pelo tempo gasto no " + "percurso (" + b + ")."); 
        System.out.println("A velocidade média é de " + velocidadeMedia + "Km/h"); 
    }
}


    
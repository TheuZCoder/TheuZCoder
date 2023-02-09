package CustoViagem;
import java.util.Scanner;
public class CustoViagem {
    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            double distanciaPercorrida,preçoDaGasolina,KMporLitro,custoViagem;  //utilizar sempre o double para usar numeros quebrados no codigo sem dar crash em vez do int
                System.out.println("=============Calculador de preços de viagem===========");
                System.out.println("Qual a distancia percorrida?: ");
                distanciaPercorrida = ler.nextDouble();
                System.out.println("Qual o preço da gasolina?: ");
                preçoDaGasolina = ler.nextDouble();
                System.out.println("Quantos KM por litro faz seu carro?: ");
                KMporLitro = ler.nextDouble();
                custoViagem = distanciaPercorrida / KMporLitro * preçoDaGasolina;
        
       System.out.println("O custo da sua viagem foi de %2.f %n" + custoViagem + " Reais" );
        System.out.println("=================Programa finalizado===============");
        }
    }
}

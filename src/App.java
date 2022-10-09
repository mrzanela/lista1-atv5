import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Faça um Programa que converta metros para centímetros
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a metragem para conversão em centímetros: ");
        double metros = sc.nextDouble();
        sc.close();
        double conv = metros*100;
        System.out.println("O valor em cm é de "+conv+"cm");
    }
}

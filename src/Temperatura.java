import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma temperatura em graus Fahrenheit ");
        double Fah = sc.nextDouble();

        double Graus = 5 * ((Fah-32) / 9);
        System.out.println(Graus + "°C");

        sc.close();

    }
}

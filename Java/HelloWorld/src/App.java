import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite o número que deseja a tabuada:");
        int number = scanner.nextInt();
        for (var i = 1; i <= 10; i++) {
            System.out.printf("%s x %s = %s \n", i, number, i * number);

        }

        double altura, peso;
        System.out.println("Digite sua altura:");
        altura = scanner.nextDouble();
        System.out.println("Digite seu peso:");
        peso = scanner.nextDouble();
        double imc = peso / (altura * altura);
        String message = "";
        if (imc <= 18.5) {
            message = "Abaixo do peso";
        }
        if (imc >= 18.6 && imc <= 24.9) {
            message = "Peso ideal";
        }
        if (imc >= 25.0 && imc <= 29.9) {
            message = "Levemente acima do peso";
        }
        System.out.println(message);

    }
}

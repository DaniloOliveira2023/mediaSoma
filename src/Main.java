import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        int numero3;
        int numero4;
        int numero5;
        int numero6;
        double media1;
        double media2;
        double somaMedias;
        double mediaMedias;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        numero1 = s.nextInt();
        System.out.println("Digite o segundo número");
        numero2 = s.nextInt();
        System.out.println("Digite o terceiro número");
        numero3 = s.nextInt();
        media1 = (numero1 + numero2 + numero3) / 3;
        System.out.println("A média é " +media1);

        System.out.println("Digite o quarto número");
        numero4 = s.nextInt();
        System.out.println("Digite o quinto número");
        numero5 = s.nextInt();
        System.out.println("Digite o sexto número");
        numero6 = s.nextInt();
        media2 = (numero4 + numero5 + numero6) / 3;
        System.out.println("A média é " +media2);

        somaMedias = media1 + media2;
        System.out.println("A soma das médias é " +somaMedias);

        mediaMedias = (media1 + media2) / 2;
        System.out.println("A média das médias é " +mediaMedias);
    }
}
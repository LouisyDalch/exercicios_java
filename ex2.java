import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        double celsius;
        double fahrenheit;
        Scanner input = new Scanner(System.in);

        System.out.println("Entre com um valor de graus Celsios");
        celsius = input.nextDouble();
        fahrenheit = (celsius*9/5) + 32;

        System.out.println(celsius + " graus Celsius são " + fahrenheit + " graus Fahrenheit");
        input.close();
    }
}

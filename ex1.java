import java.util.Locale;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        System.out.println("Digite quantidade e preço respectivamente");

        int quant = scan.nextInt();
        double preco = scan.nextDouble();
        double total = quant*preco;
        
        System.out.println("Quantidade: " + quant);
        System.out.println("Preço: " + preco);
        System.out.println("Total: " + total); 
        scan.close();    
    }
}

import java.util.Locale;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        double[] precos = new double[3];
        double[] subts = new double[3];
        int[] quants = new int[3];
        double total = 0;
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Escreva o preço unitário do item 1, 2 e 3 respectivamente: ");
        for(int i =0;i<3;i++){
            precos[i] = input.nextDouble();
        }
        System.out.print("Escreva a quantidade do item 1, 2 e 3 respectivamente: ");
        for(int i =0;i<3;i++){
            quants[i] = input.nextInt();
        }
        for(int i = 0;i<3;i++){
            subts[i] = quants[i]*precos[i];
        }
        for(int i = 0;i<3;i++){
            total += subts[i];
        }

        System.out.println("Item\t Qtde\t Unit\t Subtotal");
        System.out.printf("1\t\t%d\t\t%.2f\t\t%.2f\n", quants[0],precos[0],subts[0]);
        System.out.printf("2\t\t%d\t\t%.2f\t\t%.2f\n", quants[1],precos[1],subts[1]);
        System.out.printf("3\t\t%d\t\t%.2f\t\t%.2f\n", quants[2],precos[2],subts[2]);
        System.out.println("------------------------------------");
        System.out.printf("Total:\t\t\t %.2f",total);

        input.close();
    }
}

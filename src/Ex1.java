import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) throws Exception {
        String nome,cargo,fone;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        nome = input.nextLine();
        System.out.print("Digite seu cargo: ");
        cargo = input.nextLine();
        System.out.print("Digite seu telefone: ");
        fone = input.nextLine();

        System.out.println("+-----------------------+");
        System.out.println("| Nome:\t"+nome+"\t\t|");
        System.out.println("| Cargo: "+cargo+"\t|");
        System.out.println("| Fone:\t"+fone+"\t|");
        System.out.println("+-----------------------+");
        System.out.print("\"Prazer em Conhecer\"");

        input.close();

        
    }
}

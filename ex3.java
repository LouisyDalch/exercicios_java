public class ex3 {
    public static void main(String[] args) {
        double preco = 30.00;
        double desconto = 0.15;

        double total = preco *(1-desconto);
        
        System.out.println("Preço original: " + preco);
        System.out.println("Desconto: " + desconto);
        System.out.println("Preço final: " + total);
    }
}

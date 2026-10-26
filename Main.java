import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("========== CADASTRO DE PRODUTO ==========");

        Scanner leitor = new Scanner(System.in);

        Estoque produto1 = new Estoque();

        System.out.println("\nPRODUTO 1");

        System.out.print("Digite o nome do produto: ");
        produto1.nome = leitor.nextLine();

        System.out.print("Digite o valor unitário: R$");
        produto1.preco = leitor.nextDouble();

        System.out.print("Digite a quantidade: ");
        produto1.estoque = leitor.nextInt();


        leitor.nextLine();


        Estoque produto2 = new Estoque();

        System.out.println("\nPRODUTO 2");

        System.out.print("Digite o nome do produto: ");
        produto2.nome = leitor.nextLine();

        System.out.print("Digite o valor unitário: R$");
        produto2.preco = leitor.nextDouble();

        System.out.print("Digite a quantidade: ");
        produto2.estoque = leitor.nextInt();
        

        System.out.println("\n========== MOVIMENTAÇÃO E ESTOQUE ==========");

        System.out.println("\nProduto: " + produto1.nome);
        System.out.println("Quantas unidades deseja adicionar?");
        System.out.print("Digite: ");
        int qtdDigitada = leitor.nextInt();
        System.out.println("");
        produto1.adicionarEstoque(qtdDigitada);

        System.out.println("----------------------------------------------");

        System.out.println("\nProduto: " + produto2.nome);
        System.out.println("Quantas unidades deseja retirar?");
        System.out.print("Digite: ");
        int qtdDigitada2 = leitor.nextInt();
        System.out.println("");
        produto2.reduzirEstoque(qtdDigitada2);

        System.out.println("\n=========== SIMULAÇÃO DE DESCONTO ==========");

        System.out.print("\nPercentual de desconto para " + produto1.nome + ": ");
        double percentual = leitor.nextDouble();

        leitor.close();


        System.out.println("\n============== RESULTADO FINAL =============");

        System.out.println("");

        produto1.exibirProdutos();
        System.out.printf("Valor total em estoque: R$ %.2f%n" + produto1.valorEstoque());

        double precoComDesconto =  produto1.precoDesconto(percentual);
        System.out.printf("Preço com desconto: R$ %.2f%n", precoComDesconto);

        System.out.println("");

        produto2.exibirProdutos();
        System.out.printf("Valor total em estoque: R$ %.2f%n", produto2.valorEstoque());

        System.out.println("\n============================================");
    }
}
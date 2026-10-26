public class Estoque {
    String nome;
    double preco;
    int estoque;

    void exibirProdutos() {
        System.out.println("Produto: " + nome);
        System.out.printf("Preço unitário: R$  %.2f%n" + preco);
        System.out.println("Quantidade atual: " + estoque);
        // if (desconto != 0) {

        //     double valorDesconto = preco * (desconto / 100);
        //     double precoFinal = preco - valorDesconto;
        //     valorTotal = precoFinal * estoque;

        //     System.out.println("Valor total em estoque: R$" + valorTotal);
        //     System.out.println("Preço com desconto: R$" + precoFinal);
        // } else {

        //     // valorTotal = preco * estoque;
        //     System.out.println("Valor total em estoque: R$" + valorTotal);

        // }
    }

    double valorEstoque() {
        double valorTotal = estoque * preco;
        return valorTotal;
    }

    double precoDesconto (double desconto) {
        
        double valorDesconto = preco * (desconto / 100);
        double precoFinal = preco - valorDesconto;
        return precoFinal;

    }

    void adicionarEstoque(int quantidade) {
        if (quantidade <= 0) {

            System.out.println("Erro, Operação negada por números inválidos.");

        }else if (quantidade > estoque){

            System.out.println("Error, estoque insuficiente. Disponível: " + estoque);

        } else {

            System.out.println("Operação bem sucedida, estoque adicionado.");
            estoque = estoque + quantidade;

        }
    }

    void reduzirEstoque(int quantidade) {
        if (estoque <= 0) {

            System.out.println("Error, estoque vazio.");

        } else if (quantidade <= 0) {

            System.out.println("Error, Operação negada por números inválidos.");

        } else {

            System.out.println("Operação bem sucessedida, estoque retirado.");
            estoque = estoque - quantidade;

        }
    }
}

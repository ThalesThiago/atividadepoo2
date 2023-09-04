import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CadastroProdutos cadastro = new CadastroProdutos();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Adicionar um Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("3. Buscar Produto por ID");
            System.out.println("4. Atualizar Produto por ID");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int escolha = scanner.nextInt();
            scanner.nextLine(); // Limpar a quebra de linha

            switch (escolha) {
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o preço do produto: ");
                    double preco = scanner.nextDouble();
                    Produto novoProduto = new Produto(nome, preco);
                    cadastro.adicionarProduto(novoProduto);
                    System.out.println("Produto adicionado com sucesso!");
                    break;

                case 2:
                    cadastro.listarProdutos();
                    break;

                case 3:
                    System.out.print("Digite o ID do produto: ");
                    int idBusca = scanner.nextInt();
                    Produto produtoBuscado = cadastro.buscarProduto(idBusca);
                    if (produtoBuscado != null) {
                        produtoBuscado.mostrarDetalhes();
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Digite o ID do produto a ser atualizado: ");
                    int idAtualizacao = scanner.nextInt();
                    scanner.nextLine(); // Limpar a quebra de linha
                    System.out.print("Digite o novo nome do produto: ");
                    String novoNome = scanner.nextLine();
                    System.out.print("Digite o novo preço do produto: ");
                    double novoPreco = scanner.nextDouble();
                    boolean sucessoAtualizacao = cadastro.atualizarProduto(idAtualizacao, novoNome, novoPreco);
                    if (sucessoAtualizacao) {
                        System.out.println("Produto atualizado com sucesso!");
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 5:
                    System.out.println("Saindo do programa. Obrigado!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
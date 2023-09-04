import java.util.ArrayList;

public class CadastroProdutos {
    private ArrayList<Produto> produtos;

    public CadastroProdutos() {
        produtos = new ArrayList<>();
    }


    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }


    public void listarProdutos() {
        for (Produto produto : produtos) {
            produto.mostrarDetalhes();
            System.out.println();
        }
    }


    public Produto buscarProduto(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }


    public boolean atualizarProduto(int id, String novoNome, double novoPreco) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                produto.setNome(novoNome);
                produto.setPreco(novoPreco);
                return true;
            }
        }
        return false;
    }
}
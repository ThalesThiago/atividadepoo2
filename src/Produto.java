public class Produto {
    private static int proximoId = 1;
    private int id;
    private String nome;
    private double preco;


    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        atualizarProximoId(id);
    }


    public Produto(String nome, double preco) {
        this.id = gerarIdAutomatico();
        this.nome = nome;
        this.preco = preco;
    }


    public void mostrarDetalhes() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
    }


    private int gerarIdAutomatico() {
        int novoId = proximoId;
        atualizarProximoId(novoId);
        return novoId;
    }


    private static void atualizarProximoId(int novoId) {
        proximoId = Math.max(novoId + 1, proximoId);
    }

    // Getters e setters
    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }
}
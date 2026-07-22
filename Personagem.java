public class Personagem {

    // Nome do personagem
    String nome;

    // Classe ou profissão do personagem (Guerreiro, Mago, Arqueiro, etc.)
    String classe;

    // Nível atual do personagem
    int nivel;

    // Quantidade de pontos de vida (HP) do personagem
    int pontosDeVida;

    // Poder base utilizado para cálculos de ataque ou habilidades
    double poderBase;

    // Construtor da classe Personagem
    // Inicializa os atributos com os valores recebidos
    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;
    }

    // Método que exibe as informações do personagem no console
    public void exibirStatus() {
        System.out.println("--- Status do Personagem ---");
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Nível: " + nivel);
        System.out.println("Pontos de Vida: " + pontosDeVida);
        System.out.println("Poder Base: " + poderBase);
    }
}


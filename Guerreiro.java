// Classe Guerreiro representa um tipo específico de Personagem no jogo.
// Ela herda (estende) as características e comportamentos da classe Personagem.
public class Guerreiro extends Personagem {
    // Atributo específico do Guerreiro para calcular ou armazenar sua força física
    double forca;

    // Construtor da classe Guerreiro.
    public Guerreiro(String nome, int nivel, int pontosDeVida, double poderBase, double forca) {
        // Chama o construtor da classe pai (Personagem) repassando os parâmetros
        // O valor "Guerreiro" é passado fixo para definir a classe/categoria
        super(nome, "Guerreiro", nivel, pontosDeVida, poderBase);
        
        // Inicializa o atributo específico desta classe
        this.forca = forca;
    }

    // Sobrescreve (@Override) o método da classe pai (Personagem)
    // para exibir o Status do Guerreiro.
    @Override
    public void exibirStatus() {
        super.exibirStatus();
        System.out.println("Força: " + forca);
    }

    // Sobrescreve (@Override) o método da classe pai (Personagem)
    // para definir a habilidade especial exclusiva do Guerreiro.
    @Override
    public void usarHabilidadeEspecial() {
        System.out.println("Guerreiro " + nome + " ataca com Espada Flamejante!");
    }
}
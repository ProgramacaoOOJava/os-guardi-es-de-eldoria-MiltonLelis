// Classe Mago representa uma especialização de Personagem focada em magia.
// Ela herda (estende) as características e comportamentos da classe Personagem.
public class Mago extends Personagem {
    // Atributo específico do Mago para armazenar seu nível de inteligência/poder mágico
    double inteligencia;

    // Construtor da classe Mago.
    public Mago(String nome, int nivel, int pontosDeVida, double poderBase, double inteligencia) {
        // Chama o construtor da classe pai (Personagem), enviando os dados gerais
        // e definindo o tipo/classe fixo como "Mago"
        super(nome, "Mago", nivel, pontosDeVida, poderBase);
        
        // Inicializa o atributo específico de inteligência desta classe
        this.inteligencia = inteligencia;
    }

    // Sobrescreve (@Override) o método da classe pai (Personagem)
    // para exibir o Status do Guerreiro.
    @Override
    public void exibirStatus() {
        super.exibirStatus();
        System.out.println("Inteligência: " + inteligencia);
    }

    // Sobrescreve (@Override) o método da classe pai (Personagem)
    // para definir a habilidade especial exatada do Mago.
    @Override
    public void usarHabilidadeEspecial() {
        System.out.println("Mago " + nome + " lança Bola de Fogo!");
    }
}
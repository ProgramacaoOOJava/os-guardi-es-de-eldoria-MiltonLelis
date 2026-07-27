public class Guerreiro extends Personagem {
    double forca;

    public Guerreiro(String nome, int nivel, int pontosDeVida, double poderBase, double forca) {
        super(nome, "Guerreiro", nivel, pontosDeVida, poderBase);
        this.forca = forca;
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println("Guerreiro " + nome + " ataca com Espada Flamejante!");
    }
}
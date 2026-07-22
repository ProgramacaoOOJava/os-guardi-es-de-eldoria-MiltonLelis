public class Main {

    // Método principal, ponto de entrada da aplicação
    public static void main(String[] args) {

        // Cria o primeiro personagem com seus atributos iniciais
        Personagem heroi1 = new Personagem("Arthus", "Guerreiro", 1, 100, 10.5);
        
        // Altera o diretamente o atributos de heroi1
        heroi1.nivel = 2;
        heroi1.pontosDeVida = 95;

        // Cria o segundo personagem com seus atributos iniciais
        Personagem heroi2 = new Personagem("Artermis", "Arqueira", 1, 80, 12.2);

        // Altera o diretamente atributos de heroi2
        heroi1.nivel = 2;
        heroi2.pontosDeVida = 85;

        // Exibe os dados do primeiro personagem no console
        heroi1.exibirStatus();

        // Exibe os dados do segundo personagem no console
        heroi2.exibirStatus();
    }
}

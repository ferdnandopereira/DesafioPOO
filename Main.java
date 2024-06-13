public class Main {
    public static void main(String[] args){
        // Reprodutor Musical
        ReprodutorMusical meuReprodutor = new MeuReprodutorMusical();
        meuReprodutor.selecionarMusica("Música favorita.");
        meuReprodutor.tocar();
        meuReprodutor.pausar();
        // Aparelho Telefônico
        AparelhoTelefonico meuTelefone = new MeuAparelhoTelefonico();
        meuTelefone.ligar("21936184246");
        meuTelefone.atender();
        meuTelefone.iniciarCorreioVoz();
        // Navegador Internet
        NavegadorInternet meuNavegador = new MeuNavegadorInternet();
        meuNavegador.exibirPagina("https://dio.me");
        meuNavegador.adicionarNovaAba();
        meuNavegador.atualizarPagina();
    }
}

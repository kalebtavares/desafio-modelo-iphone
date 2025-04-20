public class IPhone implements reprodutorMusical, aparelhoTelefonico, navegadorInternet {

    // Métodos do ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("ReprodutorMusical: Tocando música.");
    }

    @Override
    public void pausar() {
        System.out.println("ReprodutorMusical: Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("ReprodutorMusical: Selecionando a música: " + musica);
    }

    // Métodos do AparelhoTelefonico
    @Override
    public void ligar() {
        System.out.println("AparelhoTelefonico: Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("AparelhoTelefonico: Atendendo a chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("AparelhoTelefonico: Iniciando correio de voz...");
    }

    // Métodos do NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("NavegadorInternet: Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("NavegadorInternet: Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("NavegadorInternet: Atualizando página...");
    }

    // Método principal para testar as implementações
    public static void main(String[] args) {
        IPhone iphone = new IPhone();

        // Testando funcionalidades do Reprodutor Musical
        iphone.selecionarMusica("Minha Música Favorita");
        iphone.tocar();
        iphone.pausar();

        // Testando funcionalidades do Aparelho Telefônico
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Testando funcionalidades do Navegador na Internet
        iphone.exibirPagina("https://www.exemplo.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}

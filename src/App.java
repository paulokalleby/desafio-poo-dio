import iphone.IPhone;

public class App {
    public static void main(String[] args) throws Exception {

        IPhone reprodutor = new IPhone();

        reprodutor.selecionarMusica("Deus e eu no sertão");
        reprodutor.tocar();
        reprodutor.pausar();

        IPhone telefone = new IPhone();

        telefone.ligar("63 99209-9519");
        telefone.atender();
        telefone.iniciarCorreioVoz();

        IPhone navegador = new IPhone();

        navegador.adicionarNovaAba();
        navegador.exibirPagina("https://web.dio.me");
        navegador.atualizarPagina();

    }
}

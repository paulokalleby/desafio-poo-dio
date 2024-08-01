package iphone;

import iphone.aplicativos.AparelhoTelefonico;
import iphone.aplicativos.NavegadorInternet;
import iphone.aplicativos.ReprodutorMusical;

public class IPhone implements NavegadorInternet, AparelhoTelefonico, ReprodutorMusical {

    @Override
    public void tocar() {
        System.out.println("TOCANDO MUSICA");
    }

    @Override
    public void pausar() {
        System.out.println("MUSICA PAUSADA");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("SELECIONANDO A MUSICA "+musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("LIGANDO PARA O NUMERO "+numero);
    }

    @Override
    public void atender() {
        System.out.println("ATENDENO LIGAÇÃO");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("EXIBINDO PAGINA "+url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ABRINDO NOVA ABA");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PAGINA");
    }
    
}

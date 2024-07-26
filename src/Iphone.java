import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusical;

public class Iphone {
    public static void main(String[] args) {
        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
        NavegadorInternet navegadorInternet = new NavegadorInternet();

        aparelhoTelefonico.ligar();
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz("Voz");
        aparelhoTelefonico.desligar();

        reprodutorMusical.iniciar();

        navegadorInternet.exibirPagina("http://pagina.com");
        navegadorInternet.adicionarNovaAba("Nova aba");
        navegadorInternet.atualizarPagina();
    }

}

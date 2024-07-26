```mermaid
    classDiagram
    
    class ReprodutorMusical {
    -tocar()
    -pausar()
    -selecionarMusica(String musica)
    +iniciar()
    }

    class AparelhoTelefonico {
        +ligar()
        +atender()
        +desligar()
        +inciarCorreioVoz(String voz)
    }

    class NavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba(String aba)
        +atualizarPagina()
    }

    class iPhone {
        aparelhoTelefonico.ligar();
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz("Voz");
        aparelhoTelefonico.desligar();

        reprodutorMusical.iniciar();

        navegadorInternet.exibirPagina("http://pagina.com");
        navegadorInternet.adicionarNovaAba("Nova aba");
        navegadorInternet.atualizarPagina();
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet


package funcionalidades;

public class ReprodutorMusical {
    public void iniciar(){
        tocar();
        pausar();
        selecionarMusica("musica");
    }
    private void tocar(){
            System.out.println("A música está tocando!");
    }
    private void selecionarMusica(String musica){
            System.out.println("Musica: " + musica);
    }
    private void pausar(){
            System.out.println("Reprodutor pausado!");
    }

}

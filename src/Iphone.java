public class Iphone {
    public static void main(String[] args) {
        String nome = "Exato";
        int numero = 301;
        int tamahoNumero = nome.length();

        int resto = (numero - 1) % tamahoNumero;
        char letra = nome.charAt(resto);
        System.out.println(letra);
    }

}

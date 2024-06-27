import celular.Iphone;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Iphone iphone = new Iphone();

        iphone.ligar("99999999");
        iphone.atender();
        iphone.iniciarCorreioVoz();;
        iphone.exibirPagina("www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("T.N.T");
    }
}
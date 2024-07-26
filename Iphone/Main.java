public class Main {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();

    //reprodutor musical

    iphone.selecionarMusica("SoundTrack 2 My Life - kidCudi");
    iphone.tocar();
    iphone.pausar();
    
    //navegador internet

    iphone.exibirPagina("https://dio.me");
    iphone.atualizarPagina();
    iphone.adicionarNovaAba();
    
    //Chamadas telefonica

    iphone.ligar("(85) 9999 9999");
    iphone.atender();
    iphone.iniciarCorreioVoz();



    }
}
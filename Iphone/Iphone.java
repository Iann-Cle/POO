public class Iphone implements NavegadorInternet, ReprodutorMusica, AparelhoTelefonico {
    private string musicaAtual;
    private string urlPagina;
    private string numeroTelefone;

    public void ligar(string numero){
        this.numeroTelefone = numero;
        system.out.println("Ligando para  " + numeroTelefone);
    }
    
    public void antender(){
        system.out.println("Antendendo ao telefonema");
    }
    
    public void iniciarCorreioVoz(){
    system.out.println("Iniciando o correio de voz");
    }

    public void exibirPagina(string url){
        this.urlPagina = url;
        system.out.println("Pagina atual" + urlPagina );
    }

    public void adicionarNovaAba(){
        system.out.println("Adicionando mais uma pagina");
    }

    public void atualizarPagina(){
        system.out.println("Pagina atualizada");
    }
    
    public void tocar(){
        if(musicaAtual != null){
            system.out.println("Musica tocando" + musicaAtual);
        } else {
            system.out.println("Nenhuma musica selecionada");
        }

    }
    
    public void pausar(){
        if(musicaAtual != null){
            system.out.println("Musica pausada" + musicaAtual);
        } else{
            system.out.println("Nenhuma musica selecionada.");
        }
     } 

    public void selecionarMusica(string musica){
        this.musicaAtual = musica;
        system.out.println("Musica atual" + musicaAtual);
    }

}

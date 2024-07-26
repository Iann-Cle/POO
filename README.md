#### Contexto
O desafio era colacar em prática a concepção da POO e tambem a UMl. Usando como um parametro o video abaixo, onde mostra o lançamento do iphone no ano de 2007, fariamos o iphone e suas funcionalidades como: Reprodutor de musicas, aparelho de ligação e tambem a navegação na internet, tudo isso utilizando uma ferramenta de UML e depois em arquivos java.

[Lançamento iPhone 2007](https://www.youtube.com/watch?v=9ou608QQRq8)
- Minutos relevantes: 00:15 até 00:55

#### Funcionalidades a Modelar
1. **Reprodutor Musical**
   - Métodos: `tocar()`, `pausar()`, `selecionarMusica(String musica)`
2. **Aparelho Telefônico**
   - Métodos: `ligar(String numero)`, `atender()`, `iniciarCorreioVoz()`
3. **Navegador na Internet**
   - Métodos: `exibirPagina(String url)`, `adicionarNovaAba()`, `atualizarPagina()`


### Diagrama de Classe
```mermaid
classDiagram
    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        +iniciarCorreioVoz()
        +atender()
        +ligar(String numero)
    }

    class NavegadorInternet {
        +adicionraNovaAba()
        +atualizarPagina()
        +exibirPagina(String url)
    }

    class iPhone {
        -numeroAtual: String
        -urlPagina: String
        -numeroLigaca: String
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet

# [DIO](www.dio.me) - Trilha Java Básico

## Autor
- [Paulo Kalleby](https://github.com/paulokalleby)

## POO - Desafio

Neste projeto, consta tanto a implementação das classes e interfaces Java, quanto a modelagem UML do desafio.


### Diagrama UML (Mermaid)
```mermaid
classDiagram
    interface ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(musica: String)
    }

    interface AparelhoTelefonico {
        +ligar(numero: String)
        +atender()
        +iniciarCorreioVoz()
    }

    interface NavegadorInternet {
        +exibirPagina(url: String)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class iPhone {
        +tocar()
        +pausar()
        +selecionarMusica(musica: String)
        +ligar(numero: String)
        +atender()
        +iniciarCorreioVoz()
        +exibirPagina(url: String)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    iPhone --|> ReprodutorMusical : implements
    iPhone --|> AparelhoTelefonico : implements
    iPhone --|> NavegadorInternet : implements
```

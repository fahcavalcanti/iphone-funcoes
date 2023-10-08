# Projeto Iphone - Desafio POO pela Digital Innovation One (DIO)

Este projeto representa um modelo simplificado de um iPhone, com funcionalidades de Reprodutor Musical, Aparelho Telefônico e Navegador na Internet, implementadas em Java.

## Estrutura do Projeto

O projeto consiste em um único arquivo Java chamado `Iphone.java` que contém todas as classes e interfaces relacionadas ao iPhone.

- `Iphone.java`: Contém a classe `Iphone` que implementa as interfaces `ReprodutorMusical`, `AparelhoTelefonico` e `NavegadorInternet`. Também inclui implementações internas das interfaces.

## Funcionalidades

### Reprodutor Musical

- `tocar()`: Inicia a reprodução da música selecionada.
- `pausar()`: Pausa a reprodução da música.
- `selecionarMusica(String musica)`: Seleciona uma música para reprodução.

### Aparelho Telefônico

- `ligar(String numero)`: Inicia uma chamada para o número especificado.
- `atenderChamada()`: Atende uma chamada recebida.
- `iniciarConversaVoz()`: Inicia uma conversa por voz durante uma chamada.

### Navegador na Internet

- `exibirPagina(String url)`: Exibe uma página da internet com a URL especificada.
- `adicionarNovaAba()`: Adiciona uma nova aba ao navegador.
- `atualizarPagina()`: Atualiza a página atual no navegador.

## Como Usar

1. Certifique-se de que você tem o Java instalado em seu sistema.
2. Clone este repositório em seu computador.
3. Navegue até o diretório onde o arquivo `Iphone.java` está localizado.
4. Compile o código usando `javac Iphone.java`.
5. Execute o programa com `java Iphone`.

## Exemplo de Uso

Você pode usar o código fornecido no método `main` do arquivo `Iphone.java` para demonstrar o uso das funcionalidades do iPhone.

## Licença

Este projeto está licenciado sob a MIT License.
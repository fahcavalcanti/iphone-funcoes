package diagramacao;

public class Iphone {
	
    private String musicaAtual;
    private boolean emChamada;

    // Interface para Reprodutor Musical
    public interface ReprodutorMusical {
    	
        void tocar();
        void pausar();
        void selecionarMusica(String musica);
    }

    // Interface para Aparelho Telefônico
    public interface AparelhoTelefonico {
    	
        void ligar(String numero);
        void atenderChamada();
        void iniciarConversaVoz();
    }

    // Interface para Navegador na Internet
    public interface NavegadorInternet {
    	
        void exibirPagina(String url);
        void adicionarNovaAba();
        void atualizarPagina();
    }

    // Implementação das interfaces
    public class ReprodutorMusicalImpl implements ReprodutorMusical {
        private String musicaAtual;

		@Override
        public void tocar() {
            if (musicaAtual != null) {
                System.out.println("Tocando música: " + musicaAtual);
            } else {
                System.out.println("Nenhuma música selecionada.");
            }
        }

        @Override
        public void pausar() {
            System.out.println("Música pausada.");
        }

        @Override
        public void selecionarMusica(String musica) {
            this.musicaAtual = musica;
            System.out.println("Música selecionada: " + musica);
        }
    }

    public class AparelhoTelefonicoImpl implements AparelhoTelefonico {
    	
        @Override
        public void ligar(String numero) {
            System.out.println("Ligando para: " + numero);
        }

        @Override
        public void atenderChamada() {
            if (!emChamada) {
                emChamada = true;
                System.out.println("Chamada atendida.");
            } else {
                System.out.println("Já está em uma chamada.");
            }
        }

        @Override
        public void iniciarConversaVoz() {
            if (emChamada) {
                System.out.println("Conversa por voz iniciada.");
            } else {
                System.out.println("Não há chamada ativa para iniciar uma conversa por voz.");
            }
        }
    }

    public class NavegadorInternetImpl implements NavegadorInternet {
    	
        @Override
        public void exibirPagina(String url) {
            System.out.println("Exibindo página da internet: " + url);
        }

        @Override
        public void adicionarNovaAba() {
            System.out.println("Nova aba adicionada ao navegador.");
        }

        @Override
        public void atualizarPagina() {
            System.out.println("Página atualizada.");
        }
    }

    public static void main(String[] args) {
    	
        Iphone iphone = new Iphone();
        ReprodutorMusical reprodutor = iphone.new ReprodutorMusicalImpl();
        AparelhoTelefonico telefone = iphone.new AparelhoTelefonicoImpl();
        NavegadorInternet navegador = iphone.new NavegadorInternetImpl();

        // Exemplos de uso
        reprodutor.selecionarMusica("CamelPhat - Hope (Feat. Max Milner)");
        reprodutor.tocar();
        reprodutor.pausar();

        telefone.ligar("99986754321");
        telefone.atenderChamada();
        telefone.iniciarConversaVoz();

        navegador.exibirPagina("https://www.testesitefabricio.com");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
    }

	public String getMusicaAtual() {
		return musicaAtual;
	}

	public void setMusicaAtual(String musicaAtual) {
		this.musicaAtual = musicaAtual;
	}
}

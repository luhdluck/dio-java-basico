package edu.luisa.pilaresPOO;

public abstract class ServicoMensagemInstantanea {
	public abstract void enviarMensagem();
	public abstract void receberMensagem();	

	protected void salvarHistoricoMensage() {
		System.out.println("Salvando historico de mensagem");
	}
	
	//somente os filhos conhecem este método
	protected void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}
}

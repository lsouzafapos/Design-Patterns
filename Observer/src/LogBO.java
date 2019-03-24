
public class LogBO implements Observador {

	@Override
	public void novoArquivoGerado(String nomeArquivo, String conteudo) {
		LogDAO logDAO = new LogDAO();
		Log log = new Log("Arquivo", nomeArquivo, conteudo);
		try {
			logDAO.salvarLog(log);
		} catch (Exception e) {

		}

	}

}

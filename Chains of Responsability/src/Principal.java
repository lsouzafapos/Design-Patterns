import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Principal {

	public static void main(String[] args) throws IOException {
		Map<String, Object> mapa = new HashMap<>();
		mapa.put("nome", "Leonardo");
		mapa.put("idade", "23");
		Processador processaCompactado = new ProcessaCompactado();
		Processador processaCriptografado = new ProcessaCriptografado(processaCompactado);

		GeradorArquivo gerador = new GeradorArquivoPropriedades(processaCriptografado);
		gerador.gerarArquivo("C:\\Gerador\\prop1.zip", mapa);

	}

}

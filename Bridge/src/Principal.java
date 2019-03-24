import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Principal {

	public static void main(String[] args) throws IOException {
		Map<String, Object> mapa = new HashMap<>();
		mapa.put("nome", "Leonardo");
		mapa.put("idade", "23");

		GeradorArquivo gerador = new GeradorArquivoPropriedades(new ProcessaCriptografado());
		gerador.gerarArquivo("C:\\Gerador\\Cripto.txt", mapa);

		GeradorArquivo gerador1 = new GeradorArquivoXml(new ProcessaCompactado());
		gerador1.gerarArquivo("C:\\Gerador\\XML.zip", mapa);
		
		GeradorArquivo gerador2 = new GeradorArquivoPropriedades(new ProcessaDefault());
		gerador2.gerarArquivo("C:\\Gerador\\default.txt", mapa);
	}

}

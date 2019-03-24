import java.util.Map;

public class GeradorArquivoPropriedadesCriptografado extends GeradorArquivo {
	
	@Override
	protected String gerarConteudo(Map<String, Object> propriedades) {
		StringBuilder propFileBuilder = new StringBuilder();
		for (String prop : propriedades.keySet()) {
			propFileBuilder.append(prop + "=" + propriedades.get(prop) + "\n");
		}
		return propFileBuilder.toString();
	}

	@Override
	protected byte[] processaConteudo(byte[] bytes) {
		byte[] newBytes = new byte[bytes.length];
		for (int i = 0; i < bytes.length; i++) {
			newBytes[i] = (byte) ((bytes[i] + 10) % Byte.MAX_VALUE);
		}
		return newBytes;
	}
}

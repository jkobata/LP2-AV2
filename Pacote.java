import java.util.Scanner;
import java.io.IOException;

public class Pacote{
	public int cabeçalho = 0;
	public int terminator = 0;
	public String dados;
	public String destino;

	public void setDados(String newDados){
		this.dados = newDados;
	}
	public String getDados(){
		return this.dados;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getDestino() {
		return destino;
	}
	public void setCabeçalho(int cabeçalho) {
		this.cabeçalho = cabeçalho;
	}
	public void setTerminador(int terminador) {
		this.terminador = terminador;
	}

}
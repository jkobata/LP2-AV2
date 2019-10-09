import java.util.Scanner;
import java.io.IOException;

public class Pacote{
	private int cabecalho = 0;  //sujeito a alteração
	private int terminador = 0; //sujeito a alteração
	private String dados;
	private String destino;

	public Pacote(int cabecalho, int terminador, String dados, String destino){
		this.cabecalho = cabecalho;
		this.terminador = terminador;
		this.destino = destino;
		this.dados = dados;
	}

	public void setDados(String newDados){
		this.dados = newDados;
	}
	public String getDados(){
		return this.dados;
	}
}
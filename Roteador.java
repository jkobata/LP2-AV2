import java.util.Scanner;
import java.util.Queue;
import java.io.IOException;

public class Roteador extends DispositivoDeRede{
	Porta porta_1;
	Porta porta_2;
	Porta porta_3;
	Porta porta_4;
	Porta porta_5;

	Queue<Pacote> buffer_1; //buffer
	Queue<Pacote> buffer_2; //buffer
	Queue<Pacote> buffer_3; //buffer
	Queue<Pacote> buffer_4; //buffer
	Queue<Pacote> buffer_5; //buffer

	public void checaPrioridade(){
	}

	public void roteamento(Pacote pacote){
	}
}
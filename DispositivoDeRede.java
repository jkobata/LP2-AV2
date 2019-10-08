import java.util.Scanner;
import java.io.IOException;

public class DispositivoDeRede{
	public String endereço_IP;
	public String endereço_MAC;


	public void (String ip){
		this.endereço_IP = ip;
	}

	public String getIP(){
		return this.endereço_IP;
	}

	public void setMAC(String mac){
		endereço_MAC = mac;
	}
	
	public String getMAC(){
		return this.endereço_MAC;
	}


}
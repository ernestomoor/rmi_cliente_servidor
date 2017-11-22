import java.rmi.*;
import java.rmi.server.*;
public class HolaMundoImpl extends UnicastRemoteObject implements HolaMundoInt{
	public HolaMundoImpl()throws RemoteException{
		super();
	}
	public String decirHola(String nombre)throws RemoteException{
		return "jmcm"+nombre;
	}
	public String ayguey(String nombre)throws RemoteException{
		return "chido liro ayguey";
	}
}

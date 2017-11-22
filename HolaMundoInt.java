import java.rmi.*;
public interface HolaMundoInt extends Remote{
	public String decirHola(String nombre) throws java.rmi.RemoteException;
	public String ayguey(String nombre) throws java.rmi.RemoteException;
}
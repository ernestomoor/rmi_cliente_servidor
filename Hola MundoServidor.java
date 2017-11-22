import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.net.*;
import java.io.*;
public class HolaMundoServidor{
	String URLRegistro;
	public static void main(String args[]){
		try{
			numPuertoRMI=5000;
			arrancarRegistro(numPuertoRMI);
			HolaMundoImpl objExportado = new HolaMundoImpl();
			URLRegistro="rmi://127.0.0.1:5000/holaMundo";
			Naming.rebind(URLRegistro,objExportado);
			System.out.prinln("Servidor registrado. contiene actualmente:");
			listaRegistro(URLRegistro);
			System.out.prinln("Servidor HolaMundo Preparado:");
		}catch(Exception excr){
			System.out.prinln("Excepcion Hola mundo " +excr);
		}		
	}
	private static void arrancarRegistro(int numPuertoRMI)throws RemoteException{
		try{
			Registry registro =LocateRegistry.getRegistry(numPuertoRMI);
			registro.list();
		}catch(RemoteException{){
			System.out.println("El registro no se puede localizar en este puerto"+ numPuertoRMI);
			Registry registro =LocateRegistry.createRegistry(numPuertoRMI);
			System.out.println("El registro fue creado en el puerto"+ numPuertoRMI);
		}
	}
	private static void listaRegistro(String URLRegistro)throws RemoteException, MalformedURLException{
		System.out.println("Registro "+URLRegistro+" contiene");
		String []nombres=Naming.list(URLRegistro);
		for(int i=0;i<nombres.length;i++){
			System.out.prinln(nombres[i]);
		}		
	}
}
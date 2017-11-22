import java.rmi.*;
public class HolaMundoCliente{
	public static void main(String args[]){
		try{
			String URLRegistro="rmi://192.168.9.116:5000/holaMundo";
			HolaMundoInt h= (HolaMundoInt)Naming.lookup(URLRegistro);
			System.out.println("Busqueda Completa");
			String mensaje =h.decirHola("Pato Donald");
			System.out.println("HolaMundoCliente: "+mensaje);
			mensaje=h.nuevoMensaje("Hola Bátiz");
			System.out.println("HolaMundoCliente: "+mensaje);
		}catch(Exception e){
			System.out.println("Excepcion en HolaMundoCLiente "+ e);
		}
	}
}
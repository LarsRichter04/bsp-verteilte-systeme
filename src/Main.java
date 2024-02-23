import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Main {
    public static void main(String[] args) throws RemoteException {
        try{
            setup();
        } catch (RemoteException e){
            System.out.println("ERROR ON SETUP");
        }
    }

    private static void  setup() throws RemoteException{
        FlightService server = new FlightServiceImpl();
        FlightService stub = (FlightService) UnicastRemoteObject.exportObject((FlightService) server,0);
        Registry registry = LocateRegistry.createRegistry(1099);
        registry.rebind("FlightService",stub);
        System.out.println("SERVER: SERVICE UP");
    }
}
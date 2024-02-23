import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {

    public static void main(String[] args){
        try{
            bookFlight();
        }catch (RemoteException e){
            System.out.println("ERROR BOOKING FROM CLIENT: RemoteException "+ e);
        }catch (NotBoundException e){
            System.out.println("ERROR BOOKING FROM CLIENT: NotBoundException");
        }
    }

    private static void bookFlight() throws RemoteException, NotBoundException {
        Registry registry = LocateRegistry.getRegistry();
        FlightService server = (FlightService) registry.lookup("FlightService");
        System.out.println("CLIENT: Attempting to book");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //System.out.println(server.testMethod());
        System.out.println(server.bookFlight(new Airport("PAD","Paderborn"),new Airport("FRA","Frankfurt"),"23.02.2024","15:00"));
        System.out.println(server.getAllFlights());
    }
}

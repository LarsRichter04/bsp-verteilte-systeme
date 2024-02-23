import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface FlightService extends Remote {
    String bookFlight(Airport departure, Airport destination, String date, String time) throws RemoteException;

    List<Flight> getAllFlights() throws RemoteException;
}

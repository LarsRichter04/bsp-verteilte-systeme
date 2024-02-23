import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

public class FlightServiceImpl implements FlightService{

    List<Airline> airlineList;
    public FlightServiceImpl(){
        airlineList = new ArrayList<>();
        airlineList.add(new Airline());
    }
    @Override
    public String bookFlight(Airport departure, Airport destination, String date, String time) throws RemoteException {
        System.out.println("SERVER: Recieved Booking Request");
        for(Airline al : airlineList){
            if(al.tryToBookFlight(destination,departure,date,time)){
                return "Flight booked successfully";
            }
        }
        return "Couldnt Book Flight";
    }

    @Override
    public List<Flight> getAllFlights() throws RemoteException {
        List<Flight> res = new ArrayList<Flight>();
        for (Airline al :airlineList){
            res.addAll(al.getFlights());
        }
        return res;
    }
}

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Airline {
    private List<Flight> availableFlights;

    public Airline(){
        availableFlights = new ArrayList<>();
        availableFlights.add(new Flight(new Airport("PAD","Paderborn"),new Airport("FRA","Frankfurt"),"23.02.2024","15:00"));
    }

    public boolean tryToBookFlight(Airport destination,Airport departure,String date,String time){
        Flight f =new Flight(destination,departure,date,time);
        if(availableFlights.contains(f)){
            availableFlights.get(availableFlights.indexOf(f)).book();
            return true;
        }else {
            return false;
        }
    }


    public List<Flight> getFlights() {
        return availableFlights;
    }
}

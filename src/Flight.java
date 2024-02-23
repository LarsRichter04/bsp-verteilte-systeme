import java.io.Serializable;
import java.util.Objects;

public class Flight implements Serializable {
    Airport destination;
    Airport departure;
    String date;
    String time;
    int bookings;

    public Flight(Airport destination, Airport departure, String date, String time) {
        this.destination = destination;
        this.departure = departure;
        this.date = date;
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(destination, flight.destination) && Objects.equals(departure, flight.departure) && Objects.equals(date, flight.date) && Objects.equals(time, flight.time);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "destination=" + destination +
                ", departure=" + departure +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", bookings=" + bookings +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, departure, date, time);
    }

    public void book() {
        bookings+=1;
    }

    public Airport getDestination() {
        return destination;
    }

    public Airport getDeparture() {
        return departure;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public int getBookings() {
        return bookings;
    }
}

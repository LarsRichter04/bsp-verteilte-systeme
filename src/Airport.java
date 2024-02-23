import java.io.Serializable;
import java.util.Objects;

public class Airport implements Serializable {
    private String iata;
    private String location;

    public Airport(String iata,String location){
        this.iata = iata;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "iata='" + iata + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airport airport = (Airport) o;
        return Objects.equals(iata, airport.iata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iata);
    }
}

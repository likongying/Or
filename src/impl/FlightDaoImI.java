package impl;

import cn.edu.hcnu.bean.Flight;
import dao.IFlightDao;

import java.util.Set;

public class FlightDaoImI implements IFlightDao {

    @Override
    public void insertFlight(Flight flight) {
        
    }

    @Override
    public Set<Flight> getAllFlights() {
        return null;
    }

    @Override
    public Flight getFlightByDepartureTime(String departureTime) {
        return null;
    }

    @Override
    public Flight getFlightByDepartureAirPort(String departureAirPort) {
        return null;
    }

    @Override
    public Flight getFlightByDestinationAirPort(String destinationAirPort) {
        return null;
    }

    @Override
    public void updateFlight(Flight flight) {

    }
}

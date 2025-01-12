package org.woehlke.computer.kurzweil.simulated.evolution.model.neighbourhood.neighbourhoodposition;

import org.woehlke.computer.kurzweil.simulated.evolution.model.neighbourhood.LatticePointNeighbourhoodPosition;
import org.woehlke.computer.kurzweil.simulated.evolution.model.neighbourhood.LatticePointNeighbourhoodType;

public abstract class Neighbourhoods {
    public abstract LatticePointNeighbourhoodPosition[] getNeighbourhoodPositions();

    public static LatticePointNeighbourhoodPosition[] NeighbourhoodFactory(LatticePointNeighbourhoodType type){
        LatticePointNeighbourhoodPosition[] result;
        switch (type){
            case VON_NEUMANN_NEIGHBORHOOD -> result = new VonNeumannNeighborhood().getNeighbourhoodPositions();
            case MOORE_NEIGHBORHOOD ->  result = new MooreNeighborhood().getNeighbourhoodPositions();
            case USER_DEFINE_NEIGHBORHOOD -> result = new UserDefineNeighbourhood().getNeighbourhoodPositions();
            default -> result =  new OtherNeighbourhood().getNeighbourhoodPositions();
        }
        return result;
    }

}

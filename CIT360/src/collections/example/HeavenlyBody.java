package collections.example;

import java.util.HashSet;
import java.util.Set;

/*
This class will use Set for the satellites, and Hashset
for the orbital period
*/
public class HeavenlyBody {
	 private final String name;
	    private final double orbitalPeriod;
	    private final Set<HeavenlyBody> satellites;

	    public HeavenlyBody(String name, double orbitalPeriod) {
	        this.name = name;
	        this.orbitalPeriod = orbitalPeriod;
	        this.satellites = new HashSet<>();
	    }

	    //this is a getter for name
	    public String getName() {
	        return name;
	    }

	    //getter for the moons
	    public boolean addMoon(HeavenlyBody moon) {
	        return this.satellites.add(moon);
	    }

	    //function to be able to add a moon to the HashSet, by
	    //passing a parameter (HeavenlyBody)
	    public Set<HeavenlyBody> getSatellites() {
	        return new HashSet<>(this.satellites);
	    }
	}



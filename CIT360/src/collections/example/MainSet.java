package collections.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
This program will demonstrate how to use HashSet in Java by creating a
model of our Solar System. I'm gonna use map to store all the heavenly
body(planets) objects, then i will declare sets to perform the grouping of the objects
into a different type
*/
public class MainSet {
	 private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
     private static Set<HeavenlyBody> planets = new HashSet<>();

     public static void main(String[] args) {
         HeavenlyBody temp = new HeavenlyBody("Mercury", 88);
         solarSystem.put(temp.getName(), temp);       //store orbitalPeriod with key-value pair in map
         planets.add(temp);                           //store value on set

         temp = new HeavenlyBody("Venus", 225);
         solarSystem.put(temp.getName(), temp);       //store orbitalPeriod with key-value pair in map
         planets.add(temp);                           //store value on set

         temp = new HeavenlyBody("Earth", 365);
         solarSystem.put(temp.getName(), temp);       //same as Mercury and Venus
         planets.add(temp);

         HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27);
         solarSystem.put(tempMoon.getName(), tempMoon);
         temp.addMoon(tempMoon);

         temp = new HeavenlyBody("Mars", 687);
         solarSystem.put(temp.getName(), temp);
         planets.add(temp);

         tempMoon = new HeavenlyBody("Deimos", 1.3);
         solarSystem.put(tempMoon.getName(), tempMoon);
         temp.addMoon(tempMoon);                       // temp is still Mars

         tempMoon = new HeavenlyBody("Phobos", 0.3);
         solarSystem.put(tempMoon.getName(), tempMoon);
         temp.addMoon(tempMoon);                       // temp is still Mars

         temp = new HeavenlyBody("Jupiter", 4332);
         solarSystem.put(temp.getName(), temp);
         planets.add(temp);

         tempMoon = new HeavenlyBody("Io", 1.8);
         solarSystem.put(tempMoon.getName(), tempMoon);
         temp.addMoon(tempMoon);                       // temp is still Jupiter

         tempMoon = new HeavenlyBody("Europa", 3.5);
         solarSystem.put(tempMoon.getName(), tempMoon);
         temp.addMoon(tempMoon);                       // temp is still Jupiter

         tempMoon = new HeavenlyBody("Ganymede", 7.1);
         solarSystem.put(tempMoon.getName(), tempMoon);
         temp.addMoon(tempMoon);                       // temp is still Jupiter

         tempMoon = new HeavenlyBody("Callisto", 16.7);
         solarSystem.put(tempMoon.getName(), tempMoon);
         temp.addMoon(tempMoon);                        // temp is still Jupiter

         temp = new HeavenlyBody("Saturn", 10759);
         solarSystem.put(temp.getName(), temp);
         planets.add(temp);

         temp = new HeavenlyBody("Uranus", 30660);
         solarSystem.put(temp.getName(), temp);
         planets.add(temp);

         temp = new HeavenlyBody("Neptune", 165);
         solarSystem.put(temp.getName(), temp);
         planets.add(temp);

         temp = new HeavenlyBody("Pluto", 248);
         solarSystem.put(temp.getName(), temp);
         planets.add(temp);

         //displays list of planets
         System.out.println("HeavenlyBody");
         for(HeavenlyBody planet : planets) {
             System.out.println("\t" + planet.getName());
         }

         //displays moons of assigned object (planet Earth)
         HeavenlyBody body = solarSystem.get("Earth");
         System.out.println("Moons of " + body.getName());
         for(HeavenlyBody jupiterMoon: body.getSatellites()) {
             System.out.println("\t" + jupiterMoon.getName());
         }

         //assigns moon(s) to a planet
         Set<HeavenlyBody> moons = new HashSet<>();
         for(HeavenlyBody planet : planets) {
             moons.addAll(planet.getSatellites());
         }

         //display all moons
         System.out.println("All Moons");
         for(HeavenlyBody moon : moons) {
             System.out.println("\t" + moon.getName());
         }



     }

}

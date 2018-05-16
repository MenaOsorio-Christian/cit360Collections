package collections.example;

import java.util.HashMap;
import java.util.Map;

//Mapexample class is an example of how map works in Java
//Map consist on a key and its value, in this case the key are the programing languages
//and their value are the definition for each key (language)
public class MapExample {
	 public static void main(String[] args) {
	        Map<String, String> languages = new HashMap<>();      //creates a map and its value

	        //this if statement checks if the key "Java" and it values has been created on map,
	        // if not, the key "Java" with its values is created on the map.
	        if(languages.containsKey("Java")) {
	            System.out.println("Java already exists");
	        } else {
	            languages.put("Java", "a compiled high level, object-oriented, platform independent language");
	            System.out.println("Java added successfully");
	        }

	        //Lines 24 through 27 contains the keys and their value that belong to the map
	        languages.put("PYTHON", "an interpreted, object-oriented, high-level programming language with dynamic semantics");
	        languages.put("ALGOL", "an algorithmic language");
	        languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code");
	        languages.put("LISP", "Therein lies madness");

	        //this if statement checks if the key Java is already part of the map to avoid
	        // getting its value from line 19 override it. If you change the key "Java" to any
	        //other key that belongs to the map; the value of Java from line 19 gets override it.
	        if(languages.containsKey("Java")) {
	            System.out.println("Java is already in the map");
	        } else {
	            languages.put("Java", "This course is about Java");
	        }

	        System.out.println("================================================");

	        //This loop displays the map with its keys and values
	        for(String key: languages.keySet()) {
	            System.out.println(key + " : " + languages.get(key));
	        }
	    }
}

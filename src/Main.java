import java.util.HashSet;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		Set<Animal> zoo = new HashSet<>();
		
		Animal elephant = new Animal("elephant", "Africa", "herbivore");
		Animal wolf = new Animal("wolf", "Europe", "carnivore");
		Animal kangoroo = new Animal("kangoroo", "Australia", "herbivore");
		
		zoo.add(elephant);
		zoo.add(wolf);
		zoo.add(kangoroo);
		
		printAnimals(zoo);
		
		Animal anotherWolf = new Animal("wolf", "Europe", "carnivore");
		zoo.add(anotherWolf);
		System.out.println();
		
		printAnimals(zoo);
	}
	
	public static void printAnimals(Set<Animal> animals) {
		for(Animal animal : animals) {
			System.out.println(animal.getName() + ": lives in " + animal.getOrigin() + ", " + animal.getDiet());
		}
	}
}

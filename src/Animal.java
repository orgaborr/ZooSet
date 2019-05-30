
public class Animal {
	private final String name;
	private final String origin;
	private final String diet;
	
	public Animal(String name, String origin, String diet) {
		this.name = name;
		this.origin = origin;
		this.diet = diet;
	}

	public String getName() {
		return name;
	}

	public String getOrigin() {
		return origin;
	}

	public String getDiet() {
		return diet;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		} else if(obj == null) {
			return false;
		} else if(obj instanceof Animal) {
			Animal test = (Animal) obj;
			if(test.getName() == this.getName()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.name.hashCode() + 57 + this.origin.hashCode();
	}
	
	

}

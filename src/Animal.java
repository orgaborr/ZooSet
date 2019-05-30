
public class Animal {
	private final String name;
	private final Origin origin;
	private final Diet diet;
	
	//Origin continents initialized
	private static final Origin EUROPE = new Origin("Europe", "Europe is a continent located entirely in the Northern Hemisphere\n"
			+ " and mostly in the Eastern Hemisphere.");
	private static final Origin ASIA = new Origin("Asia", "Asia is Earth's largest and most populous continent, located primarily\n"
			+ " in the Eastern and Northern Hemispheres.");
	private static final Origin AFRICA = new Origin("Africa", "Africa is the world's second largest and second most-populous continent,\n"
			+ " being behind Asia in both categories.");
	private static final Origin NORTH_AMERICA = new Origin("North America", "North America is a continent entirely within the Northern Hemisphere\n"
			+ " and almost all within the Western Hemisphere.");
	private static final Origin SOUTH_AMERICA = new Origin("South-America", "South America is a continent in the Western Hemisphere, mostly in the Southern Hemisphere,\n"
			+ "with a relatively small portion in the Northern Hemisphere.");
	private static final Origin AUSTRALIA = new Origin("Australia", "The continent of Australia, sometimes known in technical contexts by the names Sahul, Australinea or Meganesia\n"
			+ " to distinguish it from the country of Australia, consists of the land masses\n"
			+ " which sit on Australia's continental plate.");
				
	public Animal(String name, Origin origin, Diet diet) {
		this.name = name;
		this.origin = origin;
		this.diet = diet;
	}

	public String getName() {
		return name;
	}

	public Origin getOrigin() {
		return origin;
	}

	public Diet getDiet() {
		return diet;
	}
	
	private class Origin {
		private final String continentName;
		private final String continentDescription;

		public Origin(String continentName, String continentDescription) {
			this.continentName = continentName;
			this.continentDescription = continentDescription;
		}

		public String getContinentName() {
			return continentName;
		}

		public String getContinentDescription() {
			return continentDescription;
		}
		
		
	}
	
	
	
	
}

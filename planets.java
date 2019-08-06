/*
 * file name is planets.java
 */

//Step 1: class file planets created with public void main(String args[] {   } created and later taken out
public class planets {
	protected String name;
	protected int placement;
	protected String funFact;
	
	//Step 2: copied public method below from OPP Basics example. Not sure what purpose is.
	public planets(String name, int placement, String funFact) {
		this.name = name;
		this.placement = placement;
		this.funFact = funFact;
	}
	
	//Step 3: defined methods from 3 variables chosen for planets
	public String toString() {
		return name + placement + funFact;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPlacement() {
		return placement;
	}
	
	public String getFunFact() {
		return funFact;
	}
	
	//Step 4: decided only wanted ability to set for new facts.
	//other member variables should stay constant for each created instance (or, each defined planet)
	public void setFunFact(String newFact) {
		funFact = newFact;
	}
	
	
	planets() {
		
	}
	
	//Step 5. create a subclass that can inherit method variables (name) from superclass.
	public class moons extends planets {
		//moons has to have at least 1 member variable to be a class
		private int perPlanet;
		private String name;
		//Step 8. changed ID of first variable from moons to perPlanet
		//Step 9. added String variables 'name' and 'fromPlanet'
		
		public moons(String name, int perPlanet) {
			this.name = name;
			this.perPlanet = perPlanet;
		}
		//Step 12. add format for class moons through public moons () {   }
		//Step 14. Remove variable fromPlanet() and all references to it in code
		
		//moons needs at least 1 member method to be a class
		public int getPerPlanet() { 
			return perPlanet;
		}
		public String getName() {
			return this.name;
		}
		//Step 10. adjust method 1. make methods for moon names and fromPlanet
		
		public String toString() {
			return (name + " is one of " + perPlanet + " moons from the planet ");
		}
		//Step 11. Adjust method toSting()
		//Step 6. public void main(String args[] {   } was removed once everything else was done
		
		moons() {
			
		}
		//Step 13. Add in blank moons() because it enables testPlanets to call class somehow?
	}
	//Step 7. create a new class in Java called testPlanets.java	
		
}	

/*
 * Notes:
 * planets.java was developed completely before testPlanets.java
 * ^^ Nope. Came back and picked up with step 8. 
 * Approximate steps (I had some trouble with it) are numbered above
*/ 
//to test polymorphism in class planets

public class testPlanets extends planets {
		
	
		public static void main(String args[]) {
			
			planets Mercury = new planets("Mercury", 1, "It is the smallest planet in the Solar System.");
			Mercury.getName();
			Mercury.getPlacement();
			Mercury.getFunFact();
			planets Venus = new planets("Venus", 2, "It is the hottest planet in the Solar System, with an average temperature of 462 Celcius.");
			Venus.getName();
			Venus.getPlacement();
			Venus.getFunFact();
			planets Earth = new planets();
			Earth.getName();
			Earth.getPlacement();
			Earth.getFunFact();
			planets Mars = new planets();
			Mars.getName();
			Mars.getPlacement();
			Mars.getFunFact();
			planets Jupiter = new planets();
			Jupiter.getName();
			Jupiter.getPlacement();
			Jupiter.getFunFact();
			planets Saturn = new planets();
			Saturn.getName();
			Saturn.getPlacement();
			Saturn.getFunFact();
			planets Uranus = new planets();
			Uranus.getName();
			Uranus.getPlacement();
			Uranus.getFunFact();
			planets Neptune = new planets();
			Neptune.getName();
			Neptune.getPlacement();
			Neptune.getFunFact();
			
			System.out.println("Planet " + Mercury.placement + ": " + Mercury.name + ". "+ Mercury.funFact);
			System.out.println("Planet " + Venus.placement + ": " + Venus.name + ". "+ Venus.funFact);

	
		
			moons Deimos = new moons("Deimos", 2);
			Deimos.getName();
			Deimos.getPerPlanet();
			
			//12. write out two moons have errors. go back to planets.java to fix
			//13. There is an error assigning planet name to variable fromPlanet. Undoing work; finding different way	
			//14. error code on enclosing instance on type planets accessible. Back to do research online to solve
			
		}
	
		
}

/*
 * Notes:
 * 1. have testPlanets extend planets class
 * 2. struggle with how to declare, construct, and define values for new instances
 * 3. Realized each state defined in new instances needs a "get" function below it
 * 4. Created full delcared & constructed instances for Mercury and Venus
 * 5. fetched the relevant states for Mercury and Venus with "get" methods
 * 6. After testing, realized needed a System.out.println(); to print any output to a console for an instance
 * 7. Crafted rudimentary System.out.println(); for Mercury and tested to see if console had any output
 * 8. Modified content in System.out.println until the output looked readable
 * 9. declared instances for Earth, Mars, Jupiter, Saturn, Uranus, and Neptune
 * 10. Went to sleep...
 * 11. Decided to call subclass moons for Mars. Went back to edit planets.java...
*/ 
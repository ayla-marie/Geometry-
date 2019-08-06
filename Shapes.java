
public class Shapes {
	/*
	 * 1. Planning:
	 * Sub-classes: circle, square, triangle
	 * cub-classes 2: sphere, cube, triangePyramid
	 * superclass variables: color
	 * circle class: radius, circumference, area
	 * square class: length, perimeter, area
	 * triangle class: width, height, area
	 * sphere class: radius, volume
	 * square class: length, area, volume
	 * tiranglePyramid class: width, height, area, volume
	 */

	protected String color;
	//2. define shared member variable
	
	public String getColor() {
		return ("The shape is " + color + ".");
	}
	public void setColor() {
	}
	public final String DEFAULT_COLOR = "blue";
	//7. define member methods and default values for shapes
	
	// accessControl returnType methodName (parameterList) {return  ;}
	
	public class circle extends Shapes {
		protected double radius;
		private double circumference;
		private double area;
		
		public void setRadius() {
		}
		public String getRadius() {
			return ("Radius = " + radius);
		}
		public double setCircumference() {
			return 2 * radius * 3.1416;
		}
		public double setArea() {
			return radius * radius * 3.1416;
		}
		public String getCircumference() {
			return ("The circumference is " + circumference + ".");
		}
		public String getArea() {
			return ("The area is " + area + ".");
		}
		public final double DEFAULT_RADIUS = 3.0;
		//8. define member methods and set default values
		
		public class sphere extends circle {
			private double volume;
			
			public double setVolume() {
				return 0.74 * 3.1416 * radius * radius * radius;
			}
			public String getVolume() {
				return ("The volume of this sphere is " + volume + ".");
			}
			//12. define member methods of sphere class
			
		}
		
	}
	
	public class square extends Shapes {
		protected int length;
		private int perimeter;
		protected int area;
		
		public void setLength() {
		}
		public String getLength() {
			return ("Length = " + length);
		}
		public int setPerimeter() {
			return 4 * length;
		}
		public String getPerimeter() {
			return ("The perimeter measures " + perimeter + ".");
		}
		public int setArea() {
			return length * length;
		}
		public String getArea() {
			return ("The area is " + area + ".");
		}
		public final int DEFAULT_LENGTH = 4;
		//9. define member methods and set default value
		
		public class cube extends square {
			private int area;
			private int volume;
			
			public int setArea() {
				return super.area * 6;
			}
			public String getArea() {
				return ("The surface area of the cube is " + area + ".");
			}
			public int setVolume() {
				return length * length * length;
			}
			public String getVolume() {
				return ("The volume of the cube is " + volume + ".");
			}
			//13. define member methods of the cube class
		}
		
	}
	
	public class triangle extends Shapes {
		protected int width;
		protected int height;
		protected double area;
		
		public void setWidth() {
			
		}
		public void setHeight() {
			
		}
		public String getWidth() {
			return ("Width = " + width);
		}
		public String getHeight() {
			return ("Height = " + height);
		}
		public double setArea() {
			return width * 0.5 * height;
		}
		public String getArea() {
			return ("The area is " + area + ".");
		}
		public final int DEFAULT_WIDTH = 5;
		public final int DEFAULT_HEIGHT = 5;
		//10. define member methods and set default values
		
		public class trianglePyramid extends triangle {
			private int pyramidHeight;
			private double volume;
			
			public void setPyramidHeight() {
				
			}
			public String getPyramidHeight() {
				return ("Pyramid Height =" + pyramidHeight);
			}
			public double setVolume() {
				return 0.3333 * area * pyramidHeight;
			}
			public String getVolume() {
				return ("The volume of the Triangular Pyramid is " + volume + ".");
			}
			public final int DEFAULT_PYRAMIDHEIGHT = 4;
			//14. define member variables and default values of trianglePyramid class
			
		}
		
	}
	//3. write in subclass first level with extend modifier
	//4. define member variables for each first level subclass
	//5. write in second level subclass
	//6. define member variables for 2nd level subclass
	//11. learned about protected class and changed some from "private" to "protected"

	//15. Delete the public static void main(String[] args) that was put in by default

}

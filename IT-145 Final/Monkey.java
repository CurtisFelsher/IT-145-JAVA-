//Curtis Felsher
//2-5-2022
package Grazioso;

//instance variables
public class Monkey extends RescueAnimal {
	private String tailLength;
	private String height;
	private String bodyLength;
	private String species;
	
	//constructor
	public Monkey(String name, String species, String tailLength, String height, String bodyLength, String gender, String age, String weight, String acquisitionDate, String acquisitionCountry, String trainingStatus, boolean reserved, String inServiceCountry ) 
		{
		setName(name);
		setSpecies(species);
		setTailLength(tailLength);
		setHeight(height);
		setBodyLength(bodyLength);
		setGender(gender);
		setAge(age);
		setWeight(weight);
		setAcquisitionDate(acquisitionDate);
		setAcquisitionLocation(acquisitionCountry);
		setTrainingStatus(trainingStatus);
		setReserved(reserved);
		setInServiceCountry(inServiceCountry);
		}
	
			//accessors and mutators
			public String getTailLength() {
				return tailLength;
			}
			
			public void setTailLength(String tailLength) {
				this.tailLength = tailLength;
			}
			
			public String getHeight() {
				return height;
			}
			
			public void setHeight(String height) {
				this.height = height;
			}
			
			public String getBodyLength() {
				return bodyLength;
			}
			
			public void setBodyLength(String bodyLength) {
				this.bodyLength = bodyLength;
			}
			
			public String getSpecies( ) {
				return species;
			}
			
			public void setSpecies(String species) {
				this.species = species;
			}
}

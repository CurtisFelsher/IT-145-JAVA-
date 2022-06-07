//Curtis Felsher
//2-17-2022
package Grazioso;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    // Instance variables (if needed)
    //Menu Loop
    public static void main(String[] args) {
    	Scanner scnr = new Scanner(System.in);
    	char userInput = 'a';
    	initializeDogList();
        initializeMonkeyList();
        while ((userInput != 'q')) {
        displayMenu();
        userInput = scnr.next().charAt(0);
        if(userInput == '1') {
        	System.out.println("[1] Intake a new dog");
        	System.out.println();
        	scnr.nextLine();
        	intakeNewDog(scnr);
        	} 
        else if(userInput == '2') {  
        	System.out.println("[2] Intake a new monkey");
        	System.out.println();
        	scnr.nextLine();
        	intakeNewMonkey(scnr);
        	}  
        else if(userInput == '3') {
        	System.out.println("[3] Reserve an animal");
        	System.out.println();
        	reserveAnimal(scnr);          
        	}  
        else if(userInput == '4') {
        	System.out.println("[4] Print a list of all dogs");
        	System.out.println();
        	printAnimals("4");
        	}  
        else if(userInput == '5') {
        	System.out.println("[5] Print a list of all monkeys");
        	System.out.println();
        	printAnimals("5");          
        	}  
        else if(userInput == '6') {
        	System.out.println("[6] Print a list of all animals that are not reserved");
        	System.out.println();
        	printAnimals("6");
        	}
        else if(userInput == 'q') {
        	System.out.println("[q] Quit application");
        	System.out.println();
        	}
        else {
        	System.out.println("Entry not valid");
        }
        }
        // Add a loop that displays the menu, accepts the users input
        // and takes the appropriate action.
	// For the project submission you must also include input validation
        // and appropriate feedback to the user.
        // Hint: create a Scanner and pass it to the necessary
        // methods 
	// Hint: Menu options 4, 5, and 6 should all connect to the printAnimals() method.

    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "in service", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "in service", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {
    	Monkey monkey1 = new Monkey("Rick", "Capuchin", "2.0", "5.8", "8.0", "male", "5", "13.0", "08-01-2016", "United States", "in service", false, "United States");
    	Monkey monkey2 = new Monkey("Sheila", "Guenon", "4.0", "5.1", "8.5", "female", "6", "19.0", "12-28-2019", "United States", "in service", false, "United States");
    	Monkey monkey3 = new Monkey("Sandy", "Macaque", "3", "5.7", "9.9", "female","7", "14.8", "09-07-2020", "United States", "in service", true, "United States");

    	
    	monkeyList.add(monkey1);
    	monkeyList.add(monkey2);
    	monkeyList.add(monkey3);
    }


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
         // Add the code to instantiate a new dog and add it to the appropriate list
            else {
            	System.out.println("Enter the breed of the dog: ");
            	String breed = scanner.nextLine();
            	
            	System.out.println("Enter the gender of the dog: ");
            	String gender = scanner.nextLine();
            	
            	System.out.println("Enter the age of the dog: ");
            	String age = scanner.nextLine();
            	
            	System.out.println("Enter the weight of the dog: ");
            	String weight = scanner.nextLine();
            	
            	System.out.println("Enter the day the dog was acquired: ");
            	String acquisitionDate = scanner.nextLine();
            	
            	System.out.println("Enter the country the dog was acquired in: ");
            	String acquisitionCountry = scanner.nextLine();
            	
            	System.out.println("Enter the training status of the dog: ");
            	String trainingStatus = scanner.nextLine();
            	
            	System.out.println("The new monkey is reserved. Enter True or False: ");
            	boolean reserved = scanner.nextBoolean();
            	
            	System.out.println("Enter the service country of the dog: ");
            	String inServiceCountry = scanner.nextLine();
            	
            	Dog newDog = new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);
            	
            	dogList.add(newDog);
            	System.out.println("The dog is now in our database");
            	
            	return;
            }
        }
    }


        // Complete intakeNewMonkey
	//Instantiate and add the new monkey to the appropriate list
        // For the project submission you must also  validate the input
	// to make sure the monkey doesn't already exist and the species type is allowed
        
    	//Obtains user inputs to add new monkey to existing array
    	public static void intakeNewMonkey(Scanner scanner) {
        	System.out.println("What is the name of the monkey?");
        	String name = scanner.nextLine();
        	for(Monkey monkey: monkeyList) {
        		if(monkey.getName().equalsIgnoreCase(name)) {
        			System.out.println("\n\nThe selected monkey already exists within our system\n\n");
        			return;
        		}
        	}
        	System.out.println("What species is the monkey?");
        	String species = scanner.nextLine();
        		if(!(species.equalsIgnoreCase("Capuchin")) && !(species.equalsIgnoreCase("Guenon")) &&!(species.equalsIgnoreCase("Macaque")) && !(species.equalsIgnoreCase("Marmoset")) &&!(species.equalsIgnoreCase("Squirrel Monkey")) && !(species.equalsIgnoreCase("Tamarin"))){
        			System.out.println("\n\nWe do not accept this species\n\n");
        			return;
        			}
        	System.out.println();
        	System.out.println("What tail length does the monkey have?");
        	String tailLength = scanner.nextLine();
        	scanner.nextLine();
        	System.out.println("What height does the monkey have?");
        	String height = scanner.nextLine();
        	scanner.nextLine();
        	System.out.println("What body length does the monkey have?");
        	String bodyLength = scanner.nextLine();
        	scanner.nextLine();
        	System.out.println("What gender in the monkey?");
        	String gender = scanner.nextLine();
        	scanner.nextLine();
        	System.out.println("What age is the monkey?");
        	String age = scanner.nextLine();
        	scanner.nextLine();
        	System.out.println("What weight is the monkey?");
        	String weight = scanner.nextLine();
        	scanner.nextLine();
        	System.out.println("Enter today's date:");
        	String acquisitionDate = scanner.nextLine();
        	scanner.nextLine();
        	System.out.println("What country was the monkey acquired from?:");
        	String acquisitionCountry = scanner.nextLine();
        	scanner.nextLine();
        	System.out.println("What training level is the monkey?");
        	String trainingStatus = scanner.nextLine();
        	scanner.nextLine();
        	System.out.println("The new monkey is reserved. Enter True or False.");
        	boolean reserved = scanner.nextBoolean();
        	System.out.println("Waht country will this monkey service in?");
        	String inServiceCountry = scanner.nextLine();
        	System.out.println("The monkey is now in our database");
        	Monkey newmonkey = new Monkey(name, species, tailLength, height, bodyLength, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);
        	monkeyList.add(newmonkey);
        }

        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
        public static void reserveAnimal(Scanner scanner) {
            String searchAnimal = "";
            String searchCountry = "";
            boolean matchFound = false;
            
            System.out.println("Enter Animal's Name: ");
            scanner.nextLine();
            searchAnimal = scanner.nextLine();
            
            System.out.println("Enter Animal's Service Country: ");
            searchCountry = scanner.nextLine();
            
            for(Dog dog: dogList) {                
            	if(dog.getName().equalsIgnoreCase(searchAnimal)) {
            		
            		if(dog.getInServiceLocation().equalsIgnoreCase(searchCountry)) {
            			dog.setReserved(true);
            			matchFound = true;
            			}                
            		}
            	}
            
            for(Monkey monkey: monkeyList) {
            	if(monkey.getName().equalsIgnoreCase(searchAnimal)) {
            		
            		if(monkey.getInServiceLocation().equalsIgnoreCase(searchCountry)) {
            			monkey.setReserved(true);
            			matchFound = true;
            			}
            		}
            	}
            if(matchFound == false) {
            	System.out.println("Animal not found.");
            	return;
            	}
            else {
            	System.out.println("Animal has been reserved.");
            	return;
            	} 
            }
        

        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
	// Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
	// Remember that you only have to fully implement ONE of these lists. 
	// The other lists can have a print statement saying "This option needs to be implemented".
	// To score "exemplary" you must correctly implement the "available" list.
        public static void printAnimals(String userInput) {
            Scanner scnr = new Scanner(System.in);
            	
            		if(userInput == "4") {
            			for(Dog dog: dogList) {
            				System.out.println("Name: " + dog.getName() + ", Training Status: " + dog.getTrainingStatus() + ", Acquisition Country: "+ dog.getAcquisitionLocation() + ", Reservation Status: " + dog.getReserved());}
            			System.out.println("");
            				}
            		else if(userInput == "5") {
            			for(Monkey monkey: monkeyList) {
            				System.out.println("Name: " + monkey.getName() + ", Training Status: " + monkey.getTrainingStatus() + ", Acquisition Country: "+ monkey.getAcquisitionLocation() + ", Reservation Status: " + monkey.getReserved());
            				}
            				System.out.println("");
            				}
            		else if(userInput == "6") {
            			System.out.println("Available Dogs:");
            			for(Dog dog: dogList) {                        
            				if(dog.getTrainingStatus().equalsIgnoreCase("in service")) {
            					if(!dog.getReserved()) {
            						System.out.println("Name: " + dog.getName() + ", Training Status: " + dog.getTrainingStatus() + ", Acquisition Country: "+ dog.getAcquisitionLocation() + ", Reservation Status: " + dog.getReserved());
            						}                        
            					}
            				}
            			System.out.println("");
            			System.out.println("Available Monkeys:");
            			for(Monkey monkey: monkeyList) {                        
            				if(monkey.getTrainingStatus().equalsIgnoreCase("in service")) {
            					if(!monkey.getReserved()) {
            						System.out.println("Name: " + monkey.getName() + ", Training Status: " + monkey.getTrainingStatus() + ", Acquisition Country: "+ monkey.getAcquisitionLocation() + ", Reservation Status: " + monkey.getReserved());
            						}                        
            					}
            				}
            			System.out.println("");
            			}
            			return;
            			}
		}
            		
    

        
       


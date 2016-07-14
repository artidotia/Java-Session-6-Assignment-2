
public class ElectricGuitar extends StringedInstrument{
	
	//define constructor
	
	public ElectricGuitar(){
		super();
		this.name = "Electric Guitar";
		this.numberOfStrings = 6;
	}
	
	public ElectricGuitar(int numberOfStrings){
		super();
		this.name = "Electric Guitar";
		this.numberOfStrings = numberOfStrings;
	}
	
	//Override method in Instrument
	public void play() {
		System.out.println("You are playing a " + numberOfStrings + " strings " + name);
	}

}

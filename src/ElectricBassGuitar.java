
public class ElectricBassGuitar extends StringedInstrument{
	
	//define constructor
	
	public ElectricBassGuitar(){
		super();
		this.name = "Electric Bass Guitar";
		this.numberOfStrings = 4;
	}
	
	public ElectricBassGuitar(int numberOfStrings){
		super();
		this.name = "Electric Bass Guitar";
		this.numberOfStrings = numberOfStrings;
	}
	
	//Override method in Instrument
	public void play() {
		System.out.println("You are playing a " + numberOfStrings + " strings " + name);
	}

}

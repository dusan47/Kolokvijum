package tracProgram;

import enums.Osoba;
import enums.Trac;

public class tracBuilderImpl  implements tracBuilder{
	private Osoba OsobaX;
	private Osoba OsobaY;
	private Trac trac;
	public tracProgram build()
	{
		tracProgram program=createProgram();
		return program;
	}
	
	private tracProgram createProgram()
	{
		tracProgram program=new tracProgram();
		program.setOsobaX(OsobaX);
		program.seOsobaY(OsobaY);
		program.setTrac(trac);
		return program;
	}
	@Override
	public void izaberiOsobuX(Osoba osobaX) {
		// TODO Auto-generated method stub
		this.OsobaX=osobaX;
	}
	@Override
	public void izaberiOsobuY(Osoba osobaY) {
		// TODO Auto-generated method stub
		this.OsobaY=osobaY;
	}
	@Override
	public void izaberiTrac(Trac trac) {
		// TODO Auto-generated method stub
		this.trac=trac;
	}
	
}

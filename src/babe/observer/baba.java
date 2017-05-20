package babe.observer;

public class baba implements Observer {
	private String imeBabe;
	
	public baba(String imeBabe)
	{
		this.imeBabe=imeBabe;
	}
	
	@Override
	public void obavesti(String trac)
	{
		System.out.println(trac);
	}
}

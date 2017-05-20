package tracProgram;

import enums.Osoba;
import enums.Trac;

public class tracProgram {
 private Osoba osobaX;
 private Osoba osobaY;
 private Trac trac;
 protected void setOsobaX(Osoba osobaX)
 {
	 this.osobaX=osobaX;
 }
 protected void seOsobaY(Osoba osobaY)
 {
	 this.osobaY=osobaY;
 }
 protected void setTrac(Trac trac)
 {
	 this.trac=trac;
 }
 
 public String toString()
 {
	 StringBuilder sb = new StringBuilder();
	 sb.append(osobaX + " "+trac+ " "+osobaY);
	 return sb.toString();
 }
}

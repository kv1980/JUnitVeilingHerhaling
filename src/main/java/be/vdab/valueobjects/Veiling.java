package be.vdab.valueobjects;

public class Veiling {
	private int hoogsteBod;
	
	public void doeBod(int bedrag) {
		if (bedrag > hoogsteBod) {
			this.hoogsteBod = bedrag;
		}
	}
	
	public int getHoogsteBod() {
		return hoogsteBod;
	}
}

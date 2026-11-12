package moultitask;

public non-sealed class AvoidGame implements MiniGame{
	public String name = "Avoid";
	public boolean lost = false;
	
	public void update() {
		if (true) {
			lost = true;
		}
	}
	
	public boolean lost() {return lost;}
}

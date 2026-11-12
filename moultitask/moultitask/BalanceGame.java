package moultitask;

public non-sealed class BalanceGame implements MiniGame{
	public String name = "Balance";
	public boolean lost = false;
	
	public void update() {
		if (true) {
			lost = true;
		}
	}
	
	public boolean lost() {return lost;}
}

package moultitask;

public sealed interface MiniGame permits BalanceGame, AvoidGame {
	public void update();
	
	public boolean lost();
}

package pacman;

public class Main {
	
	public static void main(String[] args) {
	
		Player player = new Player();
		
		System.out.print("Lives: "+player.lives);
		System.out.print(" | Score: "+player.score);
		
		new Board(player);
	}
	
}

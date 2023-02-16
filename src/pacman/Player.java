package pacman;

public class Player {

	int score = 0;
	int lives = 0;
	int posX = 0;
	int posY = 0;
	
	boolean canKill = false;
	
	
	Player() {
		this.score = 0;
		this.lives = 3;
	}
	
	public void RemoveLive() {
		this.lives =- 1;
	}
	
	public void AddScore() {
		this.lives =+ 1;
	}
	
	public void MoveX() {
		posX += 1;
	}
	
	public void MoveY() {
		posY += 1;
	}
}

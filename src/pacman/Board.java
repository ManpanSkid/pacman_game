package pacman;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Board implements ActionListener{
	
	Player player;

	JFrame frame = new JFrame();
	JButton btnStartGame = new JButton("Start Game");
	
	JLabel score = new JLabel("0⚪");
	JLabel lives = new JLabel("0❤");
	
	Board(Player player) {
		
		this.player = player;
		
		btnStartGame.setBounds(150, 200, 200, 50);
		btnStartGame.setFocusable(false);
		btnStartGame.addActionListener(this);
		
		frame.add(btnStartGame);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
	
	public void StartGame() {
		System.out.print("Set COlor");

		frame.getContentPane().setBackground(Color.BLACK);
		frame.remove(btnStartGame);
		
		addText();
	}
	
	public void addText() {
		score.setBounds(480, 0, 20, 20);
		score.setFont(new Font(null, Font.PLAIN, 20));
		
		lives.setBounds(480, 20, 20, 20);
		lives.setFont(new Font(null, Font.PLAIN, 20));
		
		frame.add(score);
		frame.add(lives);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btnStartGame) {
			System.out.print("Btn click");
			
			StartGame();
		}
		
	}
	
}

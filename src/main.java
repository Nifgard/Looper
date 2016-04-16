import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;




public class main extends JPanel {
	
	rock r = new rock(this);
	
	private void move(){
		r.move();
	}
	
	public void paint(Graphics g){
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		r.paint(g2d);
		
	}
	
	public static void main(String[] args) throws InterruptedException{
		JFrame frame = new JFrame("Looper");
		main game = new main();
		frame.add(game);
		frame.setSize(400,400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		boolean isRunning = true;
		
		while(isRunning){
			game.move();
			game.repaint();
			Thread.sleep(10);
			
		}
		
		
		
	}
	
}

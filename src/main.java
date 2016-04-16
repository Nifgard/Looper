import javax.swing.JFrame;
import javax.swing.JPanel;


public class main extends JPanel {
	
	public static void main(String[] args){
		JFrame frame = new JFrame("Looper");
		main game = new main();
		frame.add(game);
		frame.setSize(400,400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		boolean isRunning = true;
		
		while(isRunning){
			
			
			game.repaint();
			
		}
		
		
		
	}
	
}

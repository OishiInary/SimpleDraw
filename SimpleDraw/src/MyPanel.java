import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class MyPanel extends JPanel implements MouseListener, MouseMotionListener {
	
	public MyPanel() {
		addMouseListener(this);
		addMouseMotionListener(this);
		setBackground(Color.WHITE);
	}
	
	public void mouseClicked(MouseEvent e) {
		Graphics g = getGraphics();
		g.setColor(new Color(
				(int) (Math.random()*256),
				(int) (Math.random()*256),
				(int) (Math.random()*256)));
		g.fillRect(e.getX() -5, e.getY()-5, 10, 10);
	}
	
	public void mouseDragged(MouseEvent e) {
		Graphics g = getGraphics();
		g.setColor(Color.BLACK);
		g.fillOval(e.getX() -2, e.getY()-2, 5, 5);
	}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseMoved(MouseEvent e) {}
	
}

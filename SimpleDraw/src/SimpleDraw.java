import javax.swing.JFrame;


public class SimpleDraw extends JFrame {

	public static void main(String[] args) {
		new SimpleDraw();
	}
	
	SimpleDraw(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().add(new MyPanel());
		setSize(600,400);
		setVisible(true);
	}

}

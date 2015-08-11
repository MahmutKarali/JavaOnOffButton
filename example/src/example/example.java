package example;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

public class example {
	private static JFrame frame = new JFrame();
	private static SwingPanel jpanel = new SwingPanel();
	public static int aas = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		frame.setBounds(500, 100, 300, 220);
		frame.setDefaultCloseOperation(3);
		frame.getContentPane().setLayout(null);

		frame.getContentPane().add(jpanel);

		jpanel.setBounds(0, 0, 500, 500);

		jpanel.swtButtonIm.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				jpanel.tryLabel.setText("IM       : " + jpanel.swtButtonIm.isSelected());
			}
		});

		jpanel.swtButtonCall.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				jpanel.tryLabel2.setText("CALL : " + jpanel.swtButtonCall.isSelected());
			}
		});

		frame.setVisible(true);
	}
}

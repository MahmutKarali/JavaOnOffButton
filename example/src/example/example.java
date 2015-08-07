package example;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

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
				jpanel.tryLabel.setText("swtButtonCall " + jpanel.swtButtonIm.isSelected());
			}
		});

		jpanel.swtButtonCall.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				jpanel.tryLabel2.setText("swtButtonIm  " + jpanel.swtButtonCall.isSelected());
			}
		});

		frame.setVisible(true);
	}
}

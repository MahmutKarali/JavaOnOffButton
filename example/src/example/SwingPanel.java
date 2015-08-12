package example;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Label;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class SwingPanel extends JPanel {
	public JLabel tryLabel, tryLabel2;
	public SwitchButton swtButtonIm;
	public SwitchButton swtButtonCall;

	private static final long serialVersionUID = 1L;

	public SwingPanel() {
		setLayout(null);

		int callBtnWidth = 150, callBtnHeight = 50;

		swtButtonCall = new SwitchButton("on", "off");
		swtButtonCall.setSelected(true);
		swtButtonCall.setBounds(129, 20, callBtnWidth, callBtnHeight);
		swtButtonCall.setFont(new Font("Arial", Font.ITALIC,40));
		add(swtButtonCall);

		// int imBtnWidth = 58, imBtnHeight = 30;
		// swtButtonIm = new SwitchButton("on", "off");
		// swtButtonIm.setSelected(true);
		// swtButtonIm.setBounds(129, 90, imBtnWidth, imBtnHeight);
		// swtButtonIm.setFont(new Font("Serif", Font.BOLD, 20));
		// add(swtButtonIm);

		tryLabel = new JLabel(" ");
		tryLabel.setBounds(75, 81, 200, 14);
		add(tryLabel);

		tryLabel2 = new JLabel(" ");
		tryLabel2.setBounds(129, 91, 200, 14);
		add(tryLabel2);

//		Label imLabel = new Label("IM");
//		imLabel.setBounds(61, 68, 62, 22);
//		add(imLabel);

		Label label = new Label("CALL");
		label.setBounds(61, 23, 62, 22);
		add(label);

	}
}
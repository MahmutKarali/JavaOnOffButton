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

		swtButtonIm = new SwitchButton("on", "off");
		swtButtonIm.setSelected(true);
		swtButtonIm.setBounds(129, 67, 89, 23);
		add(swtButtonIm);

		swtButtonCall = new SwitchButton("on", "off");
		swtButtonCall.setFont(swtButtonCall.getFont().deriveFont(50.0f));
		swtButtonCall.setSelected(true);
		swtButtonCall.setBounds(129, 23, 89, 50);
		add(swtButtonCall);

		tryLabel = new JLabel(" ");
		tryLabel.setBounds(75, 134, 200, 14);
		add(tryLabel);

		tryLabel2 = new JLabel(" ");
		tryLabel2.setBounds(75, 148, 200, 14);
		add(tryLabel2);

		Label imLabel = new Label("IM");
		imLabel.setBounds(75, 23, 62, 22);
		add(imLabel);

		Label callLabel = new Label("CALL");
		callLabel.setBounds(75, 68, 62, 22);
		add(callLabel);

	}
}
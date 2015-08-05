package example;

import javax.swing.*;
import java.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class classs extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static String IMG_PROFIL_CHOOSE;
	private JTextField txtImgPath;
	private JTextField txtFirstname;
	private JTextField txtLastname;
	private JTextField txtPhoneNumber;
	private JTextField txtEmail;
	private JLabel lblImg;
	public JButton btnSaveInfo;
	private JLabel lblLoginName;
	private JTextField txtLoginname;
	private JLabel lblLoginpassword;
	private JTextField txtLoginpassword;
	public JButton btnCheckLoginName;

	/**
	 * Create the panel.
	 * 
	 * @return
	 */
	public void PanelUserInfo() {

		setLayout(null);
		lblImg = new JLabel();
		lblImg.setBounds(80, 10, 120, 120);
		add(lblImg);
		txtImgPath = new JTextField();
		txtImgPath.setBounds(20, 140, 210, 20);
		add(txtImgPath);
		txtImgPath.setColumns(10);
		JButton btnSelectimage = new JButton("...");

		btnSelectimage.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent arg0) {

				pickImage();
			}
		});
		btnSelectimage.setBounds(240, 138, 25, 23);
		add(btnSelectimage);
		JLabel lblFirstname = new JLabel("FirstName");
		lblFirstname.setBounds(20, 181, 85, 14);
		add(lblFirstname);
		txtFirstname = new JTextField();
		txtFirstname.setBounds(116, 177, 150, 20);
		add(txtFirstname);
		txtFirstname.setColumns(10);
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(20, 211, 85, 14);
		add(lblLastName);
		txtLastname = new JTextField();
		txtLastname.setBounds(116, 209, 150, 20);
		add(txtLastname);
		txtLastname.setColumns(10);
		JLabel lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setBounds(20, 241, 85, 14);
		add(lblPhoneNumber);
		txtPhoneNumber = new JTextField();
		txtPhoneNumber.setBounds(116, 239, 150, 20);
		add(txtPhoneNumber);
		txtPhoneNumber.setColumns(10);
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(20, 272, 85, 14);
		add(lblEmail);
		txtEmail = new JTextField();
		txtEmail.setBounds(116, 269, 150, 20);
		add(txtEmail);
		txtEmail.setColumns(10);
		btnSaveInfo = new JButton("Save Info");
		btnSaveInfo.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {

			}
		});
		btnSaveInfo.setBounds(160, 521, 105, 23);
		add(btnSaveInfo);
		lblLoginName = new JLabel("Login Name");
		lblLoginName.setBounds(20, 302, 85, 14);
		add(lblLoginName);
		txtLoginname = new JTextField();
		txtLoginname.setBounds(116, 300, 150, 20);
		add(txtLoginname);
		txtLoginname.setColumns(10);
		lblLoginpassword = new JLabel("LoginPassword");
		lblLoginpassword.setBounds(20, 332, 100, 14);
		add(lblLoginpassword);
		txtLoginpassword = new JTextField();
		txtLoginpassword.setBounds(116, 330, 150, 20);
		add(txtLoginpassword);
		txtLoginpassword.setColumns(10);
		btnCheckLoginName = new JButton("Check LoginName");
		btnCheckLoginName.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {

			}
		});
		btnCheckLoginName.setBounds(16, 521, 140, 23);
		add(btnCheckLoginName);
	}

	public void setUserInfo(/*UserInfo userInfo*/) {

		/*lblImg.setIcon(OperationsImage.getResizedIcon(OperationsImage.getIcon(ReaderConstants.IMG_PROFIL), 120, 120));
		txtImgPath.setText(userInfo.userPhotoPath);
		txtFirstname.setText(userInfo.firstName);
		txtLastname.setText(userInfo.lastName);
		txtPhoneNumber.setText(userInfo.phoneNumber);
		txtEmail.setText(userInfo.email);
		txtLoginname.setText(userInfo.userLoginName);
		txtLoginpassword.setText(userInfo.userLoginPassword);*/
	}

	/*public UserInfo getUserInfo() {

		UserInfo userInfo = new UserInfo();
		userInfo.userPhotoPath = txtImgPath.getText();
		userInfo.firstName = txtFirstname.getText();
		userInfo.lastName = txtLastname.getText();
		userInfo.phoneNumber = txtPhoneNumber.getText();
		userInfo.email = txtEmail.getText();
		userInfo.userLoginName = txtLoginname.getText();
		userInfo.userLoginPassword = txtLoginpassword.getText();
		return userInfo;
	}*/

	public void pickImage() {
	
		/*JFileChooser fileChooser = new JFileChooser();
		IMG_PROFIL_CHOOSE = OperatixonsImage.pickPath(fileChooser);
		if (IMG_PROFIL_CHOOSE == null) IMG_PROFIL_CHOOSE = ReaderConstants.IMG_PROFIL;
		txtImgPath.setText(IMG_PROFIL_CHOOSE);
		lblImg.setIcon(OperationsImage.getResizedIcon(OperationsImage.getIcon(IMG_PROFIL_CHOOSE), 120, 120));*/
	}
}
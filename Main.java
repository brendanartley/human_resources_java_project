package gitUpload;

import java.awt.Button;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

public class Main {
	
	private static JFrame frame;
	private static JFrame welcFrame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField name_text_field;
	private JTextField email_text_field;

	public static void main(String[] args) throws Exception {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					welcomeScreen();
					welcFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void welcomeScreen() {
		welcFrame = new JFrame();
		welcFrame.setBounds(100, 100, 450, 300);
		welcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		welcFrame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Brendan's Company Application Portal");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblNewLabel.setBounds(6, 6, 438, 40);
		welcFrame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Start");
		btnNewButton.setBounds(166, 243, 117, 29);
		welcFrame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
//		SPECIFY THE IMAGE LOCATION HERE (need to do in WelcomeWindow.java as well)
		lblNewLabel_1.setIcon(new ImageIcon("....../hand-shake.png"));
		lblNewLabel_1.setBounds(107, 47, 240, 146);
		welcFrame.getContentPane().add(lblNewLabel_1);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				welcFrame.dispose();
				frame.setVisible(true);
				
			}
		});
	}
	
	public Main() {
		initialize();
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 200, 700, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(22, 51, 343, 131);
		frame.getContentPane().add(scrollPane);
		
		final JEditorPane hire_edit_pane = new JEditorPane();
		scrollPane.setViewportView(hire_edit_pane);
		
		JLabel lblNewLabel = new JLabel("Gender");
		lblNewLabel.setBounds(395, 83, 61, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(455, 79, 61, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(531, 79, 80, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Other");
		rdbtnNewRadioButton_2.setSelected(true);
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(623, 79, 67, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setBounds(395, 51, 42, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		name_text_field = new JTextField();
		name_text_field.setBounds(455, 46, 219, 26);
		frame.getContentPane().add(name_text_field);
		name_text_field.setColumns(10);
		
		final JComboBox<String> positionComboBox = new JComboBox<String>();
		positionComboBox.addItem("General Application");
		positionComboBox.addItem("Marketing Specialist");
		positionComboBox.addItem("Business Analyst");
		positionComboBox.addItem("Human Resource Personnel");
		positionComboBox.addItem("Customer Service Representative");
		positionComboBox.addItem("Administrative Assistant");
		positionComboBox.addItem("IT Manager");
		positionComboBox.addItem("Graphic Designer");
		positionComboBox.addItem("Laborer");
		positionComboBox.setBounds(395, 194, 295, 27);
		frame.getContentPane().add(positionComboBox);
		
		JLabel lblNewLabel_3 = new JLabel("Which Position are you Applying for?");
		lblNewLabel_3.setBounds(395, 166, 295, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Highest Level of Education Obtained?");
		lblNewLabel_4.setBounds(395, 233, 240, 16);
		frame.getContentPane().add(lblNewLabel_4);
		
		final JComboBox<String> educationComboBox = new JComboBox<String>();
		educationComboBox.addItem("High School Diploma/GED");
		educationComboBox.addItem("Technical/Trade School Certificate/Diploma");
		educationComboBox.addItem("Associates Degree");
		educationComboBox.addItem("Bachelors Degree");
		educationComboBox.addItem("Masters Degree");
		educationComboBox.addItem("PHD");
		
		educationComboBox.setBounds(395, 261, 295, 27);
		frame.getContentPane().add(educationComboBox);
		
		JLabel lblNewLabel_5 = new JLabel("Years of experience in this type of position?");
		lblNewLabel_5.setBounds(395, 300, 295, 16);
		frame.getContentPane().add(lblNewLabel_5);
		
		final JComboBox<String> experienceComboBox = new JComboBox<String>();
		experienceComboBox.addItem("0-1");
		experienceComboBox.addItem("1-3");
		experienceComboBox.addItem("3-5");
		experienceComboBox.addItem("5-7");
		experienceComboBox.addItem("7+");
		experienceComboBox.setBounds(395, 328, 295, 27);
		frame.getContentPane().add(experienceComboBox);
		
		final JLabel email_label = new JLabel("Email");
		email_label.setBounds(395, 116, 42, 16);
		frame.getContentPane().add(email_label);
		
		email_text_field = new JTextField();
		email_text_field.setBounds(455, 111, 219, 26);
		frame.getContentPane().add(email_text_field);
		email_text_field.setColumns(10);
		
		final JLabel why_hire_label = new JLabel("Why should we hire you for this position?");
		why_hire_label.setBounds(22, 23, 274, 16);
		frame.getContentPane().add(why_hire_label);
		
		JLabel passionate_q_label = new JLabel("What are you passionate about? ");
		passionate_q_label.setBounds(22, 194, 343, 16);
		frame.getContentPane().add(passionate_q_label);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(22, 222, 343, 138);
		frame.getContentPane().add(scrollPane_1);
		
		final JEditorPane passion_edit_pane = new JEditorPane();
		scrollPane_1.setViewportView(passion_edit_pane);
		
		Button submit_button = new Button("Submit");
		submit_button.setBounds(573, 389, 117, 29);
		frame.getContentPane().add(submit_button);
		submit_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(frame,"Are you sure you have filled out the form and are ready to submit?");
				if(a==JOptionPane.YES_OPTION){
					try {
//						need to check if all fields are completed before I send the email here
//						I also need to send an email to another account where the application info goes.
						applicationContent appContent = new applicationContent(name_text_field.getText(), getSelectedButtonText(buttonGroup), positionComboBox.getSelectedItem().toString(),
								educationComboBox.getSelectedItem().toString(), experienceComboBox.getSelectedItem().toString(), hire_edit_pane.getText(), passion_edit_pane.getText());
//						sending a thanks for applying email to applicant
						JavaMail.sendMail(email_text_field.getText(), appContent.getEmailSubject(), appContent.getThankYou());
//						sending an application email to the human resources department here 
//						ENTER HUMAN RESOURCE EMAIL IN THIS CELL AS WELL
						JavaMail.sendMail("myemail@gmail.com", appContent.getEmailSubject(), appContent.toString());
//						adding a application successfully submitted frame here
						JOptionPane.showConfirmDialog(frame,"Application submitted!", null, JOptionPane.DEFAULT_OPTION);
					    frame.dispose();
					}
					catch(Exception ex){
						System.out.println("error.... email not sent");
						JOptionPane.showMessageDialog(email_label, "error... please enter a valid email", "Error 2718: Eulers Error", a);
					}
				}
			}
		});
	}
	
	  public String getSelectedButtonText(ButtonGroup buttonGroup) {
	        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
	            AbstractButton button = buttons.nextElement();

	            if (button.isSelected()) {
	                return button.getText();
	            }
	        }

	        return null;
	    }
}


package gitUpload;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SubmittedWindow {

	private JFrame submitWindow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SubmittedWindow window = new SubmittedWindow();
					window.submitWindow.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SubmittedWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		submitWindow = new JFrame();
		submitWindow.setBounds(100, 100, 450, 300);
		submitWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		submitWindow.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Application Submitted!");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(71, 45, 300, 26);
		submitWindow.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				submitWindow.dispose();
			}
		});
		btnNewButton.setBounds(166, 124, 117, 29);
		submitWindow.getContentPane().add(btnNewButton);
	}
}

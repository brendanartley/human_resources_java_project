//specify image location on local hard drive if you would like to see an icon on the Welcome frame (line 68ish) 

package gitUpload;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class WelcomeWindow {
	
	private JFrame WelcFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeWindow window = new WelcomeWindow();
					window.WelcFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WelcomeWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		WelcFrame = new JFrame();
		WelcFrame.setBounds(100, 100, 450, 300);
		WelcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		WelcFrame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Brendan's Company Application Portal");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblNewLabel.setBounds(6, 6, 438, 40);
		WelcFrame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Start");
		btnNewButton.setBounds(166, 243, 117, 29);
		WelcFrame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
//		SPECIFY THE LOCATION OF THE IMAGE USED ON WELCOME SCREEN (also need to do so in main.java file as well)
		lblNewLabel_1.setIcon(new ImageIcon("...../copy-hand-shake.png"));
		lblNewLabel_1.setBounds(107, 47, 240, 146);
		WelcFrame.getContentPane().add(lblNewLabel_1);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WelcFrame.dispose();
				
			}
		});	
	}
}

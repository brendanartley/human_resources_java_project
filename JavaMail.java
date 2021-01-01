package gitUpload;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class JavaMail {

	public static void sendMail(String recipient, String subjectText, String messageText) throws Exception {
		System.out.println("Preparing to send email...");
		Properties properties = new Properties();
		
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "587");
		
//		ENTER EMAIL AND PASSWORD IN VARIABLES BELOW
//		- you will also have to go into account security, and turn less secure application access to on.
//		- If you are using a non google email, change smtp port host.
		final String myAccountEmail = "myemail@gmail.com";
		final String password = "12345";
		
		Session session = Session.getInstance(properties, new Authenticator() {
			
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(myAccountEmail, password);
			}
		});
		Message message = prepareMessage(session, myAccountEmail, recipient, messageText, subjectText);
		
		Transport.send(message);
		System.out.println("Message was succesful!");
	}
	
	public static Message prepareMessage(Session session, String myAccountEmail, String Recipient, String messageText, String subjectText) {
		
		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(myAccountEmail));
			message.setRecipient(Message.RecipientType.TO, new InternetAddress(Recipient));
			message.setSubject(subjectText);
			message.setText(messageText);
			return message;
		}
		catch (Exception ex) {
			Logger.getLogger(JavaMail.class.getName()).log(Level.SEVERE, null, ex);
			
		}
		return null;
		
		
	}

}
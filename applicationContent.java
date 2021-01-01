package gitUpload;

public class applicationContent {
	private String name;
	private String gender;
	private String position;
	private String education;
	private String experienceInPosition;
	private String whyHire;
	private String passion;
	
	public applicationContent(String initName, String initGender, String initPosition,
			String initEducation, String initExperienceInPosition, String initWhyHire, String initPassion) {
		
		this.name = initName;
		this.gender = initGender;
		this.position = initPosition;
		this.education = initEducation;
		this.experienceInPosition = initExperienceInPosition;
		this.whyHire = initWhyHire;
		this.passion = initPassion;
		
		if (this.name.equals("")) {
			this.name = "No Name";
			}
		if (this.whyHire.equals("")) {
			this.whyHire = "N/A";
			}
		if (this.passion.equals("")) {
			this.passion = "N/A";
			}
		
		
	}
	
	public String toString() {
		
		return (name + "\n" + gender + "\n" + education + "\n" + experienceInPosition + "\n\nWhy hire me?\n\n"
				+ whyHire + "\n\nWhat am I passionate about?\n\n" + passion);
	}
	
	public String getEmailSubject() {
		return(position + " - " + name ); 
	}
	
	public String getThankYou() {
		return (String.format("Dear %s, \n\nThank you for your interest in working with Brendan's Company."
				+ "\n\nYour application has been received and we would like to thank you for taking the time to apply."
				+ " Once the posting closes we will contact you should you be shortlisted for an interview. \n\n"
				+ "Thanks,\nBC Human Resources \n\n ***Please do no respond to this email. "
				+ "This is an unnattended mailbox and your message will not be read***", name));
	}

}

# human_resources_java_project

This project was made in Eclipse IDE and was a Maven Project with dependencies.

I created a GUI which acts as a job application form. When the applicant fills out all of their information and hits the submit button, they are prompted to confirm their application, and it is then submitted. There are methods in place to ensure that the form is filled out correctly, with a valid email address. If the form does not meet these requirements an error pop-ups notifying them of changes that need to be made. 

Once the application is correctly inputted and a valid email is entered the applicant receives an automated customized message thanking them for applying and notifying them that they will be contacted should they be shortlisted for an interview... This message can obviously be customized within the source code.

Their application information is sent to what would be an HR email address where different jobs will be tagged with a different subject heading. This makes it easy to post multiple jobs in the dropdown menu of the application and have all applications completed through the same java app. 

### Important: 

1. Check each java file and comments on top of the code for edits needed to make this run locally on your system.

2. I built this application in eclipse with JDK 1.5, if you plan to build the maven project you will have to specify the specific JDK version you are running in the properties tag in pom.xml

package Controllers;
public class Driver {

	public static void main(String[] args) {
		LongTermController theControl = new LongTermController();
		boolean login = theControl.login("pohmann", "secure");
		boolean added = theControl.addPatient("Dr. Ohmann", "Peter");
		System.out.println("Logged in? " + login);
		System.out.println("Patient added? " + added);
	}

}

package Users;
import java.util.ArrayList;
import java.util.List;

public class Doctor {
	private String username;
	private String password;
	private List<Patient> patients;

	public Doctor(String username, String password) {
		this.username = username;
		this.password = password;
		this.patients = new ArrayList<Patient>();
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public boolean addPatient(Patient p) {
		if (patients.contains(p)) {
			return false;
		}
		else {
			patients.add(p);
			return true;
		}
	}

}

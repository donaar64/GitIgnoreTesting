package Controllers;

import java.util.List;

import Users.Doctor;
import Users.Patient;

public class LongTermController {
	private DBController db;

	public LongTermController() {
		db = new DBController();
	}
	
	public boolean addPatient(String doctor, String patient) {
		List<Doctor> allDocs = db.getAllDoctors();
		for (Doctor doc : allDocs) {
			if (doc.getUsername().equals(doctor)) {
				Patient p = db.getPatientByName(patient);
				// TODO: what happens if the patient is not found?
				return doc.addPatient(p);
			}
		}
		return false;
	}

	public boolean login(String username, String password) {
		List<Doctor> allUsers = db.getAllDoctors();
		for (Doctor d : allUsers) {
			if (d.getUsername().equals(username) &&
					d.getPassword().equals(password))
				return true;
		}
		
		return false;
	}

}

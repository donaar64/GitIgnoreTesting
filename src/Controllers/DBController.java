package Controllers;
import java.util.ArrayList;
import java.util.List;

import Users.Doctor;
import Users.Patient;

public class DBController {

	public DBController() {
		// TODO connect to the database!
	}
	
	public List<Doctor> getAllDoctors() {
		// TODO this should actually return the doctors from the DB!
		return new ArrayList<Doctor>();
	}
	
	public boolean updateDoctor(Doctor d) {
		// TODO store the updated data in "d" back in the DB!
		return true;
	}
	
	public Patient getPatientByName(String name) {
		// TODO get the Patient object matching the provided name,
		//      or "null" if not present
		return null;
	}

}

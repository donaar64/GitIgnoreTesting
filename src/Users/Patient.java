package Users;
import java.util.Date;

public class Patient {
	private String name;
	private Date dob;

	public Patient(String name, Date dob) {
		this.setName(name);
		this.setDob(dob);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

}

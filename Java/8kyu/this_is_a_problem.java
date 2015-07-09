public class NameMe {
	String firstName;
	String lastName;
	String fullName;

	public NameMe(String first, String last) {
		this.firstName = first;
		this.lastName = last;
		this.fullName = first + " " + last;
	}
	public String getFirstName() {
		return firstName;
	};
	public String getLastName() {
		return lastName;
	};
	public String getFullName() {
		return fullName;
	};
}
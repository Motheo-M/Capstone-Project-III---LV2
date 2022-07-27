public class Persons {

    // Attributes
    private String name;
    private String telephoneNumber;
    private String email;
    private String physicalAddress;

    // Persons Constructor
    public Persons(String name, String telephoneNumber, String email, String physicalAddress){
        this.setName(name);
        this.setTelephoneNumber(telephoneNumber);
        this.setEmail(email);
        this.setPhysicalAddress(physicalAddress);
    }

    // Setters and getters for each attribute
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhysicalAddress() {
        return physicalAddress;
    }

    public void setPhysicalAddress(String physicalAddress) {
        this.physicalAddress = physicalAddress;
    }

    // toString method
    public String toString() {
        String output = this.getName() + ", ";
        output += this.getTelephoneNumber() + ", ";
        output += this.getEmail() + ", ";
        output += this.getPhysicalAddress();

        return output;
    }
}
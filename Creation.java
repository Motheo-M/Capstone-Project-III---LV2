public class Creation {

    // Attributes
    private String projectName;
    private String projectNumber;
    private String building;
    private String physicalAddress;
    private String erf;
    private String totalFee;
    private String paidToDate;
    private String deadline;
    private String complete;
    private String architectName;
    private String architectTelephoneNumber;
    private String architectEmail;
    private String architectPhysicalAddress;
    private String contractorName;
    private String contractorTelephoneNumber;
    private String contractorEmail;
    private String contractorPhysicalAddress;
    private String customerName;
    private String customerTelephoneNumber;
    private String customerEmail;
    private String customerPhysicalAddress;


    // Creation Constructor
    public Creation (String projectName, String projectNumber, String building, String physicalAddress, String erf,
    String totalFee, String paidToDate, String deadline, String complete, String architectName,
    String architectTelephoneNumber, String architectEmail, String architectPhysicalAddress,
    String contractorName, String contractorTelephoneNumber, String contractorEmail, String contractorPhysicalAddress,
    String customerName, String customerTelephoneNumber, String customerEmail, String customerPhysicalAddress) {
        this.setProjectName(projectName);
        this.setProjectNumber(projectNumber);
        this.setBuilding(building);
        this.setPhysicalAddress(physicalAddress);
        this.setERF(erf);
        this.setTotalFee(totalFee);
        this.setPaidToDate(paidToDate);
        this.setDeadline(deadline);
        this.setComplete(complete);
        this.setArchitectName(architectName);
        this.setArchitectTelephoneNumber(architectTelephoneNumber);
        this.setArchitectEmail(architectEmail);
        this.setArchitectPhysicalAddress(architectPhysicalAddress);
        this.setContractorName(contractorName);
        this.setContractorTelephoneNumber(contractorTelephoneNumber);
        this.setContractorEmail(contractorEmail);
        this.setContractorPhysicalAddress(contractorPhysicalAddress);
        this.setCustomerName(customerName);
        this.setCustomerTelephoneNumber(customerTelephoneNumber);
        this.setCustomerEmail(customerEmail);
        this.setCustomerPhysicalAddress(customerPhysicalAddress);

    }

    // Setters and getters for each attribute

    /* Project Building Setters and Getters */

    // Getter method for the ProjectName
    public String getProjectName() {
        return projectName;
    }

    // Setter method for the ProjectName
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    // Getter method for the ProjectNumber
    public String getProjectNumber() {
        return projectNumber;
    }

    // Setter method for the ProjectNumber
    public void setProjectNumber(String projectNumber) {
        this.projectNumber = projectNumber;
    }

    // Getter method for the Building
    public String getBuilding() {
        return building;
    }

    // Setter method for the Building
    public void setBuilding(String building) {
        this.building = building;
    }

    // Getter method for the PhysicalAddress
    public String getPhysicalAddress() {
        return physicalAddress;
    }

    // Setter method for the PhysicalAddress
    public void setPhysicalAddress(String physicalAddress) {
        this.physicalAddress = physicalAddress;
    }

    // Getter method for the ERF
    public String getERF() {
        return erf;
    }

    // Setter method for the ERF
    public void setERF(String erf) {
        this.erf = erf;
    }

    // Getter method for the TotalFee
    public String getTotalFee() {
        return totalFee;
    }

    // Setter method for the TotalFee
    public void setTotalFee(String totalFee) {
        this.totalFee = totalFee;
    }

    // Getter method for the Paid_to_date
    public String getPaidToDate() {
        return paidToDate;
    }

    // Setter method for the Paid_to_date
    public void setPaidToDate(String paidToDate) {
        this.paidToDate = paidToDate;
    }

    // Getter method for the Deadline
    public String getDeadline() {
        return deadline;
    }

    // Setter method for the Deadline
    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    // Getter method for the Deadline
    public String getComplete() {
        return complete;
    }

    // Setter method for the Deadline
    public void setComplete(String complete) {
        this.complete = complete;
    }

    /*Architect*/

    // Getter method for the Name
    public String getArchitectName() {
        return architectName;
    }

    // Setter method for the Name
    public void setArchitectName(String name) {
        this.architectName = name;
    }

    // Getter method for the TelephoneNumber
    public String getArchitectTelephoneNumber() {
        return architectTelephoneNumber;
    }

    // Setter method for the TelephoneNumber
    public void setArchitectTelephoneNumber(String telephoneNumber) {
        this.architectTelephoneNumber = telephoneNumber;
    }

    // Getter method for the Email
    public String getArchitectEmail() {
        return architectEmail;
    }

    // Setter method for the Email
    public void setArchitectEmail(String email) {
        this.architectEmail = email;
    }

    // Getter method for the PhysicalAddress
    public String getArchitectPhysicalAddress() {
        return architectPhysicalAddress;
    }

    // Setter method for the PhysicalAddress
    public void setArchitectPhysicalAddress(String physicalAddress) {
        this.architectPhysicalAddress = physicalAddress;
    }


    /* Contractor Setters and Getters */

    // Getter method for the Name
    public String getContractorName() {
        return contractorName;
    }

    // Setter method for the Name
    public void setContractorName(String name) {
        this.contractorName = name;
    }

    // Getter method for the TelephoneNumber
    public String getContractorTelephoneNumber() {
        return contractorTelephoneNumber;
    }

    // Setter method for the TelephoneNumber
    public void setContractorTelephoneNumber(String telephoneNumber) {
        this.contractorTelephoneNumber = telephoneNumber;
    }

    // Getter method for the Email
    public String getContractorEmail() {
        return contractorEmail;
    }

    // Setter method for the Email
    public void setContractorEmail(String email) {
        this.contractorEmail = email;
    }

    // Getter method for the PhysicalAddress
    public String getContractorPhysicalAddress() {
        return contractorPhysicalAddress;
    }

    // Setter method for the PhysicalAddress
    public void setContractorPhysicalAddress(String physicalAddress) {
        this.contractorPhysicalAddress = physicalAddress;
    }


    /* Customer Setters and Getters */

    // Getter method for the Name
    public String getCustomerName() {
        return customerName;
    }

    // Setter method for the Name
    public void setCustomerName(String name) {
        this.customerName = name;
    }

    // Getter method for the TelephoneNumber
    public String getCustomerTelephoneNumber() {
        return customerTelephoneNumber;
    }

    // Setter method for the TelephoneNumber
    public void setCustomerTelephoneNumber(String telephoneNumber) {
        this.customerTelephoneNumber = telephoneNumber;
    }

    // Getter method for the Email
    public String getCustomerEmail() {
        return customerEmail;
    }

    // Setter method for the Email
    public void setCustomerEmail(String email) {
        this.customerEmail = email;
    }

    // Getter method for the PhysicalAddress
    public String getCustomerPhysicalAddress() {
        return customerPhysicalAddress;
    }

    // Setter method for the PhysicalAddress
    public void setCustomerPhysicalAddress(String physicalAddress) {
        this.customerPhysicalAddress = physicalAddress;
    }


    // toString method
    public String toString() {
        String output = "\nProject Name: " + getProjectName();
        output += "\nProject Number: " + getProjectNumber();
        output += "\nBuilding: " + getBuilding();
        output += "\nPhysical Address of project: " + getPhysicalAddress();
        output += "\nERF: " + getERF();
        output += "\nTotal Fee: " + getTotalFee();
        output += "\nFee paid to date: " + getPaidToDate();
        output += "\nDeadline: " + getDeadline();
        output += "\nCompleted: " + getComplete();
        output += "\nName - (Architect): " + getArchitectName();
        output += "\nTelephone - (Architect): " + getArchitectTelephoneNumber();
        output += "\nEmail - (Architect): " + getArchitectEmail();
        output += "\nPhysical Address - (Architect): " + getArchitectPhysicalAddress();
        output += "\nName - (Contractor): " + getContractorName();
        output += "\nTelephone - (Contractor): " + getContractorTelephoneNumber();
        output += "\nEmail - (Contractor): " + getContractorEmail();
        output += "\nPhysical Address - (Contractor): " + getContractorPhysicalAddress();
        output += "\nName - (Customer): " + getCustomerName();
        output += "\nTelephone - (Customer): " + getCustomerTelephoneNumber();
        output += "\nEmail - (Customer): " + getCustomerEmail();
        output += "\nPhysical Address - (Customer): " + getCustomerPhysicalAddress();
        output += "\n";
        return output;
    }
}

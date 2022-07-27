public class Project {

    // Attributes
    private String projectNumber;
    private String projectName;
    private String building;
    private String physicalAddress;
    private String erf;
    private String totalFee;
    private String paidToDate;
    private String deadline;
    private String complete;

    // Project Constructor
    public Project (String projectName, String projectNumber, String building, String physicalAddress, String erf,
                 String totalFee, String paidToDate, String deadline, String complete) {
        this.setProjectName(projectName);
        this.setProjectNumber(projectNumber);
        this.setBuilding(building);
        this.setPhysicalAddress(physicalAddress);
        this.setERF(erf);
        this.setTotalFee(totalFee);
        this.setPaidToDate(paidToDate);
        this.setDeadline(deadline);
        this.setComplete(complete);
    }

    // Setters and getters for each attribute

    // Getter method for the ProjectNumber
    public String getProjectNumber() {
        return projectNumber;
    }

    // Setter method for the ProjectNumber
    public void setProjectNumber(String projectNumber) {
        this.projectNumber = projectNumber;
    }

    // Getter method for the ProjectName
    public String getProjectName() {
        return projectName;
    }

    // Setter method for the ProjectName
    public void setProjectName(String projectName) {
        this.projectName = projectName;
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

    // toString method
    public String toString(){
        return getProjectName() + ", " + getProjectNumber() + ", " + getBuilding() + ", "
                + getPhysicalAddress() + ", " + getERF() + ", " + getTotalFee() +
                ", " + getPaidToDate() + ", " + getDeadline() + ", " + getComplete() + ", ";
    }
}

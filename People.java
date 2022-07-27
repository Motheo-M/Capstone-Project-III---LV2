public class People {

    // Attributes
    private Persons architect;
    private Persons contractor;
    private Persons customer;

    // People Constructor
    public People(Persons architect, Persons contractor, Persons customer){
        this.setArchitect(architect);
        this.setContractor(contractor);
        this.setCustomer(customer);
    }


    // Setters and getters for each attribute
    public Persons getArchitect() {
        return architect;
    }

    public void setArchitect(Persons architect) {
        this.architect = architect;
    }

    public Persons getContractor() {
        return contractor;
    }

    public void setContractor(Persons contractor) {
        this.contractor = contractor;
    }

    public Persons getCustomer() {
        return customer;
    }

    public void setCustomer(Persons customer) {
        this.customer = customer;
    }

    // toString method
    public String toString() {
        String output = String.valueOf(this.getArchitect());
        output += ", " + this.getContractor();
        output += ", " + this.getCustomer();
        return output;
    }
}

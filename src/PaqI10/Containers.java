package PaqI10;

public class Containers {
    int identifier;
    int weight;
    String countryOrigin;
    boolean customs;
    int priority;
    String description;
    String companySend;
    String companyReceives;

    public Containers(int identifier, int weight, String countryOrigin, boolean customs, int priority, String description, String companySend, String companyReceives) {
        this.identifier = identifier;
        this.weight = weight;
        this.countryOrigin = countryOrigin;
        this.customs = customs;
        this.priority = priority;
        this.description = description;
        this.companySend = companySend;
        this.companyReceives = companyReceives;
    }

    public Containers(){}

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getCountryOrigin() {
        return countryOrigin;
    }

    public void setCountryOrigin(String countryOrigin) {
        this.countryOrigin = countryOrigin;
    }

    public boolean isCustoms() {
        return customs;
    }

    public void setCustoms(boolean customs) {
        this.customs = customs;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCompanySend() {
        return companySend;
    }

    public void setCompanySend(String companySend) {
        this.companySend = companySend;
    }

    public String getCompanyReceives() {
        return companyReceives;
    }

    public void setCompanyReceives(String companyReceives) {
        this.companyReceives = companyReceives;
    }

    @Override
    public String toString() {
        return "Containers{" +
                "\nidentifier=" + identifier +
                ", \nweight=" + weight +
                ", \ncountryOrigin='" + countryOrigin + '\'' +
                ", \ncustoms=" + customs +
                ", \npriority=" + priority +
                ", \ndescription='" + description + '\'' +
                ", \ncompanySend='" + companySend + '\'' +
                ", \ncompanyReceives='" + companyReceives + '\'' +
                '}';
    }

    public String reducedToString(){//We will use it once we change the custom
        return "Containers{" +
                "\nidentifier=" + identifier +
                ", \nweight=" + weight +
                ", \ncompanySend='" + companySend + '\'' +
                ", \ncustoms=" + customs + "}";
    }
}

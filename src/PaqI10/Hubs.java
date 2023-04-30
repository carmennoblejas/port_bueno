package PaqI10;

import java.util.Arrays;

public class Hubs {
    Containers[][] hub = new Containers[10][12];

    //We divide it in three sections, first column dedicated to store containers with priority 1, the second column is
    //for containers with priority 2, and the rest for priority 3.

    public Hubs() {
    }

    public Hubs(Containers[][] hub) {
        this.hub = hub;
    }

    public Containers[][] getHub() {
        return hub;
    }

    public void setHub(Containers[][] hub) {
        this.hub = hub;
    }

    public String toString() {
        return "Hubs{" +
                "hub=" + hub.toString() +
                '}';
    }

    public void emptyhub() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 12; j++) {
                if (this.hub[i][j] == null) {
                    this.hub[i][j].identifier = -1;
                    this.hub[i][j].description = "Empty";
                    this.hub[i][j].priority = 0;
                    this.hub[i][j].weight = 0;
                    this.hub[i][j].countryOrigin = "None";
                    this.hub[i][j].companySend = "None";
                    this.hub[i][j].companyReceives = "None";
                    this.hub[i][j].customs = false;
                } else {
                    this.hub[i][j].identifier = -1;
                    this.hub[i][j].description = "Empty";
                    this.hub[i][j].priority = 0;
                    this.hub[i][j].weight = 0;
                    this.hub[i][j].countryOrigin = "None";
                    this.hub[i][j].companySend = "None";
                    this.hub[i][j].companyReceives = "None";
                    this.hub[i][j].customs = false;
                }
            }
        }
    }

    public boolean setContainer(Containers cont) {
        if (cont == null) {
            System.out.println("Container cannot be null");
        }
        if (cont.priority == 1) {
            for (int i = 9; i >= 0; i--) {
                if (hub[i][0] == null) {
                    hub[i][0] = cont;
                    System.out.println("Successful");
                    return true;
                }
            }
            return false;
        } else if (cont.priority == 2) {
            for (int i = 9; i >= 0; i--) {
                if (hub[i][1] == null) {
                    hub[i][1] = cont;
                    System.out.println("Successful");
                    return true;
                }
            }
            return false;
        } else if (cont.priority == 3) {
            for (int i = 2; i < 12; i++) {
                for (int j = 9; j >= 0; j--) {
                    if (hub[j][i] == null) {
                        hub[j][i] = cont;
                        System.out.println("Successful");
                        return true;
                    }
                }
            }
        }
        return false;
    }


    public boolean delete_container(int column) {
        for (int i = 0; i < 10; i++) {
            if (hub[i][column - 1] != null) {
                hub[i][column - 1] = null;
                System.out.println("Unstack successful");
                return true;
            }
        }
        System.out.println("There are no containers in this column");
        return false;
    }

    public String printHub() { //toString method we can use this or the one created with the Array toString
        StringBuilder stringHub = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 12; j++) {
                if (hub[i][j] == null) {
                    stringHub.append("F ");//Free
                } else if (hub[i][j] != null) {
                    stringHub.append("O ");//Ocupated
                }
            }
            stringHub.append("\n");
        }
        return stringHub.toString();
    }

    public static void printHub(Containers[][] hub) { //toString method we can use this or the one created with the Array toString
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 12; j++) {
                if (hub[i][j] == null) {
                    System.out.printf("F\t");
                } else if (hub[i][j] != null) {
                    System.out.printf("O\t");
                }

            }
            System.out.printf("\n");
        }
    }

    public String showDescription(int ID) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 12; j++) {
                if (hub[i][j] != null && hub[i][j].getIdentifier() == ID)
                    return hub[i][j].toString();
            }
        }
        return "There is no container with ID " + ID;
    }

    public int countContainers(String country){
        int counter=0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 12; j++) {
                if(hub[i][j] != null && hub[i][j].getCountryOrigin() == country){
                    counter++;
                }
            }
        }
        return counter;
    }

}



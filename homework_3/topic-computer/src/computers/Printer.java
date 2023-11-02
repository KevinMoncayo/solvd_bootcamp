

public class Printer {
    //Attributes
    private String typePrinter = "laserPrinter";

    //Getters and Setters
    public String getTypePrinter() {
        return typePrinter;
    }

    public void setTypePrinter(String typePrinter) {
        this.typePrinter = typePrinter;
    }

    //Constructor
    public Printer(String typePrinter) {
        this.typePrinter = typePrinter;
    }
}

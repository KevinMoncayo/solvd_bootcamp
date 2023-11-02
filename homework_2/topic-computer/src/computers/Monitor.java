

public class Monitor {
    //Attributes
    private String monitorBrand = "Samsung";
    private int size = 32;
    //Getters and Setters
    public String getMonitorBrand() {
        return monitorBrand;
    }

    public void setMonitorBrand(String monitorBrand) {
        this.monitorBrand = monitorBrand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    //Constructor
    public Monitor(String monitorBrand, int size) {
        this.monitorBrand = monitorBrand;
        this.size = size;
    }
}

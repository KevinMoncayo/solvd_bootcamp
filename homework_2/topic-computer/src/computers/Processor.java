

public class Processor {
    //Attributes
    private int cores = 4;
    private String brandProcessor = "Intel";

    //Getters and Setters

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public String getBrandProcessor() {
        return brandProcessor;
    }

    public void setBrandProcessor(String brandProcessor) {
        this.brandProcessor = brandProcessor;
    }

    //Constructor
    public Processor(int cores, String brandProcessor) {
        this.cores = cores;
        this.brandProcessor = brandProcessor;
    }
}

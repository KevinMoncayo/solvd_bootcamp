

public class Keyboard {
    //Attributes
    private String partId = "k1001";
    private String typeKeyboard = "Wired computers.Keyboard";

    //Getters and Setters
    public String getPartId() {
        return partId;
    }

    public void setPartId(String partId) {
        this.partId = partId;
    }

    public String getTypeKeyboard() {
        return typeKeyboard;
    }

    public void setTypeKeyboard(String typeKeyboard) {
        this.typeKeyboard = typeKeyboard;
    }

    //Constructor
    public Keyboard(String partId, String typeKeyboard) {
        this.partId = partId;
        this.typeKeyboard = typeKeyboard;
    }
}

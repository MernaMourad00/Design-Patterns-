package prototypePattern;

public class Laptop extends Device {

    public Laptop(String manufacturerName, Integer RAM, Integer screenSize, Integer price, Integer quantity, String keyboardType) {
        super(manufacturerName, RAM, screenSize, price, quantity);
        this.keyboardType = keyboardType;
    }

    @Override
    public void displayCharactristics() {
        System.out.println("keyboardtype=  "+keyboardType);
    }

    private String keyboardType;

    public void setKeyboardType(String keyboardType) {
        this.keyboardType = keyboardType;
    }

    public String getKeyboardType() {
        return keyboardType;
    }

    @Override
    public Device clone() {
        return super.clone();
    }
}

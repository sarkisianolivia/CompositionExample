public class Motherboard {

    private String model;
    private String manufacturer;
    private int cardSlots;
    private String bios;

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }

    public Motherboard(String model, String manufacturer, int cardSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }
    public void loadProgram (String programName) {
        System.out.println("Program " + programName + " is now loading...");
    }
}

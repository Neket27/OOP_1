package OOP_1;

class Laptop extends Characteristics implements Computer {

    private String lightKeyboard;
    private String typeDisplay;
    private boolean additionalInformationFlag;

    public Laptop(String model, int price, String cpu, String gpu, String color, String weight) {
        super(model, price, cpu, gpu, color, weight);
    }


    public void additionalInformation(String lightKeyboard, String typeDisplay) {
        this.lightKeyboard = lightKeyboard;
        this.typeDisplay = typeDisplay;
        this.additionalInformationFlag = true;
    }


    void writeCharacteristicsLaptop() {
        System.out.println("Laptop");
        writeCharacteristics();
        if (additionalInformationFlag)
            System.out.println("additionalInformation: " + "lightKeyboard= " + lightKeyboard + " " + "typeDisplay= " + typeDisplay);


    }

    @Override
    public void computer() {
        writeCharacteristicsLaptop();

    }
}

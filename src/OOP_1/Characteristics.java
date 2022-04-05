package OOP_1;

class Characteristics extends InformationDevice {

    public Characteristics(String model, int price, String cpu, String gpu, String color, String weight) {
        super(model, price, cpu, gpu, color, weight);
    }

    void writeCharacteristics() {
        System.out.println("model= " + model + " " + "price= " + price + " " + "cpu= " + cpu + " " + "gpu= " + gpu + " " + "color= " + color + " " + "weight= " + weight);
    }


}

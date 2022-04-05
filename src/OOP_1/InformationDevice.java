package OOP_1;

class InformationDevice {

    protected String model;
    protected int price;
    protected String cpu;
    protected String gpu;
    protected String color;
    protected String weight;
    protected boolean informationFlag;


    public InformationDevice(String model, int price, String cpu, String gpu, String color, String weight) {
        this.model = model;
        this.price = price;
        this.cpu = cpu;
        this.gpu = gpu;
        this.color = color;
        this.weight = weight;
        this.informationFlag = true;

    }

//    public void information(String model, int price, String cpu, String gpu, String color, String weight) {
//      this.model=model;
//       this.price=price;
//      this.cpu = cpu;
//       this.gpu =gpu;
//       this.color=color;
//        this.weight=weight;
//        this.informationFlag=true;

//    }

}

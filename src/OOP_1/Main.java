package OOP_1;

import java.util.Arrays;
import java.util.List;

class Shop{
    private final List<Computer> computers;
    public Shop(List<Computer>computers){
        this.computers=computers;
    }
    void choice(){computers.forEach(Computer::computer);}

}

class InformationDevice {

public String model;
    public   int price;
    public   String cpu;
    public   String gpu;
    public   String color;
    public   String weight;
    public boolean informationFlag;


    public InformationDevice(String model, int price, String cpu, String gpu, String color, String weight) {
        this.model=model;
        this.price=price;
        this.cpu = cpu;
        this.gpu =gpu;
        this.color=color;
        this.weight=weight;
        this.informationFlag=true;

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

class WriteCharacteristics extends InformationDevice {

    public WriteCharacteristics(String model, int price, String cpu, String gpu, String color, String weight) {
        super(model, price, cpu, gpu, color, weight);
    }

    void writeCharacteristics() {
        System.out.println("model= " + model + " " + "price= " + price + " " + "cpu= " + cpu + " " + "gpu= " + gpu + " " + "color= " + color + " " + "weight= " + weight);
    }


    }


class Monoblock extends WriteCharacteristics implements Computer {
    boolean additionalInformationFlag = false;

    public Monoblock(String model, int price, String cpu, String gpu, String color, String weight) {
        super(model, price, cpu, gpu, color, weight);
    }

    void writeCharacteristicsMonoblock(){
       System.out.println("Monoblock");
            writeCharacteristics();


        if(additionalInformationFlag)
            System.out.println();
   }



    @Override
    public void computer(){
       //information("hp", 56000,"intel i7", "amd563", "read", "1.5kg");
       writeCharacteristicsMonoblock();
   }



}

class Laptop extends WriteCharacteristics implements Computer {

    private String lightKeyboard;
    private String typeDisplay;
    private boolean additionalInformationFlag;

    public Laptop(String model, int price, String cpu, String gpu, String color, String weight) {
        super(model, price, cpu, gpu, color, weight);
    }


    public void additionalInformation(String lightKeyboard, String typeDisplay){
        this.lightKeyboard= lightKeyboard;
        this.typeDisplay =typeDisplay;
        this.additionalInformationFlag=true;
    }



    void writeCharacteristicsLaptop(){
         System.out.println("Laptop");
         writeCharacteristics();
                  if(additionalInformationFlag)
             System.out.println("additionalInformation: "+"lightKeyboard= "+lightKeyboard+" "+"typeDisplay= "+typeDisplay);


    }
    @Override
    public void computer(){
        writeCharacteristicsLaptop();

    }
}



public class Main {

    public static void main(String[] args) {
         Monoblock pc1 = new Monoblock("hp", 56000,"intel i7", "amd563", "read", "4.5kg");
         //pc1.information("hp", 56000,"intel i7", "amd563", "read", "1.5kg");
        Monoblock pc2 = new Monoblock("dexp", 77600,"intel i7", "amd763", "read", "3.5kg");
//        Monoblock pc3 =new Monoblock();
//        Monoblock pc4 =new Monoblock();
        Laptop lp= new Laptop("honor", 9900,"intel i7", "amd563", "read", "1.5kg");
        lp.additionalInformation("Yes","amoled");

//        pc1.information("hp", 56000,"intel i7", "amd563", "read", "1.5kg");
//        pc2.information("honor",70000,"intel i5","gtx 3060","black","1.8kg");
//        pc3.information("hp", 16000,"intel i7", "amd563", "read", "1.5kg");
//        pc4.information("hp", 66000,"intel i7", "amd563", "read", "1.5kg");
         //Laptop lp= new Laptop();
          // lp.information("lenovo", 48000,"intel i3", "amd53", "read", "1.2kg");
         //   lp.additionalInformation("Yes","amoled");

   new Shop(Arrays.asList(pc1,pc2,lp)).choice();

    }
}

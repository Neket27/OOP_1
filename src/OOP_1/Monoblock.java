package OOP_1;

class Monoblock extends Characteristics implements Computer {
    boolean additionalInformationFlag = false;

    public Monoblock(String model, int price, String cpu, String gpu, String color, String weight) {
        super(model, price, cpu, gpu, color, weight);
    }

    void writeCharacteristicsMonoblock() {
        System.out.println("Monoblock");
        writeCharacteristics();


        if (additionalInformationFlag)
            System.out.println();
    }


    @Override
    public void computer() {
        //information("hp", 56000,"intel i7", "amd563", "read", "1.5kg");
        writeCharacteristicsMonoblock();
    }


}

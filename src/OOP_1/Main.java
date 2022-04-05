package OOP_1;

import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {
         Monoblock pc1 = new Monoblock("hp", 56000,"intel i7", "amd563", "read", "4.5kg");
         //pc1.information("hp", 56000,"intel i7", "amd563", "read", "1.5kg");
        Monoblock pc2 = new Monoblock("dexp", 77600,"intel i7", "amd763", "read", "3.5kg");
       Monoblock pc3 =new Monoblock("asus", 50000,"intel i3", "amd73", "black", "2.5kg");
//        Monoblock pc4 =new Monoblock();
        Laptop lp= new Laptop("honor", 9900,"intel i7", "amd563", "black", "1.3kg");
        lp.additionalInformation("Yes","amoled");
//        pc1.information("hp", 56000,"intel i7", "amd563", "read", "1.5kg");
//        pc2.information("honor",70000,"intel i5","gtx 3060","black","1.8kg");
//        pc3.information("hp", 16000,"intel i7", "amd563", "read", "1.5kg");
//        pc4.information("hp", 66000,"intel i7", "amd563", "read", "1.5kg");
         //Laptop lp= new Laptop();
          // lp.information("lenovo", 48000,"intel i3", "amd53", "read", "1.2kg");
         //   lp.additionalInformation("Yes","amoled");

   new Shop(Arrays.asList(pc1,pc2,lp,pc3)).choice();

    }
}

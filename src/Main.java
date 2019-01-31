
public class Main {

    
    public static void main(String[] args) {
     
        //Car defaultCar = new Car();
        //defaultCar.printAtributes();
        
        //Car audi = new Car("Audi A4", "BG-1234");
        //audi.printAtributes();
        //audi.setWeight(1400);
        //audi.setConsumption(10);
        //audi.printAtributes();
        
        Car bmw = new Car("BMW", 200, 1300, "BG-1024", 0, 70, 100, 15);
        bmw.fuelUp();
        //bmw.printAtributes(); 
        
        //bmw.travel(4);
        //bmw.printAtributes();
        
        //bmw.travel(6);
        //bmw.printAtributes();
        
        bmw.addPassanger(5);
       // bmw.printAtributes();
            
//        Bus mrc = new Bus();
//        mrc.printAtributes();
//        
        Bus solaris = new Bus("solaris", "BG-2423", 2000, 2.3, 13, 90, 45, 1, 55, 150000);
//        solaris.printAtributes();
//        
        solaris.add1Passanger(63);
        //solaris.printAtributes();
        
        solaris.setPassanger(45);
        solaris.setSeats(3);
       // solaris.printAtributes();
        solaris.add1Passanger(45);
       // solaris.printAtributes();
        solaris.distance(54);
        //solaris.printAtributes();
        solaris.repair(20000);
        solaris.printAtributes();
        
    }
    
}

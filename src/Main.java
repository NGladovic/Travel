
public class Main {

    
    public static void main(String[] args) {
     
        Car defaultCar = new Car();
       // defaultCar.printAtributes();
        
        Car audi = new Car("Audi A4", "BG-1234");
        //audi.printAtributes();
        audi.setWeight(1400);
        audi.setConsumption(10);
        //audi.printAtributes();
        
        Car bmw = new Car("BMW", 200, 1300, "BG-1024", 0, 0, 100, 15);
        bmw.fuelUp();
        bmw.printAtributes(); 
        
        bmw.travel(4);
        bmw.printAtributes();
        
        bmw.travel(6);
        bmw.printAtributes();
            
        
       
     
    }
    
}


public class Car {
    
    private String model;
    private int maxSpeed;;
    private double weight;
    private String license;
    
    private double mileage;
    private int currentFuel;
    private int maxFuel;
    private int consumption;//per 1 km
    
    public Car(){
        
        this.model = "Demo";
        this.maxSpeed = 120;
        this.weight = 1000;
        this.license = "test drive";
        this.mileage = 0;
        this.maxFuel = 50;
        this.consumption = 1;
        this.currentFuel = 50;
        
    }
    
    public Car(String customModel, String customLicense){
        
        this.model = customModel;
        this.license = customLicense;
        
    }
    
    public Car(String model, int maxSpeed, double weight, String license, double mileage, int currentFuel, int maxFuel, int consumption) {
       this.model = model;
       this.maxSpeed = maxSpeed;
       this.weight = weight;
       this.license = license;
       this.mileage = mileage;
       this.currentFuel = currentFuel;
       this.maxFuel = maxFuel;
       this.consumption = consumption;
   }
    
    
    
    public void printAtributes(){
        System.out.println("Model:" + this.model);
        System.out.println("Max Brzina: " + this.maxSpeed);
        System.out.println("Tezina: " + this.weight);
        System.out.println("Registracija: " + this.license);
        System.out.println("Predjena kilometraza: " + this.mileage);
        System.out.println("Trenutno goriva: " + this.currentFuel);
        System.out.println("Velicina rezervoara: " + this.maxFuel);
        System.out.println("Potrisnja: " + this.consumption);
        System.out.println(" ");
    }
    
    
    
    public void setWeight(double customWeight){
        this.weight = customWeight;
    }
    
    public double getWeight(){
        return this.weight;
    }
    
    public void setConsumption(int customConsuption){
        this.consumption = customConsuption;
    }
    
    public void travel(int distance){
        if(this.currentFuel > distance * this.consumption){
            this.mileage = this.mileage + distance;
            this.currentFuel = this.currentFuel - this.consumption * distance;
        }else{
            System.out.println("Nema dovoljno goriva za toliki put");
        }
        }
    
    public void fuelUp(){
        System.out.println("U automobil " + this.model + " je sipano " + (this.maxFuel - this.currentFuel) + " litara goriva");
        this.currentFuel = this.maxFuel;
    }
}

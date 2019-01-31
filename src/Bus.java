


public class Bus {
    
    private int passanger =1;
    private int seats = 40;
    private String model;
    private String license;
    private double weight;
    private double height;
    private double consumption = 13;
    private double consumptionPerKm = 100;
    private double maxFuel;
    private double currentFuel;
    private double mileage = 150000;
    private double kmWithCurrentTank;
    private double mileagePass = 90000;
    
    
    public Bus(){
        
        this.model = "Mercedes";
        this.license = "BG-2413";
        this.weight = 2500;
        this.height = 2.1;
        this.consumption = 10;
        this.consumptionPerKm = 100;
        this.maxFuel = 130;
        this.currentFuel = 30;
        this.mileage = 100000;
    }
    
    public void printAtributes(){
        System.out.println("Model: " + this.model);
        System.out.println("Broj registracije: " + this.license);
        System.out.println("Maksimalna tezina:" + this.weight);
        System.out.println("Visna vozila: " + this.height);
        System.out.println("Potrosnja goriva na 100 km " + this.consumption + " L ");
        System.out.println("Na " + this.consumptionPerKm);
        System.out.println("Maksimalna kolicina goriva u autobusu: " + this.maxFuel);
        System.out.println("Trenutno ima " + this.currentFuel + " litara goriva u rezervoaru");
        System.out.println("Predjeno kilometara: " + this.mileage);
        System.out.println("Broj putnika:" + this.passanger);
        System.out.println("Broj sedista: " + this.seats);
        System.out.println("Moze da predje " + this.kmWithCurrentTank + "ovom kolicinom goriva");
        System.out.println(" ");
        
    }
    
    public Bus(String model,String license,double weight,double height,int consumption,int maxFuel,int currentFuel,int passanger,int seats,int mileage){
        this.model = model;
        this.license = license;
        this.weight = weight;
        this.height = height;
        this.consumption = consumption;
        this.maxFuel = maxFuel;
        this.currentFuel = currentFuel;
        this.passanger = passanger;
        this.seats = seats;
        this.mileage = mileage;
    }
    
    public void setSeats(int seat){
        this.seats = seat;
    }
    
    public void setPassanger(int passangers){
        this.passanger = passangers;
    }
    
    public void add1Passanger(int student){
        if(this.seats > this.passanger + student){
            this.passanger +=student;
        }else{
            System.out.println("nema vise mesta");
        }
    }
    
    public void distance(double distancePass){
        this.currentFuel = distancePass;
        this.kmWithCurrentTank = distancePass * (this.consumptionPerKm / this.consumption);
    }
    
    public void repair(double checkUp){
        if(this.mileage > mileagePass + checkUp){
            this.mileagePass +=checkUp;
        }else{
            System.out.println("Potrebno je odratiti tehnicki pregled");
        }
        
    }
    
}

public class Car
{
    String make;
    String model;
    int year;
    double MPG;
    int carID = 0;

    public Car(){
        this.carID++;
        make = "None";
        model = "None";
        year = 2000;
        MPG = 0.0;
    }

    public Car(String make, String model, int year, double MPG){
        this.make = make;
        this.model = model;
        this.year = year;
        this.MPG = MPG;

        if (!((this.year > 1885) && (this.year < 2022))){
            this.year = 2000;
        }

        if (this.MPG < 0){
            this.MPG = 0;
        }

        this.carID++;
    }



    public int getID(){
        return carID;
    }
  
}

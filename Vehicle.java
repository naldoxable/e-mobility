import java.io.*;
import java.util.Date

public enum VehicleState{
    FREE,
    OCCUPED,
    MAINTENANCE,
    DAMAGED;
}


public class Vehicle {
    int id;
    int type;
    VehicleState state;
    int batteryLeft;
    List damage = new ArrayList();
    String lastUse;
    int maxBattery;
    Date lastUse;


    public Vehicle(int id, int type){
        this.id = id;
        this.type = type;
        if (this.type == 0){ //monopattino
            this.maxBattery = 25;
        } else if(this.type==1){ //bicicletta
            this.maxBattery = 50;
        } else if (this.type==2){ //motorino
            this.maxBattery = 75;
        }
        this.state = VehicleState.FREE;
    }

    private boolean updateState(VehicleState newState){
        this.state = newState;
        return true;
    }

    public int getId{
        return this.id;
    }

    public void updateBattery (int battery){
        this.batteryLeft = battery;
    }











}

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

enum VehicleState{
    FREE,
    OCCUPED,
    MAINTENANCE,
    DAMAGED;
}

enum Damages {
    wheelFailure,
    engineFailure,
    chassisFailure;
}

public class Vehicle {
    int id;
    int type;
    VehicleState state;
    int batteryLeft;
    List damages = new ArrayList();
    int maxBattery;
    Date lastUse;
    List<Vehicle> vehicles = new ArrayList<Vehicle>();


    public Vehicle(int id, int type){
        this.id = id;
        this.type = type;
        if (this.type == 0){ //monopattino
            this.maxBattery = 25;
            this.batteryLeft = maxBattery;
        } else if(this.type==1){ //bicicletta
            this.maxBattery = 50;
            this.batteryLeft = maxBattery;
        } else if (this.type==2){ //motorino
            this.maxBattery = 75;
            this.batteryLeft= maxBattery;
        }
        this.state = VehicleState.FREE;
    }

    private boolean updateState(VehicleState newState){
        this.state = newState;
        return true;
    }

    public int getId(){
        return this.id;
    }

    public Vehicle getVehicleById(int id){
        for (Vehicle v : vehicles){
            if (v.getId() == id)
                return v;
        }
        System.out.println("Il veicolo cercato non è presente");
        return null;
    }

    public void addDamage(Damages d){
        damages.add(d);
    }

    public void updateBattery (int battery){
        this.batteryLeft = battery;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public VehicleState getState() {
        return state;
    }

    public int getBatteryLeft() {
        return batteryLeft;
    }

}

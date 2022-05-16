import java.io.*;

public enum VehicleState{
    FREE,
    OCCUPED,
    MAINTENANCE,
    DAMAGED;
}


public class Vehicle {
    public int id;
    public String type;
    public VehicleState state;
    public int batteryLeft;
    public List damage = new ArrayList();
    public String lastUse;


    public Vehicle(int id, String type, VehicleState state){
        this.id = id;
        this.type = type;
        this.state = state;
    }

    public boolean updateState(VehicleState newState){
        this.state = newState;
        System.out.println("State modified in: "+newState);
        return true;
    }









}

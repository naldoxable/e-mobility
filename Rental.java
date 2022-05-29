import java.util.Date;
import java.time.LocalDateTime;
import java.util.List;


public class Rental {
    public int id;
    public int userId;
    public int vehicleId;
    public List damages;
    public int elapsedKM;
    LocalDateTime dateStart;
    LocalDateTime dateEnd;
    Vehicle v;

    public Rental(int userId, int vehicleId){
        v = v.getVehicleById(this.vehicleId);
        v.state = VehicleState.OCCUPED;
        this.userId = userId;
        this.vehicleId = vehicleId;
        this.dateStart = LocalDateTime.now();
        this.id += 1; //ogni noleggio ha id diverso
    }

    public boolean rentStop(){
        v.state = VehicleState.FREE;
        this.dateEnd = LocalDateTime.now();
        return true;
    }

    public void addDamage(String damage){
        damages.add(damage);

    }

}


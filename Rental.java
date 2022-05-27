import java.util.Date
import java.time.LocalDateTime


public class Rental {
    public int id;
    public int userId;
    public int vehicleId;
    public List damages;
    public int elapsedKM;
    LocalDateTime dateStart;
    LocalDateTime dateEnd;

    public Rental(userId, vehicleId){
        this.userId = userId;
        this.vehicleId = vehicleId;
        this.dateStart = LocalDateTime.now();
        this.id += 1; //ogni noleggio ha id diverso
    }

    public boolean rentStop(){
        this.dateEnd = LocalDateTime.now()
    }

    public void addDamage(string damage){
        damages.add(damage);

    }


}

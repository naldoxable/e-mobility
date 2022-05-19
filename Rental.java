import java.util.Date

public class Rental {
    public int id;
    public int userId;
    public int vehicleId;
    public List damages = new ArrayList();
    public int elapsedKM;
    Date dateStart;
    Date dateEnd;

    public Rental(userId, vehicleId){
        this.userId = userId;
        this.vehicleId = vehicleId;
        this.dateStart = //qualche metodo per gestione date
        this.id += 1; //ogni noleggio ha id diverso
    }

    public boolean rentStop(){

    }


}

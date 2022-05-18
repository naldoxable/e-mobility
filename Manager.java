import java.util.HashMap;

public class Manager {

    //veicoli in una mappa?
    HashMap<Integer, String> vehicles = new HashMap<Integer, String>();

    //clienti in una lista?
    List clients = new ArrayList();

    List rentalList = new ArrayList();

    //static variable reference of single_instance of type Singleton
    private static Singleton single_instance = null;

    //private constructor
    private Singleton(){
    }

    //method to create instance of Singleton class
    public static Singleton getInstance()
    {
        if (single_instance == null)
            single_instance = new Singleton();
        return single_instance;
    }

    public void addVehicle(String numberPlate){
        vehiclesAmount = vehicles.size();
        vehicles.put(vehiclesAmount + 1, numberPlate);
    }

    public void removeVehicle(Integer number){
        vehicles.remove(number);
    }

    public int addClient(int id){
        clientsAmount = len(clients);
        clients.add(cliensAmount + 1, id);
        return id;
    }

    public void removeClient(int index){
        clients.remove(index);
    }
}

    private addRent(Client c, Vehicle v){
        r = new Rental(c.getId(), v.getId());
        this.rentalList.add(r);
        if (!this.clients.contains(c))
            this.clients.add(c);
        v.updateState(VehicleState.OCCUPED);
    }



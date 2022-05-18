public class Client {
    //variables
    int id;
    String password;
    int money;
    List achievements = new ArrayList();
    int vehicleOccupied;

    //constructor
    public Client(int id, String password, int money){
        this.id = id,
        this.password = password;
        this.money = money;
        this.vehicleOccupied = 0;
    }

    //methods
    public boolean changePw(String password){
        if(password.contains(".")) {
            this.password = password;
            return true;
        }
        else
            return false;
    }

    public int addMoney(int moneyAdded){
        this.money = money + moneyAdded;
        return money;
    }

    public List getAchievements() {
        return achievements;
    }

    public boolean getVehicle(int vehicleID){
        if (vehicleID.state == FREE && this.vehicleOccupied == 0){
            vehicleID == OCCUPIED; // non sono sicura chi fa l'assegnamento dello stato del veicolo
            this.vehicleOccupied = vehicleID;
            return true;
        }
        else {
            print("Vehicle is occupied or You are already renting a vehicle!")
            return false;
        }
    }

    public void leaveVehicle(){
        vehicleID == FREE;
        this.vehicleOccupied = 0;
        print("Do you want to note a problem?")
        //get input from user
        //if (wants to input)
        //  noteProblem()
    }

    public void noteProblem(){
        //some code as a list of problems
    }

    public int getId(){
        return this.id;
    }
}

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

public class Main {
    public static void main(String[] args) {
        Driver driver1 = new Driver(40, "АААА ААА ААА", 15);
        Driver driver2 = new Driver(30, "BBBB B.B.", 10);
        Engine engine1 = new Engine(100, "MicroSoft");
        Engine engine2 = new Engine(400, "Tesla");
        Lorry lorry1 = new Lorry("FDT 200", "Lorry", 4253.4, driver1, engine1, 400.0);
        SportCar sportCar1 = new SportCar("FAS 201", "sport", 2000.0, driver2, engine2, 300);
        lorry1.start();
        lorry1.turnRight();
        lorry1.turnLeft();
        lorry1.stop();
        System.out.println(lorry1.toString(lorry1));
        sportCar1.start();
        sportCar1.turnLeft();
        sportCar1.turnRight();
        sportCar1.stop();
        System.out.println(sportCar1.toString(sportCar1));
    }
}

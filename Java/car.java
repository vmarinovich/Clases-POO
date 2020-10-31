package Java;
public class car {
    Integer identifier;
    Cuentas driver;
    String license;
    Integer passenger;

    public car(String license, Cuentas driver ){
        this.license = license;
        this.driver = driver;
    }
    
    void printDataCar() {
        System.out.println("licencia: " + license + " "+ "Conductor " + driver.name);

    }
}

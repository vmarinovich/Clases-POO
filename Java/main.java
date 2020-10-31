package Java;

class main {
    public static void main(String[] args) {

        System.out.println("Hola Muerganos");
        car car = new car("AMQ-123", new Cuentas("Vlaky Flow" ,"as2323"));
        car.passenger = 5;
        car.printDataCar();

    }
}
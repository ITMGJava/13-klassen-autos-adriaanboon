public class Autotest {

    public static void main(String[] args) {
        Auto auto2= new Auto();
        auto2.setKilometerstand(50000);
        auto2.start();
        auto2.geefGas();
        auto2.stop();
        System.out.println(auto2.getKilometerStand());
        Auto auto3= new Auto();
        auto3.setMerk("Volvo");
        auto3.setKilometerstand(10000);
        auto3.start();
        auto3.geefGas();
        auto3.geefGas();
        auto3.stop();
        System.out.println(auto3.getKilometerStand());
    }
}

public class Auto {
    int snelheid =0;
    int kilometerstand =23000;
    private String merk="Toyota";

    public static void main(String[] args) {
        Auto auto1= new Auto();
        auto1.start();
        auto1.stop();
        auto1.geefGas();
        System.out.println(auto1.getKilometerStand());
    }

    void start() {
        System.out.println("De " +merk+  " start.");
    }
    void stop() {
        System.out.println("De " +merk+ " stopt.");
    }
    public void geefGas() {
        System.out.print("De " +merk+ " rijdt ");
        snelheid+=20;
        kilometerstand+=20;
        System.out.print(snelheid);
        System.out.println(" en heeft in totaal "+kilometerstand+ " km gereden.");
    }
    public String getMerk() {
        return merk;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
    int getKilometerStand() {
        System.out.print("De kilometerstand van de " +merk+ " is: ");
        return kilometerstand;
    }
    void setKilometerstand(int kilometerstand) {
        this.kilometerstand=kilometerstand;
    }
    int getSnelheid() {
        return snelheid;
    }
    void setSnelheid(int snelheid) {
        this.snelheid=snelheid;
    }
}

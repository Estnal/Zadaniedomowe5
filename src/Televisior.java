public class Televisior {
    boolean power;
    String status;

    Televisior (boolean p) {
        power = p;

    }
    void turnOn() {
        power =  true;
    }
    void turnOff() {
        power = false;
    }
    void showStatus(){
        System.out.println("Statustelewiziora: " + power);
    }
}

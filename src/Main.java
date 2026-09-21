// Main.java
public class Main {
    public static void main(String[] args) {
        Smartphone myPhone = new Smartphone("Xiaomi", "Poco X4 Gt");

        myPhone.call("34123456789");
        myPhone.takePhoto();
        myPhone.ringAlarm();
    }
}
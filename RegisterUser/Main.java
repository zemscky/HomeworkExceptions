package RegisterUser;

public class Main {
    public static void main(String[] args) {
        boolean success = Data.validate("alex","_2000alex_","_2000alex_");
        if (success) {
            System.out.println("Данные введены верно");
        } else {
            System.out.println("Данные введены не верно");
        }
    }
}

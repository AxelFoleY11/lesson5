
public class Human {
    String name;
    Car3 car;
    BancAccount bA;
    

    void info() {
        System.out.println("Imya: " + name + " cvet mashinu: " + car.color + " Balans bankovskogo scheta: " + bA.balance + " popolnenieScheta" + bA.popolnenieScheta + bA.balance + " snyatiaSoScheta");
    }

}

class HumanTest {
    public static void main(String[] args) {
        Human h = new Human();
        h.name = "David";
        h.car = new Car3("red", "V8");
        h.bA = new BancAccount(18, 200.5);
        h.bA = new BancAccount(18, +300);
        h.bA = new BancAccount(18, -300);


        h.info();
    }
}

class Car3 {
    Car3(String c, String e) {
        color = c;
        engine = e;

    }

    String color;
    String engine;
}

class BancAccount {
    BancAccount(int id2, double balance2, int popolnenieScheta, int snyatieSoScheta) {
        id = id2;
        balance = balance2;
        balance = balance3;
        popolnenieScheta = popolnenieScheta;
        snyatieSoScheta = snyatieSoScheta;
    }

    int id;
    double balance;
    double balance3;
    int popolnenieScheta;

    int snyatieSoScheta;

    public BancAccount(int id2, double balance2) {

    }
}
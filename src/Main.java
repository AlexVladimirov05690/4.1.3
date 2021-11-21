public class Main {
    public static void main(String[] args) {
        // At (0;0) fuel=100
        Tank justTank = new Tank();
        // At (10;20) fuel=100
        Tank anywareTank = new Tank(10, 10);
        // At (20;30) fuel=200
        Tank customTank = new Tank(20, 30, 200);
        justTank.goForward(-100);
        justTank.printPosition();
        anywareTank.goBackward(-100);
        anywareTank.printPosition();
        customTank.goForward(201);
        customTank.printPosition();
    }
}
//При запуске выдаёт:
//The Tank is at 100, 0 now.
//The Tank is at 110, 10 now.
//The Tank is at 220, 30 now.
//При нажатии "Test"
//1) test(TestTank)
//org.junit.ComparisonFailure: expected:<The Tank is at -[100, 0 now.
//The Tank is at 120, -10 now.
//The Tank is at 170], 30 now.
//> but was:<The Tank is at -[200, 0 now.
//The Tank is at 120, -10 now.
//The Tank is at -31], 30 now.

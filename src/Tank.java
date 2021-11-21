public class Tank {
    int x, y;
    int dir;
    int fuel;

    void goForward(int i) {
        if(fuel <= i) {
            i = fuel;
        }
        fuel-= i;
        if (dir == 0) x += i;
        else if (dir == 1) y += i;
        else if (dir == 2) x -= i;
        else y -= i;

    }

    void goBackward(int i) {
        goForward(-i);
    }

    void printPosition() {
        System.out.println("The Tank is at " + x + ", " + y + " now");
    }

    void turnRight() {
        dir++;
        if (dir == 4) dir = 0;
    }

    void turnLeft() {
        dir--;
        if (dir == -1) dir = 3;
    }

    public Tank() {
        x = 0;
        y = 0;
        fuel = 100;
    }

    public Tank(int x, int y) {
        this();
        this.x = x;
        this.y = y;
    }

    public Tank(int x, int y, int fuel) {
        this(x, y);
        this.fuel = fuel;
    }
}

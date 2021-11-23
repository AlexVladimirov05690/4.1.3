public class Tank {
    int x, y;
    int dir;
    int fuel;

    public Tank() {
        this(0, 0, 100);
    }

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public Tank(int x, int y, int fuel) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;
    }


    public void goForward(int i) {
        if (i < 0 && -i > -fuel)
            i = -fuel;
        else if (i > fuel)
            i = fuel;
        if (dir % 2 == 0) x += i;
        else y += i;
        fuel -= Math.abs(i);
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
}



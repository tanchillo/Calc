import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cube cube = new Cube();
        cube.scale(150);
        cube.rotate(1000,-960,400);
        Viewer v = new Viewer(cube);
    }
}
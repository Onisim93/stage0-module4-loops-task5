package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        for (int y=0; y < sideLength; y++) {
            for (int x = 0; x <sideLength; x++) {
                if (x == sideLength/2 || y == sideLength/2) {
                    System.out.print("8");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}

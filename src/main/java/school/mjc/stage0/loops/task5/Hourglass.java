package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
       for (int y = 0; y < height; y++) {
           for (int x = 0; x < height; x++) {
               if ((y >= height / 2 && (x > y || x < height - y -1))
               || (y < height / 2 && (x < y || x > height - y - 1))) {
                   System.out.print(" ");
               }
               else System.out.print("8");
           }
           System.out.println();
       }


    }
}

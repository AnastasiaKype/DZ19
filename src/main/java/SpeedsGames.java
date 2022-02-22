public class SpeedsGames {

    public static boolean isGreenLight = true;
    public static int MaxSpeed = 3;

    public static int speedCheckMas(int[] players) {


        if (isGreenLight = false) {
            int sum = 0;

            for (int player : players) {
                if (player > MaxSpeed) {
                    sum++;
                }
            }
            return sum;
        } else {
            int win = 0;
            for (int player : players) {
                win++;
            }
            return win;
        }


    }
}
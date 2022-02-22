public class SpeedsGames2 {
    public static boolean isGreenLight = false;
    public static int MaxSpeed = 3;

    public static int[] speedCheckLosers(int[] players) {

        if (isGreenLight = true) {
            int sum = 0;

            for (int player : players) {
                if (player > MaxSpeed) {
                    sum++;
                }

            }

            int[] speeds = new int[sum];
            int i = 0;
            for (int player : players) {
                if (player > MaxSpeed) {
                    speeds[i] = player;
                    i++;
                }

            }
            return speeds;

        } else {
            int sum = 0;
            for (int player : players) {
                sum++;
            }


            int[] speeds = new int[sum];
            int i = 0;
            for (int player : players) {
                speeds[i] = player;
                i++;
            }
            return speeds;

        }

    }
}

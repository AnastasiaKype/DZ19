public class NameWinners {
    public static boolean isGreenLight = false;
    public static int MaxSpeed = 3;


    public static String[] speeds(String[] namesPlayers) {


        int x = 0;
        for (String name : namesPlayers) {
            String[] parts = name.split(" ");
            int i = Integer.parseInt(parts[1]);
            if (isGreenLight) {
                x++;
            } else {
                if (i <= MaxSpeed) {
                    if (i >= 0) {
                        x++;
                    }
                } else {
                    continue;
                }
            }
        }
        String[] namesWinner = new String[x];
        int cnt = 0;
        for (String name : namesPlayers) {
            String[] parts = name.split(" ");
            int i = Integer.parseInt(parts[1]);
            if (isGreenLight) {
                namesWinner[cnt] = parts[0];
                cnt++;
            } else {
                if (i <= MaxSpeed) {
                    if (i >= 0) {
                        namesWinner[cnt] = parts[0];
                        cnt++;
                    }
                }
            }
        }

        return namesWinner;
    }
}




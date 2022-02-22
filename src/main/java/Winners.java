public class Winners {
    public static boolean isGreenLight = false;

    public static String[] namesWinners (String[] speeds) {
        String[] namesWinner = new String[0];
        if (isGreenLight = true) {
            int x = 0;
            for (String name : speeds) {
                String[] parts = name.split(" ");

                int i = Integer.parseInt(parts[1]);
                if (i <= 0) {
                    x++;
                }
            }

            namesWinner = new String[x];

            for (String names : namesWinner) {
                String[] parts = names.split(" ");
                namesWinner[x] = parts[0];
            }
            String[] namesWinners = namesWinner;
        }
        return namesWinner;
    }
}

public class NameWinners {
    public static boolean isGreenLight = false;
    public static int MaxSpeed = 3;


    public static String[] speeds (String[] namesWinners) {



        if (isGreenLight == false) {

            int x = 0;
            for (String name : namesWinners) {
                String[] parts = name.split(" ");

                int i = Integer.parseInt(parts[1]);
                if (i <= MaxSpeed) {
                    x++;
                }
            }

            for (String name : namesWinners) {
                String[] namesWinner = new String[x];
                String[] parts = name.split(" ");
                int i = Integer.parseInt(parts[1]);

                if (i <= MaxSpeed) {
                    namesWinner[x] = parts[0];
                }

            }


        }

        return namesWinners;
    }
}




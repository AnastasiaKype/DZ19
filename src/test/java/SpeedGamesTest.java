import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.naming.Name;

public class SpeedGamesTest {
    @Test
    public void speedCheck1() {
        SpeedsGames.isGreenLight = false;

        int[] players = {5, 0, 2};

        int expected = 3;
        int actual = SpeedsGames.speedCheckMas(players);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void speedCheck2() {
        SpeedsGames.isGreenLight = false;

        int[] players = {5, 0, 2};

        int[] expected = {5};
        int[] actual = SpeedsGames2.speedCheckLosers(players);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void speedCheck3() {
        SpeedsGames.isGreenLight = false;

        int[] players = {5, 0, 2};

        int[] expected = {0, 2};
        int[] actual = SpeedGames3.speedCheckWin(players);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void speedCheck4() {

        NameWinners.isGreenLight = false;
        NameWinners.MaxSpeed = 3;
        String[] namesPlayers = {"Коля 5","Вася 0","Петя 2"};

        String[] expected = {"Вася", "Петя"};
        String[] actual = NameWinners.speeds(namesPlayers);

        Assertions.assertArrayEquals(expected, actual);
    }
}



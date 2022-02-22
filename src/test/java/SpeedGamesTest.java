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

        String[] speeds = {"Kolya 5","Vasya 0","Petya 2"};

        String[] expected = {"Vasya"};
        String[] actual = Winners.namesWinners(speeds);

        Assertions.assertArrayEquals(expected, actual);
    }
}



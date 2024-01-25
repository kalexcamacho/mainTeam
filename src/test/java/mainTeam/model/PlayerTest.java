package mainTeam.model;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlayerTest {

    private Stats createStats(int power, int distance, int time, int passes) {
        Stats stats = new Stats();
        stats.setPower(power);
        Speed speed = new Speed();
        speed.setDistance(distance);
        speed.setTime(time);
        stats.setSpeed(speed);
        stats.setPasses(passes);
        return stats;
    }

    @Test
    public void calculateTotalScoreTest() {
        List<Stats> statsList = new ArrayList<>();
        statsList.add(createStats(300, 30, 5, 20));

        Player player = new Player();
        int totalScore = player.calculateTotalScore(statsList, 0.2f, 0.3f, 0.5f);

        Assertions.assertEquals(72, totalScore);
    }

}
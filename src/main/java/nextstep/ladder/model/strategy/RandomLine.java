package nextstep.ladder.model.strategy;

import java.util.Random;

public class RandomLine implements LineStrategy {
    Random random = new Random();

    @Override
    public boolean drawLine() {
        return random.nextBoolean();
    }
}
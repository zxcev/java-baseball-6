package baseball.domain.ball;

import baseball.util.NumberPicker;
import java.util.HashSet;
import java.util.Set;

public final class AnswerCreator {

    private final NumberPicker numberPicker;

    public AnswerCreator(final NumberPicker numberPicker) {
        this.numberPicker = numberPicker;
    }

    public Answer create() {
        final Set<Integer> numbers = fillUntilHasThreeBallNumbers(new HashSet<>());
        return Answer.of(numbers);
    }

    private Set<Integer> fillUntilHasThreeBallNumbers(final Set<Integer> set) {
        set.add(numberPicker.pick());
        if (set.size() < BallNumbers.BALL_COUNT) {
            return fillUntilHasThreeBallNumbers(set);
        }
        return set;
    }
}

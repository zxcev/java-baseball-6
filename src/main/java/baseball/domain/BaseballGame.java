package baseball.domain;

public final class BaseballGame {

  private final BallNumbers answer;

  public BaseballGame(final BallNumbers answer) {
    this.answer = answer;
  }

  public GameResult play(final BallNumbers guess) {
    final int ballCount = answer.getBallCount(guess);
    final int strikeCount = answer.getStrikeCount(guess);

    return new GameResult(ballCount, strikeCount);
  }
}

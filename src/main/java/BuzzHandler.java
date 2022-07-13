public class BuzzHandler extends Handler {

  public BuzzHandler(Handler nextHandler) {
    super(nextHandler);
  }

  @Override
  String handleRequest(int i) {
    return "Buzz";
  }

  @Override
  boolean canHandle(int i) {
    return i % 5 == 0;
  }
}

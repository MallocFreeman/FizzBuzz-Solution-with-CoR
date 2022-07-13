public class FizzBuzzHandler extends Handler {

  public FizzBuzzHandler(Handler nextHandler) {
    super(nextHandler);
  }

  @Override
  String handleRequest(int i) {
    return "FizzBuzz";
  }

  @Override
  boolean canHandle(int i) {
    return i % 15 == 0;
  }
}

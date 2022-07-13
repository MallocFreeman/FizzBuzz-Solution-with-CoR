public class FizzHandler extends Handler {

  public FizzHandler(Handler nextHandler) {
    super(nextHandler);
  }

  @Override
  String handleRequest(int i) {
    return "Fizz";
  }

  @Override
  boolean canHandle(int i) {
    return i % 3 == 0;
  }
}

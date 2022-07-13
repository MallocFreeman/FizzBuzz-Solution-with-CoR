public abstract class Handler {

  private final Handler handler;

  public Handler(Handler nextHandler) {
    handler = nextHandler;
  }

  String handle(int i) {
    return canHandle(i) ? handleRequest(i) : handler.handle(i);
  }

  abstract String handleRequest(int i);

  abstract boolean canHandle(int i);
}

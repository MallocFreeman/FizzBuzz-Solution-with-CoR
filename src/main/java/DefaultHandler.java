public class DefaultHandler extends Handler {

  public DefaultHandler() {
    super(null);
  }

  @Override
  String handleRequest(int i) {
    return String.valueOf(i);
  }

  @Override
  boolean canHandle(int i) {
    return true;
  }
}

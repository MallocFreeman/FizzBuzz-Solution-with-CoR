import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class FizzBuzzChain {

  private Handler handler = new DefaultHandler();

  FizzBuzzChain()
      throws InvocationTargetException, InstantiationException, IllegalAccessException,
          NoSuchMethodException {
    appendHandler(FizzHandler.class);
    appendHandler(BuzzHandler.class);
    appendHandler(FizzBuzzHandler.class);
  }

  public String process(int i) {
    return handler.handle(i);
  }

  private void appendHandler(Class<? extends Handler> nextHandlerClass)
      throws InvocationTargetException, InstantiationException, IllegalAccessException,
          NoSuchMethodException {
    Constructor<?> constructor = nextHandlerClass.getConstructor(Handler.class);
    handler = (Handler) constructor.newInstance(handler);
  }
}

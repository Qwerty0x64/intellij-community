import java.math.BigInteger;
import java.util.function.Function;

class Test {
  long test(Object obj) {
    if (obj instanceof Integer || obj instanceof Long || obj instanceof String) {
      obj.compa<caret>
    }
    return -1;
  }
}
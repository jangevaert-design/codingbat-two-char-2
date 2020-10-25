public class TwoChar2 {
  public String twoChar(String str, int index) {
    int len = str.length();

    if (index >= len - 1 || index <= 0) {
      return str.substring(0, 2);
    } else {
      return str.substring(index, index + 2);
    }
  }
}

import static org.junit.Assert.*;

import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.Test;

public class SortMapByValuesTest {
  @Test
  public void testSort() {
    Map<String, Integer> unsortedMap = new LinkedHashMap<>();
    unsortedMap.put("facebook", 4);
    unsortedMap.put("google", 5);
    unsortedMap.put("amazon", 4);
    unsortedMap.put("stackoverflow", 10);
    unsortedMap.put("instagram", 1);

    Map<String, Integer> sortedMap = new LinkedHashMap<>();
    sortedMap.put("stackoverflow", 10);
    sortedMap.put("google", 5);
    sortedMap.put("facebook", 4);
    sortedMap.put("instagram", 1);
    sortedMap.put("amazon", 4);

    assertTrue(sortedMap.equals(SortMapByValues.sort(unsortedMap)));
    assertTrue(sortedMap.entrySet().equals(SortMapByValues.sort(unsortedMap).entrySet()));
  }
}

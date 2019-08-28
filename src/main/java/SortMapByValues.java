import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByValues {
  public static Map<String, Integer> sort(Map<String, Integer> unsortedMap) {
    List<Map.Entry<String, Integer>> entries = unsortedMap.entrySet().stream().collect(Collectors.toList());

    Collections.sort(entries, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));

    Map<String, Integer> sortedMap = new LinkedHashMap<>();

    return entries.stream().collect(LinkedHashMap::new, (map, entry) -> map.put(entry.getKey(), entry.getValue()), Map::putAll);
  }
}

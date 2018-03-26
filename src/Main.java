import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    List<Integer> integerList = new ArrayList<>(Arrays.asList(4,6,4,7,8,10,11,1,6,7,5,7,8));
    List<Long> longList = new ArrayList<>(Arrays.asList(5L,7L,11L,11L,14L,48L,293L,15L,11L,28L,35L));
    List<Float> floatList = new ArrayList<>(Arrays.asList(15.5f, 4.7f, 6f, 9f, 88f, 9f, 5f, 15.5f));
    List<Double> doubleList = new ArrayList<>(Arrays.asList(45.6, 9.7, 35.6, 9.7, 45.6, 13.4, 14.6, 13.4));
    List<String> stringList = new ArrayList<>(Arrays.asList("rubble", "annie", "krisz", "annie", "sonic", "rubble"));

    System.out.println(removeDuplicate(integerList));
    System.out.println(removeDuplicateKeepOriginalOrder(integerList));
    System.out.println(removeDuplicateUsingForLoop(integerList));

    System.out.println(removeDuplicate(longList));
    System.out.println(removeDuplicateKeepOriginalOrder(longList));
    System.out.println(removeDuplicateUsingForLoop(longList));

    System.out.println(removeDuplicate(floatList));
    System.out.println(removeDuplicateKeepOriginalOrder(floatList));
    System.out.println(removeDuplicateUsingForLoop(floatList));

    System.out.println(removeDuplicate(doubleList));
    System.out.println(removeDuplicateKeepOriginalOrder(doubleList));
    System.out.println(removeDuplicateUsingForLoop(doubleList));

    System.out.println(removeDuplicate(stringList));
    System.out.println(removeDuplicateKeepOriginalOrder(stringList));
    System.out.println(removeDuplicateUsingForLoop(stringList));
  }

  //do not keep original order
  private static <T> List<T> removeDuplicate(List<T> duplicateList) {
    return new ArrayList<>(new HashSet<>(duplicateList));
  }

  //keep original order using functional approach
  private static <T> List<T> removeDuplicateKeepOriginalOrder(List<T> duplicateList) {
    return duplicateList.stream().distinct().collect(Collectors.toList());
  }

  //keep original order using for loop
  private static <T> List<T> removeDuplicateUsingForLoop(List<T> duplicateList) {
    List<T> nonDuplicateList = new ArrayList<>();

    for (T aDuplicateList : duplicateList) {
      if (!nonDuplicateList.contains(aDuplicateList)) {
        nonDuplicateList.add(aDuplicateList);
      }
    }

    return nonDuplicateList;
  }
  
}

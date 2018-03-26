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

    RemoveDuplicate removeDuplicateIntegerList = new RemoveDuplicate(integerList);
    System.out.println(removeDuplicateIntegerList.removeDuplicate());
    System.out.println(removeDuplicateIntegerList.removeDuplicateKeepOriginalOrder());
    System.out.println(removeDuplicateIntegerList.removeDuplicateUsingForLoop());

    RemoveDuplicate removeDuplicateLongList = new RemoveDuplicate(longList);
    System.out.println(removeDuplicateLongList.removeDuplicate());
    System.out.println(removeDuplicateLongList.removeDuplicateKeepOriginalOrder());
    System.out.println(removeDuplicateLongList.removeDuplicateUsingForLoop());

    RemoveDuplicate removeDuplicateFloatList = new RemoveDuplicate(floatList);
    System.out.println(removeDuplicateFloatList.removeDuplicate());
    System.out.println(removeDuplicateFloatList.removeDuplicateUsingForLoop());
    System.out.println(removeDuplicateFloatList.removeDuplicateKeepOriginalOrder());

    RemoveDuplicate removeDuplicateDoubleList = new RemoveDuplicate(doubleList);
    System.out.println(removeDuplicateDoubleList.removeDuplicate());
    System.out.println(removeDuplicateDoubleList.removeDuplicateKeepOriginalOrder());
    System.out.println(removeDuplicateDoubleList.removeDuplicateUsingForLoop());

    RemoveDuplicate removeDuplicateStringList = new RemoveDuplicate(stringList);
    System.out.println(removeDuplicateStringList.removeDuplicate());
    System.out.println(removeDuplicateStringList.removeDuplicateUsingForLoop());
    System.out.println(removeDuplicateStringList.removeDuplicateKeepOriginalOrder());
  }

}

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class RemoveDuplicateTest {

  @Test
  public void removeDuplicateIntegerTest() {
    List<Integer> integerListDuplicated = new ArrayList<>(Arrays.asList(4,6,4,7,8,10,11,1,6,7,5,7,8));
    List<Integer> integerListNonDuplicated = new ArrayList<>(Arrays.asList(1, 4, 5, 6, 7, 8, 10, 11));
    RemoveDuplicate removeDuplicateIntegerList = new RemoveDuplicate(integerListDuplicated);
    assertEquals(integerListNonDuplicated, removeDuplicateIntegerList.removeDuplicate());
  }

  @Test
  public void removeDuplicateIntegerEmptyListTest() {
    List<Integer> empty = new ArrayList<>();
    assertEquals(new ArrayList<Integer>(), new RemoveDuplicate(empty).removeDuplicate());
  }

  @Test
  public void removeDuplicateIntegerNullListTest() {
    List<Integer> nullList = null;
    assertEquals(null, new RemoveDuplicate(nullList).removeDuplicate());
  }

  @Test
  public void removeDuplicateLong_KeepOriginalOrder_Test() {
    List<Long> longListDuplicated = new ArrayList<>(Arrays.asList(5L,7L,11L,11L,14L,48L,293L,15L,11L,28L,35L));;
    List<Long> longListNonDuplicated = new ArrayList<>(Arrays.asList(5L, 7L, 11L, 14L, 48L, 293L, 15L, 28L, 35L));
    RemoveDuplicate removeDuplicateLongList = new RemoveDuplicate(longListDuplicated);
    assertEquals(longListNonDuplicated, removeDuplicateLongList.removeDuplicateKeepOriginalOrder());
  }

}

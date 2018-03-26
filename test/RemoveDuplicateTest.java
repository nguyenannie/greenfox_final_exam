import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class RemoveDuplicateTest {

  private List<Integer> integerListDuplicated = new ArrayList<>(Arrays.asList(4,6,4,7,8,10,11,1,6,7,5,7,8));
  private List<Integer> integerListNonDuplicated = new ArrayList<>(Arrays.asList(4, 6, 7, 8, 10, 11, 1, 5));
  private List<Integer> integerListNonDuplicatedNoOrder = new ArrayList<>(Arrays.asList(1, 4, 5, 6, 7, 8, 10, 11));
  private RemoveDuplicate removeDuplicateIntegerList = new RemoveDuplicate(integerListDuplicated);

  private List<Long> longListDuplicated = new ArrayList<>(Arrays.asList(5L,7L,11L,11L,14L,48L,293L,15L,11L,28L,35L));
  private List<Long> longListNonDuplicatedNoOrder = new ArrayList<>(Arrays.asList(48L, 35L, 5L, 293L, 7L, 11L, 28L, 14L, 15L));
  private List<Long> longListNonDuplicated = new ArrayList<>(Arrays.asList(5L, 7L, 11L, 14L, 48L, 293L, 15L, 28L, 35L));
  private RemoveDuplicate removeDuplicateLongList = new RemoveDuplicate(longListDuplicated);

  private List<Float> floatListDuplicate = new ArrayList<>(Arrays.asList(15.5f, 4.7f, 6f, 9f, 88f, 9f, 5f, 15.5f));
  private List<Float> floatListNonDuplicate = new ArrayList<>(Arrays.asList(15.5f, 4.7f, 6.0f, 9.0f, 88.0f, 5.0f));
  private List<Float> floatListNonDuplicateNoOrder = new ArrayList<>(Arrays.asList(4.7f, 6.0f, 9.0f, 88.0f, 5.0f, 15.5f));
  private RemoveDuplicate removeDuplicateFloatList = new RemoveDuplicate(floatListDuplicate);

  private List<Double> doubleListDuplicate = new ArrayList<>(Arrays.asList(45.6, 9.7, 35.6, 9.7, 45.6, 13.4, 14.6, 13.4));
  private List<Double> doubleListNonDuplicate = new ArrayList<>(Arrays.asList(45.6, 9.7, 35.6, 13.4, 14.6));
  private List<Double> doubleListNonDuplicateNoOrder = new ArrayList<>(Arrays.asList(9.7, 13.4, 45.6, 35.6, 14.6));
  private RemoveDuplicate removeDuplicateDoubleList = new RemoveDuplicate(doubleListDuplicate);

  private List<String> stringListDuplicate = new ArrayList<>(Arrays.asList());
  private List<String> stringListNonDuplicate = new ArrayList<>(Arrays.asList());
  private List<String> stringListNonDuplicateNoOrder = new ArrayList<>(Arrays.asList());
  private RemoveDuplicate removeDuplicateStringList = new RemoveDuplicate(stringListDuplicate);


  @Test
  public void removeDuplicate_IntegerList_DoNotKeepTheOriginalOrder_Test() {
    assertEquals(integerListNonDuplicatedNoOrder, removeDuplicateIntegerList.removeDuplicateDoNotKeepOriginalOrder());
  }

  @Test
  public void removeDuplicate_IntegerList_KeepTheOriginalOrder_Test() {
    assertEquals(integerListNonDuplicated, removeDuplicateIntegerList.removeDuplicateKeepOriginalOrder());
  }

  @Test
  public void removeDuplicate_IntegerList_UsingForLoop_Test() {
    assertEquals(integerListNonDuplicated, removeDuplicateIntegerList.removeDuplicateUsingForLoop());
  }

  @Test
  public void removeDuplicateEmptyList_ShouldReturnEmptyList_Test() {
    List<Integer> empty = new ArrayList<>();
    assertEquals(new ArrayList<Integer>(), new RemoveDuplicate(empty).removeDuplicateDoNotKeepOriginalOrder());
  }

  @Test
  public void removeDuplicateIntegerNullListTest() {
    List<Integer> nullList = null;
    assertEquals(null, new RemoveDuplicate(nullList).removeDuplicateDoNotKeepOriginalOrder());
  }

  @Test
  public void removeDuplicate_LongList_DoNotKeepTheOriginalOrder_Test() {
    assertEquals(longListNonDuplicatedNoOrder, removeDuplicateLongList.removeDuplicateDoNotKeepOriginalOrder());
  }

  @Test
  public void removeDuplicateLongList_KeepOriginalOrder_Test() {
    assertEquals(longListNonDuplicated, removeDuplicateLongList.removeDuplicateKeepOriginalOrder());
  }

  @Test
  public void removeDuplicateLongList_UsingForLoop_Test() {
    assertEquals(longListNonDuplicated, removeDuplicateLongList.removeDuplicateUsingForLoop());
  }

  @Test
  public void removeDuplicate_FloatList_DoNotKeepTheOriginalOrder_Test() {
    assertEquals(floatListNonDuplicateNoOrder, removeDuplicateFloatList.removeDuplicateDoNotKeepOriginalOrder());
  }

  @Test
  public void removeDuplicateFloatList_KeepOriginalOrder_Test() {
    assertEquals(floatListNonDuplicate, removeDuplicateFloatList.removeDuplicateKeepOriginalOrder());
  }

  @Test
  public void removeDuplicateFloatList_UsingForLoop_Test() {
    assertEquals(floatListNonDuplicate, removeDuplicateFloatList.removeDuplicateUsingForLoop());
  }

  @Test
  public void removeDuplicate_DoubleList_DoNotKeepTheOriginalOrder_Test() {
    assertEquals(doubleListNonDuplicateNoOrder, removeDuplicateDoubleList.removeDuplicateDoNotKeepOriginalOrder());
  }

  @Test
  public void removeDuplicateDoubleList_KeepOriginalOrder_Test() {
    assertEquals(doubleListNonDuplicate, removeDuplicateDoubleList.removeDuplicateKeepOriginalOrder());
  }

  @Test
  public void removeDuplicateDoubleList_UsingForLoop_Test() {
    assertEquals(doubleListNonDuplicate, removeDuplicateDoubleList.removeDuplicateUsingForLoop());
  }

  @Test
  public void removeDuplicate_StringList_DoNotKeepTheOriginalOrder_Test() {
    assertEquals(stringListNonDuplicateNoOrder, removeDuplicateStringList.removeDuplicateDoNotKeepOriginalOrder());
  }

  @Test
  public void removeDuplicateStringList_KeepOriginalOrder_Test() {
    assertEquals(stringListNonDuplicate, removeDuplicateStringList.removeDuplicateKeepOriginalOrder());
  }

  @Test
  public void removeDuplicateStringList_UsingForLoop_Test() {
    assertEquals(stringListNonDuplicate, removeDuplicateStringList.removeDuplicateUsingForLoop());
  }

}

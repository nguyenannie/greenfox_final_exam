import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate<T> {

  private List<T> duplicatedList;

  public RemoveDuplicate(List<T> duplicatedList) {
    this.duplicatedList = duplicatedList;
  }

  public List<T> removeDuplicateDoNotKeepOriginalOrder() {
    if (duplicatedList != null) {
      return new ArrayList<>(new HashSet<>(duplicatedList));
    }
    return null;
  }

  public List<T> removeDuplicateKeepOriginalOrder() {
    if (duplicatedList != null) {
      return duplicatedList.stream().distinct().collect(Collectors.toList());
    }
    return null;
  }

  public List<T> removeDuplicateUsingForLoop() {
    if (duplicatedList != null) {
      List<T> nonDuplicateList = new ArrayList<>();
      for (T aDuplicateList : duplicatedList) {
        if (!nonDuplicateList.contains(aDuplicateList)) {
          nonDuplicateList.add(aDuplicateList);
        }
      }
      return nonDuplicateList;
    }
    return null;
  }

  public List<T> getDuplicatedList() {
    return duplicatedList;
  }

  public void setDuplicatedList(List<T> duplicatedList) {
    this.duplicatedList = duplicatedList;
  }

}

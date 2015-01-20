package intermediate;

import static com.sandwich.koan.constant.KoanConstants.__;
import static com.sandwich.util.Assert.assertEquals;

import com.sandwich.koan.Koan;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class AboutAnnotations {

  @Retention(RetentionPolicy.RUNTIME)
  public @interface PublishedAuthor {}

  @Retention(RetentionPolicy.CLASS)
  public @interface StrugglingAuthor {}

  @PublishedAuthor
  class JKRowling {}

  @StrugglingAuthor
  class CharlesBigsby {}

  @Koan
  public void reflectionOnlyFindsAnnotationsWithRuntimeRetentionPolicies() {
    // Use this to find the PublishedAuthor annotation and assert against it
    // http://www.vogella.com/tutorials/JavaAnnotations/article.html#annotations_tutorial
    assertEquals(true, __);
  }
}

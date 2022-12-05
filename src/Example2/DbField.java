package Example2;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target(ElementType.FIELD)
@Inherited
public @interface DbField {
    String name();
    Class<?> type();
    boolean isPrimaryKey() default false;
}

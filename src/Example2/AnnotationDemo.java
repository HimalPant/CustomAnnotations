package Example2;

import java.lang.reflect.Field;
import java.util.Date;

public class AnnotationDemo {
    public static void main(String[] args) throws IllegalAccessException {
        System.out.println("Java custom annotation example");
        System.out.println();

        User user = new User();
        user.setName("Himal Pant");
        user.setId(12232);
        user.setEmail("himalpant12543@gmail.com");
        user.setCreated(new Date());

       for (Field field : user.getClass().getDeclaredFields()){
           DbField dbField = field.getAnnotation(DbField.class);

           System.out.println("field name: "+dbField.name());

           field.setAccessible(true);

           Object value = field.get(user);
           System.out.println("field value: "+ value);
           System.out.println("field type: "+ dbField.type() );
           System.out.println("is primary: "+ dbField.isPrimaryKey());
           System.out.println();
       }
    }
}

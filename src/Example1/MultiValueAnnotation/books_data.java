package Example1.MultiValueAnnotation;

public @interface books_data {
    String book_name() default "Java Programming";
    String author_name() default "James Gosling";
    int book_price() default 3000;
}

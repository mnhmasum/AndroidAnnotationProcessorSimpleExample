package example.annotation.androidtime.com.intent_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by nazmul on 3/7/18.
 */

@Retention(RetentionPolicy.CLASS)
@Target(value = ElementType.FIELD)
public @interface MyString {
}

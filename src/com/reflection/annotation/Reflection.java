package com.reflection.annotation;

import java.lang.annotation.Annotation;

public class Reflection {
  public static void main(String[] args) {

    Class aClass = MyClass.class;
    Annotation[] annotations = aClass.getAnnotations();

    for (Annotation annotation : annotations) {
      if (annotation instanceof MyAnnotation) {
        MyAnnotation myAnnotation = (MyAnnotation) annotation;
        System.out.println("name: " + myAnnotation.name());
        System.out.println("value: " + myAnnotation.value());
      }
    }
  }
}

/*
*
* name: someName
value: Hello World
*/
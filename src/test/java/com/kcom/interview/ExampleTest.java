package com.kcom.interview;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleTest {

  @Test
  public void exampleTestCase1() {

    //You will need to apply your tests here
    Assertions.assertSame("100", "100");
  }

  @Test
  public void exampleTestCase2() {

    //You will need to apply your tests here
    Assertions.assertEquals("100", "100");
  }

  @Test
  public void exampleTestCase3() {

    //You will need to apply your tests here
    Assertions.assertNotNull("", "");
  }

  @Test
  public void exampleTestCase4() {
    final String[] input1 = new String[]{"myString1", "myString2"};
    final String[] input2 = new String[]{"myString1", "myString2"};

    //You will need to apply your tests here
    Assertions.assertArrayEquals(input1, input2);
  }


}

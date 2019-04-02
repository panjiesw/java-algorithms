/*
 * Copyright (c) Panjie Setiawan Wicaksono.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.panjiesw.algorithms.test;

import java.util.Random;

public class TestUtils {
  public static int[] randomArrInt() {
    return randomArrInt(10);
  }

  public static int[] randomArrInt(int length) {
    Random random = new Random();
    return random.ints(0, 100).limit(length).toArray();
  }

  public static char[] randomArrChar() {
    return randomArrChar(10);
  }

  public static char[] randomArrChar(int length) {
    char[] arr = new char[length];
    Random random = new Random();
    for (int i = 0; i < length; i++) {
      arr[i] = (char) (random.nextInt(26) + 'a');
    }
    return arr;
  }
}

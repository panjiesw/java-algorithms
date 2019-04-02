/*
 * Copyright (c) Panjie Setiawan Wicaksono.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.panjiesw.algorithms.sorts;

import com.panjiesw.algorithms.test.TestUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class SortTest {
  @Test
  @DisplayName("Selection Sort: int")
  void selectionIntTest() {
    SelectionSort selectionSort = new SelectionSort();
    int[] test = TestUtils.randomArrInt();
    int[] expected = Arrays.copyOf(test, test.length);
    Arrays.sort(expected);
    assertThat(selectionSort.sort(Arrays.copyOf(test, test.length)))
      .isEqualTo(expected);
  }

  @Test
  @DisplayName("Selection Sort: char")
  void selectionCharTest() {
    SelectionSort selectionSort = new SelectionSort();
    char[] test = TestUtils.randomArrChar();
    char[] expected = Arrays.copyOf(test, test.length);
    Arrays.sort(expected);
    assertThat(selectionSort.sort(Arrays.copyOf(test, test.length)))
      .isEqualTo(expected);
  }
}

/*
 * Copyright (c) Panjie Setiawan Wicaksono.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.panjiesw.algorithms.sorts;

import static com.panjiesw.algorithms.sorts.SortUtils.less;
import static com.panjiesw.algorithms.sorts.SortUtils.swap;

@SuppressWarnings("Duplicates")
public class SelectionSort {
  public int[] sort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      int min = i;
      for (int j = i + 1; j < n; j++) {
        if (less(arr[j], arr[min])) {
          min = j;
        }
      }
      if (min != i) {
        swap(arr, i, min);
      }
    }
    return arr;
  }

  public char[] sort(char[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      int min = i;
      for (int j = i + 1; j < n; j++) {
        if (less(arr[j], arr[min])) {
          min = j;
        }
      }
      if (min != i) {
        swap(arr, i, min);
      }
    }
    return arr;
  }
}

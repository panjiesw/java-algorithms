/*
 * Copyright (c) Panjie Setiawan Wicaksono.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.panjiesw.algorithms.sorts;

public class SortUtils {
  public static boolean less(int a, int b) {
    return compare(a, b) < 0;
  }

  public static boolean less(char a, char b) {
    return compare(a, b) < 0;
  }

  public static void swap(int[] arr, int ia, int ib) {
    int a = arr[ia];
    arr[ia] = arr[ib];
    arr[ib] = a;
  }

  public static void swap(char[] arr, int ia, int ib) {
    char a = arr[ia];
    arr[ia] = arr[ib];
    arr[ib] = a;
  }

  private static int compare(int a, int b) {
    return a - b;
  }

  private static int compare(char a, char b) {
    return a - b;
  }
}

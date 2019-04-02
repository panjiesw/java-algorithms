/*
 * Copyright (c) Panjie Setiawan Wicaksono.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.panjiesw.algorithms.sorts;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.panjiesw.algorithms.sorts.SortUtils.less;
import static org.assertj.core.api.Assertions.assertThat;

class SortUtilsTest {

  @Test
  @DisplayName("Compare: int")
  void lessIntTest() {
    assertThat(less(1, 2)).isTrue();
    assertThat(less(-1, 0)).isTrue();
    assertThat(less(0, 0)).isFalse();
    assertThat(less(2, 1)).isFalse();
  }

  @Test
  @DisplayName("Compare: char")
  void lessCharTest() {
    assertThat(less('a', 'b')).isTrue();
    assertThat(less('c', 'z')).isTrue();
    assertThat(less('a', 'a')).isFalse();
    assertThat(less('z', 'z')).isFalse();
  }
}

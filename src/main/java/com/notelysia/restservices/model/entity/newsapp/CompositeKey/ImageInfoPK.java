/*
 * Copyright By @2dgirlismywaifu (2023) .
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.notelysia.restservices.model.entity.newsapp.CompositeKey;

import java.io.Serializable;
import java.util.Objects;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ImageInfoPK implements Serializable {
  private int imageId;
  private int sourceId;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof ImageInfoPK that)) return false;
    return this.getImageId() == that.getImageId() && this.getSourceId() == that.getSourceId();
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.getImageId(), this.getSourceId());
  }
}

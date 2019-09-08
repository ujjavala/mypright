package com.mypright.mypright.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDetail {

  private String detailName;

  private String reason;

  @Override
  public String toString() {
    return "{" +
        "detailName='" + detailName + '\'' +
        ", reason='" + reason + '\'' +
        '}';
  }
}

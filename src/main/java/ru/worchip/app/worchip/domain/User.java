package ru.worchip.app.worchip.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class User {

    private Integer age;
    private String firstName;
    private String lastName;
    private RoleChurch roleChurch;

}

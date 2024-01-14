package com.reactive.kafka.payload;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Author :  Ahmmed Jubayer Rumman
 * Created at : 14 Jan 2024
 */
@Getter
@Setter
@ToString
public class Student {

    private int id;
    private String firstName;
    private String lastName;
}

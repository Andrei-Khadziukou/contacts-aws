package com.epam.contacts.model;

import lombok.Data;

/**
 * Entity represents user.
 */
@Data
public class User {
    private String name;
    private String surname;
    private String phone;
}

package com.epam.constacts.handler.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The wrapper for responses to have single object for any kind of responses.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseWrapper<T> {
    private int status;
    private T payload;
}

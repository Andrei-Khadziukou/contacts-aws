package com.epam.constacts.handler.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The wrapper for requests to single object for any kind of requests.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestWrapper<T> {
    private Action action;
    private T payload;
}

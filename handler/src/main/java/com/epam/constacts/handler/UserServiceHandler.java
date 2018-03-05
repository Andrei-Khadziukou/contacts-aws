package com.epam.constacts.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.epam.constacts.handler.model.RequestWrapper;
import com.epam.constacts.handler.model.ResponseWrapper;
import org.apache.http.HttpStatus;

import java.util.Objects;

/**
 * The handler class to retrieve requests to users functionality.
 */
public class UserServiceHandler implements RequestHandler<RequestWrapper<?>, ResponseWrapper<?>> {
    @Override
    public ResponseWrapper<?> handleRequest(RequestWrapper<?> requestWrapper, Context context) {
        if (Objects.isNull(requestWrapper) || Objects.isNull(requestWrapper.getAction())) {
            return new ResponseWrapper<>(HttpStatus.SC_BAD_REQUEST,
                    "There is a problem with request: " + requestWrapper);
        }
        ResponseWrapper<?> responseWrapper;
        switch (requestWrapper.getAction()) {
            case CREATE:
                responseWrapper = new ResponseWrapper<>(HttpStatus.SC_CREATED, "Created");
                break;
            default:
                responseWrapper = new ResponseWrapper<>(HttpStatus.SC_BAD_REQUEST,
                        "Unsupported operation: " + requestWrapper.getAction());
                break;
        }
        return responseWrapper;
    }
}

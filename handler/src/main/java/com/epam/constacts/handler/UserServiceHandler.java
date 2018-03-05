package com.epam.constacts.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.epam.constacts.handler.model.RequestWrapper;
import com.epam.constacts.handler.model.ResponseWrapper;

/**
 * The handler class to retrieve requests to users functionality.
 */
public class UserServiceHandler implements RequestHandler<RequestWrapper, ResponseWrapper> {
    @Override
    public ResponseWrapper handleRequest(RequestWrapper requestWrapper, Context context) {
        return new ResponseWrapper();
    }
}

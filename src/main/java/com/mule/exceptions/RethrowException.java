package com.mule.exceptions;

import org.mule.api.MuleEvent;
import org.mule.api.exception.MessagingExceptionHandler;
import org.mule.exception.CatchMessagingExceptionStrategy;
import org.mule.message.DefaultExceptionPayload;

public class RethrowException extends CatchMessagingExceptionStrategy implements MessagingExceptionHandler{
	
	@Override
	protected MuleEvent afterRouting(Exception exception, MuleEvent event) {
	     event.getMessage().setExceptionPayload(new DefaultExceptionPayload(exception));
	     return event;
	}
}

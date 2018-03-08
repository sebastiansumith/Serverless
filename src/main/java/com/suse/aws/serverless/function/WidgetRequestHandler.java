package com.suse.aws.serverless.function;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.suse.aws.serverless.model.WidgetRequest;
import com.suse.aws.serverless.model.WidgetResponse;

public class WidgetRequestHandler implements RequestHandler<WidgetRequest, WidgetResponse>{

	@Override
	public WidgetResponse handleRequest(WidgetRequest input, Context context) {
		
		WidgetResponse widgetResponse = new WidgetResponse();
		widgetResponse.setId(input.getId());
		widgetResponse.setName(input.getName());
		return widgetResponse;
	}

}

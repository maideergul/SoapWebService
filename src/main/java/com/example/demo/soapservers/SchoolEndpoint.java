package com.example.demo.soapservers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import io.spring.guides.gs_producing_web_service.GetSchoolRequest;
import io.spring.guides.gs_producing_web_service.GetSchoolResponse;
import com.example.demo.repositories.*;

@Endpoint
public class SchoolEndpoint {
	private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

	private SchoolRepository schoolRepository;

	@Autowired
	public SchoolEndpoint(SchoolRepository schoolRepository) {
		this.schoolRepository = schoolRepository;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getSchoolRequest")
	@ResponsePayload
	public GetSchoolResponse getSchool(@RequestPayload GetSchoolRequest request) {
		GetSchoolResponse response = new GetSchoolResponse();
		response.setSchool(schoolRepository.findSchool(request.getName()));

		return response;
	}
}
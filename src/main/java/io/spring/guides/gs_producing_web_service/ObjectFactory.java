package io.spring.guides.gs_producing_web_service;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

    public ObjectFactory() {
    }

    public GetSchoolRequest createGetSchoolRequest() {
        return new GetSchoolRequest();
    }
   
    public GetCountryRequest createGetCountryRequest() {
        return new GetCountryRequest();
    }
   
    public GetSchoolResponse createGetSchoolResponse() {
        return new GetSchoolResponse();
    }
    
    public School createSchool() {
        return new School();
    }
   
    public GetCountryResponse createGetCountryResponse() {
        return new GetCountryResponse();
    }
   
    public Country createCountry() {
        return new Country();
    }

}
package io.spring.guides.gs_producing_web_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "school"
})

@XmlRootElement(name = "getSchoolResponse")
public class GetSchoolResponse {

    @XmlElement(required = true)
    protected School school;
   
    public School getSchool() {
        return school;
    }
  
    public void setSchool(School value) {
        this.school = value;
    }

}
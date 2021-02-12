package io.spring.guides.gs_producing_web_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "school", propOrder = {
    "name",
    "population",
    "address"
})
public class School {

    @XmlElement(required = true)
    protected String name;
    protected int population;
    @XmlElement(required = true)
    protected String address;
   
    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public int getPopulation() {
        return population;
    }
   
    public void setPopulation(int value) {
        this.population = value;
    }     
     
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String value) {
        this.address = value;
    }

}
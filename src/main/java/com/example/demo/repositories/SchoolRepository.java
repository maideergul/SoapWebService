package com.example.demo.repositories;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import io.spring.guides.gs_producing_web_service.School;

@Component
public class SchoolRepository {
	private static final Map<String, School> schools = new HashMap<>();

	@PostConstruct
	public void initData() {
		School sc1 = new School();
		sc1.setName("Beşiktaş High School");
		sc1.setPopulation(1000);
		sc1.setAddress("İstanbul / Beşiktaş");

		schools.put(sc1.getName(), sc1);

		School sc2 = new School();
		sc2.setName("Şişli Anatolian High School");
		sc2.setPopulation(2000);
		sc2.setAddress("İstanbul / Şişli");

		schools.put(sc2.getName(), sc2);

		School sc3 = new School();
		sc3.setName("Kadıköy High School");
		sc3.setPopulation(2000);
		sc3.setAddress("İstanbul / Kadıköy");

		schools.put(sc3.getName(), sc3);

	}

	public School findSchool(String name) {
		Assert.notNull(name, "The school's name must not be null");
		return schools.get(name);
	}

}
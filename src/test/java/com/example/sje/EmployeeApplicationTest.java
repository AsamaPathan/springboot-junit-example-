package com.example.sje;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
@TestInstance(Lifecycle.PER_CLASS)
public class EmployeeApplicationTest extends SpringbootJunitExampleApplicationTests{
	@Autowired
	private WebApplicationContext wac;
	
	private MockMvc mc;
	
	@BeforeAll
	public void setup() {
		mc=MockMvcBuilders.webAppContextSetup(wac).build();
	}
	
	@Test
	public void testemployee() throws Exception{
		mc.perform(get("/employee"))
		.andExpect(jsonPath("$.name").value("Ashwini Gunti")).andExpect(jsonPath("$.designation").value("SSE"))
		.andExpect(jsonPath("$.empId").value(103051)).andExpect(jsonPath("$.salary").value(150000));

}

	}



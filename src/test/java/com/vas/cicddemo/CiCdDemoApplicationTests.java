package com.vas.cicddemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest
class CiCdDemoApplicationTests {

	@Autowired
	MockMvc mockMvc;

	@Test
	public void testGreetingsEndpoint() throws Exception {

		String name = "Vaibhav Anand Sharma";

		mockMvc.perform(MockMvcRequestBuilders.get("/greetings/{name}", name))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().string("Hi "  +name+ " welcome to the CI/CD demo project with jenkins."));
	}

}

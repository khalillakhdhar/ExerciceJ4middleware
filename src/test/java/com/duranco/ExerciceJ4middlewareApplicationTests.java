package com.duranco;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.duranco.controller.Premier;

@SpringBootTest
class ExerciceJ4middlewareApplicationTests {
Premier p;
@BeforeEach // before =>JU4
public void init()
{
p=new Premier(7);	
}
	@Test
	void contextLoads() {
	}
	
	@Test
	public void testPremier()
	{
		assertEquals("premier", p.premier());
	}
}

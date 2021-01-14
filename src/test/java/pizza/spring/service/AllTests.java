package pizza.spring.service;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CommandeDtoTest.class, CommandeServiceTest.class, PizzaServiceTest.class, RapportServiceTest.class })
public class AllTests {

}

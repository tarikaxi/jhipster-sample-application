package ma.iam.wissal.cucumber;

import io.cucumber.spring.CucumberContextConfiguration;
import ma.iam.wissal.IntegrationTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@IntegrationTest
@WebAppConfiguration
public class CucumberTestContextConfiguration {}

package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BookApplication {

  @RequestMapping(value = "/available")
  public String available() {
    return "Routing and Filtering using Netflix Zuul";
  }

  @RequestMapping(value = "/checked-out")
  public String checkedOut() {
    return "Routing and Filtering using Netflix Zuul";
  }

  public static void main(String[] args) {
    SpringApplication.run(BookApplication.class, args);
  }
}

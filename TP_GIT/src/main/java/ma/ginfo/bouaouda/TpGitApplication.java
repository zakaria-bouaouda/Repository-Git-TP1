package ma.ginfo.bouaouda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TpGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(TpGitApplication.class, args);
		System.out.println("c'est une modification par le developpeur, dans une nouvelle branche");
	}

}

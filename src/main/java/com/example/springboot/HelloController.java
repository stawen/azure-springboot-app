package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.DriverManager;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

@RestController
public class HelloController {

	static DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyy-MM-dd'T'HH-mm-ss.SSSS'Z'");
	private static ZoneId UTC = ZoneId.of("UTC");	

	
	@GetMapping("/")
	public String index() {
		
		String txt = "Demo Cloud APP - V2.2";
		String now = dateFormatter.format(OffsetDateTime.now(UTC));
		
		Map<String, String> env = System.getenv();
		String check = env.get("CHECK)"
		
		String response = now + " - " + txt + " " + check;

		System.out.println(response);
		return "<html>"
				+"<body style='background-color:#008000;'>" // 38B2E4 blue // #008000;Green
				+"		<font size='16' color='#ffffff'>"
				+ txt
				+ check
				+"		</font>"
				+"	</body>"
				+"</html>";
		
	}

	@GetMapping("/health")
	public String health() {
		
		String txt = "Health OK";
	
		System.out.println(txt);
		return txt;
		
	}


}

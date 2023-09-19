package com.example.demo;

import com.example.demo.model_object.Pwd;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@PostMapping("/pwd")
	public ResponseEntity<Pwd> createPwd(@RequestBody Pwd pwd) {
		Pwd responsePwd = new Pwd();
		responsePwd.setPwd("fg"+pwd.getPwd()+"cxv");
		return ResponseEntity.ok(responsePwd);
	}
}
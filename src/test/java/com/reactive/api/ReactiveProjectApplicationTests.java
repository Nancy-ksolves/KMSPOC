package com.reactive.api;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;

@SpringBootTest
class ReactiveProjectApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void workingWithMono(){
      // Mono----> publisher that have 0...1 element
		Mono<String> str=Mono.just("Learn");
	}

}

package dev.be.moduleadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(
		scanBasePackages = {"dev.be.moduleadmin", "dev.be.modulecommon"}
)
@EntityScan("dev.be.modulecommon.domain") // 엔티티 패키지 지정
@EnableJpaRepositories(basePackages = "dev.be.modulecommon.repositories") // 리포지토리 패키지 지정
public class ModuleAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModuleAdminApplication.class, args);
    }

}

package meeting.meetingv1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@MapperScan(value = "meeting.meetingv1.mapper")
@SpringBootApplication
@EnableCaching
public class MettingV1Application {

    public static void main(String[] args) {
        SpringApplication.run(MettingV1Application.class, args);
    }

}

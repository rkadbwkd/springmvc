package hello.springmvc;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// @Controller -->> VIEW 반환
@RestController // String 반환가능
@Slf4j
public class LogTestController {

//    private final Logger log = LoggerFactory.getLogger(LogTestController.class);

    @RequestMapping("log-test")
    public String logTest() {
        String name = "Spring";

        log.info("info log"+name); // 안됨
        // 자바는 .info Method를 호출하기전에 매개변수를 먼저 더함 -->> 연산이 일어남
        
        // 이런 방식이 있었는데, 안씀
        if(log.isDebugEnabled()){
            log.debug("debug log={}", name); // 안나옴    
        }
        
        log.trace("trace log={}", name); // 안나옴
        log.debug("debug log={}", name); // 안나옴

        log.info("info log = {}",name);
        log.warn("warn log={}", name);
        log.error("error log = {}",name);

        return name;
    }
}

package com.sg.herokufirstproject;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping({"/hello"})
public class HelloController {
        
    public HelloController() {
    }
    
    @RequestMapping(value="/sayhi", method=RequestMethod.GET)
    public String sayHi(Map<String, Object> model) {
        model.put("message", "Hello from the controller" );
        return "hello";
    }
    
    @RequestMapping(value="/nameGreeting", method=RequestMethod.POST)
    public String nameGreeting(HttpServletRequest req, Map<String, Object> model){
        String name =
                req.getParameter("name");
        
        model.put("name", name);
        
        return "result";
    }
}

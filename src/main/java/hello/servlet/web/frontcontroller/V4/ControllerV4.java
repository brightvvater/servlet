package hello.servlet.web.frontcontroller.V4;

import com.sun.jdi.ObjectCollectedException;

import java.util.Map;

public interface ControllerV4 {

    /*
    * @param paramMap
    * @param model
    * @return viewName
    * */
    String process(Map<String, String> paramMap, Map<String, Object> model);


}

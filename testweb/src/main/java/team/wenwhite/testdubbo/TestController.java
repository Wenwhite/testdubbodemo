package team.wenwhite.testdubbo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ProjectName: testdubbodemo
 * @Package: team.wenwhite.testdubbo
 * @ClassName: TestController
 * @Author: wenbai
 * @Description: ${description}
 * @Date: 2019/10/10 10:47
 * @Version: 1.0
 */
@RestController
public class TestController {

    // 这里应该声明一个service，但service最终会变成一个web项目，也就是无法直接依赖，但是此处任然需要声明对象
    // 解决方法，将service的接口声明和具体实现进行拆分
    // 如何拆分？将service创建为一个jar包形式的项目。因为不仅仅controller会用到 service具体实现也会用到

    @Resource
    private TestService service;


    @RequestMapping("/getData")
    @ResponseBody
    public String getData(String name) {
        String data = service.getData(name);
        return data;
    }

}

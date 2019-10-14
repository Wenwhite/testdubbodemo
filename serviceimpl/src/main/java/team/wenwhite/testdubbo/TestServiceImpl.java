package team.wenwhite.testdubbo;

import org.springframework.stereotype.Service;

/**
 * @ProjectName: testdubbodemo
 * @Package: team.wenwhite.testdubbo
 * @ClassName: TestServiceImpl
 * @Author: wenbai
 * @Description: ${description}
 * @Date: 2019/10/10 11:17
 * @Version: 1.0
 */
@Service("testServiceImpl")
public class TestServiceImpl implements TestService {


    @Override
    public String getData(String name) {
        return "你传递的数据是：" + name;
    }
}

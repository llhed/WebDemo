import me.lim.model.User;
import me.lim.service.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by lim on 2015/8/26.
 */
public class UserTest {

    private UserService userService;

    @Before
    public void before(){
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:conf/spring.xml"
                ,"classpath:conf/spring-mybatis.xml"});
        userService = (UserService) context.getBean("userServiceImpl");
    }

    @Test
    public void addUser(){
        User user = new User();
        user.setNickname("hello");
        user.setState(2);
        System.out.println(userService.insertUser(user));
    }

    @Test
    public void findUser(){

        System.out.println(userService.findUser(2).getNickname());
    }

    @Test
    public void findAllUser(){
        List<User> usrList = userService.findAllUser();
        for(User user : usrList){
            System.out.println(user.getNickname());
        }
    }

    @Test
    public void delUser(){
        userService.delUser(2);
    }
}


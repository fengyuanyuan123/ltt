package cn.it.dao;

import cn.it.model.User;
import org.springframework.stereotype.Component;




@Component
public interface IUserDao {
    User selectUser(long id);
}

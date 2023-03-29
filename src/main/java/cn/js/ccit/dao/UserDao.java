package cn.js.ccit.dao;

import cn.js.ccit.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDao {
    public User getById(Integer id);
}

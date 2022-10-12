package com.crudapp.serviceImpl;

import com.crudapp.entity.UserEntity;
import com.crudapp.model.User;
import com.crudapp.repository.UserRepo;
import com.crudapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepo userRepo;

    @Override
    public Integer insert(User user) {
            UserEntity userEntity = new UserEntity();
            userEntity.setName(user.getUserName());
            userRepo.save(userEntity);
            return userEntity.getId();
    }
    @Override
    public List<User> getUsers() {
        List<User> userList = new ArrayList<>();
        List<UserEntity> list = userRepo.findAll(Sort.by(Sort.Order.asc("id")));
        if(list!=null && list.size()>0)
        {
            for(UserEntity ue:list)
            {
                userList.add(new User(ue.getId(),ue.getName()));
            }
        }
        return userList;
    }
    @Override
    public User getUserById(Integer id) {

        UserEntity userEntity = userRepo.getById(id);
        User user=new User(userEntity.getId(),userEntity.getName());

        return user;

    }


    @Override
    public Integer updateUser(User user) {

            UserEntity userEntity = new UserEntity();
            userEntity.setId(user.getId());
            userEntity.setName(user.getUserName());

            userRepo.save(userEntity);

            return userEntity.getId();
    }


    @Override
    public Integer deleteUser(Integer id){
        UserEntity userEntity = new UserEntity();
        userEntity.setId(id);
        userRepo.deleteById(userEntity.getId());
        return userEntity.getId();
    }
}




